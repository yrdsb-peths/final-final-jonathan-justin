import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    GreenfootImage[] idlePlayerRight = new GreenfootImage[4];
    GreenfootImage[] idlePlayerLeft = new GreenfootImage[4];
    GreenfootImage[] movePlayerRight = new GreenfootImage[16];
    GreenfootImage[] movePlayerLeft = new GreenfootImage[16];
    
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Player()
    {  
        for(int i = 0; i < movePlayerRight.length; i++)
        {
            movePlayerRight[i] = new GreenfootImage("images/knight/knight" + i + ".png");
            movePlayerRight[i].scale(16, 16);
        }
        
        for(int i = 0; i < movePlayerLeft.length; i++)
        {
            movePlayerLeft[i] = new GreenfootImage("images/knight/knight" + i + ".png");
            movePlayerLeft[i].mirrorHorizontally();
            movePlayerLeft[i].scale(16, 16);
        }
        
        for(int i = 0; i < idlePlayerRight.length; i++)
        {
            idlePlayerRight[i] = new GreenfootImage("images/idle_knight/idleknight" + i + ".png");
            idlePlayerRight[i].scale(16, 16);
        }
        
        for(int i = 0; i < idlePlayerLeft.length; i++)
        {
            idlePlayerLeft[i] = new GreenfootImage("images/idle_knight/idleknight" + i + ".png");
            idlePlayerLeft[i].mirrorHorizontally();
            idlePlayerLeft[i].scale(16, 16);
        }
        animationTimer.mark();
        
        setImage(idlePlayerRight[0]);
    }
    
    int walkIndex = 0;
    int idleIndex = 0;
    public void animatePlayer()
    {
        if(animationTimer.millisElapsed()<100) return;
        animationTimer.mark();
        
        boolean moving = Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("left");
        if (moving)
        {
            if(facing.equals("right"))
            {
                setImage(movePlayerRight[walkIndex]);
            }
            else
            {
                setImage(movePlayerLeft[walkIndex]);
            }
            walkIndex = (walkIndex + 1) % movePlayerRight.length;
        }
        else
        {
            if(facing.equals("right"))
            {
                setImage(idlePlayerRight[idleIndex]);
            }
            else
            {
                setImage(idlePlayerLeft[idleIndex]);
            }
            idleIndex = (idleIndex + 1) % idlePlayerRight.length;
        }
    }
    
    static final int GRAVITY = 1;
    static final int JUMP_FORCE = 11;
    int xSpeed = 3;
    int ySpeed = 0;
    public void act()
    {
        moveHorizontal();
        moveVertically();
        animatePlayer();
        teleport();
    }
    
    private void moveHorizontal()
    {
        int worldWidth = getWorld().getWidth();
        int myWidth = getImage().getHeight();
        int dx = 0;
        
        if(Greenfoot.isKeyDown("left")||Greenfoot.isKeyDown("a"))
        {
            facing = "left";
            dx--;
        }
        if(Greenfoot.isKeyDown("right")||Greenfoot.isKeyDown("d"))
        {
            facing = "right";
            dx++;
        }
        
        setLocation(getX() + dx * xSpeed, getY());
        if(getX() < myWidth/2) setLocation(myWidth/2, getY());
        if(getX() > worldWidth-myWidth/2) setLocation(worldWidth - myWidth/2, getY());
        while(getOneIntersectingObject(platforms1.class) != null||getOneIntersectingObject(platforms2.class) != null) setLocation(getX() - dx, getY() - 1);
    }
    
    private void moveVertically()
    {
        int worldHeight = getWorld().getHeight();
        int myHeight = getImage().getHeight();
        boolean onGround = false;
        
        ySpeed += GRAVITY;
        setLocation(getX(), getY() + ySpeed);
        
        Actor platform;
        if((platform = getOneIntersectingObject(platforms1.class))!=null||(platform = getOneIntersectingObject(platforms2.class))!=null)
        {
            if(ySpeed > 0)
            {
                setLocation(getX(), platform.getY()-platform.getImage().getHeight()/2-myHeight/2);
                onGround = true;
            }
            else if (ySpeed < 0)
            {
                setLocation(getX(), platform.getY()+platform.getImage().getHeight()/2+myHeight/2);
    
            }
            ySpeed = 0;
        }
        if (onGround && (Greenfoot.isKeyDown("up")||Greenfoot.isKeyDown("w")||Greenfoot.isKeyDown("space"))) ySpeed = -JUMP_FORCE;
    }
    
    public void teleport()
    {
        if(!isTouching(Portal.class)) return;
        
        World current = getWorld();
        Player player = this;
        
        if (current instanceof World1)
        {
            Greenfoot.setWorld(new World2(player));
        }
        else if (current instanceof World2)
        {
            Greenfoot.setWorld(new World3(player));
        }
        else if (current instanceof World3)
        {
            Greenfoot.setWorld(new World4(player));
        }
        else if (current instanceof World4)
        {
            Greenfoot.setWorld(new World5(player));
        }
        else if (current instanceof World5)
        {
            Greenfoot.setWorld(new congradulations());
        }
    }
}
