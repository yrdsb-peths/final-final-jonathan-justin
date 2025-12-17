import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    GreenfootImage[] idlePlayer = new GreenfootImage[4];
    GreenfootImage[] movePlayerRight = new GreenfootImage[16];
    GreenfootImage[] movePlayerLeft = new GreenfootImage[16];
    
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Player()
    {  
        for(int i = 0; i < movePlayerRight.length; i++)
        {
            movePlayerRight[i] = new GreenfootImage("images/knight/knight" + i + ".png");
            movePlayerRight[i].scale(50, 50);
        }
        
        for(int i = 0; i < movePlayerLeft.length; i++)
        {
            movePlayerLeft[i] = new GreenfootImage("images/knight/knight" + i + ".png");
            movePlayerLeft[i].mirrorHorizontally();
            movePlayerLeft[i].scale(50, 50);
        }
        
        animationTimer.mark();
        
        setImage(movePlayerRight[0]);
    }
    
    int imageIndex = 0;
    public void animatePlayer()
    {
        if(animationTimer.millisElapsed()<100)
        {
            return;
        }
        animationTimer.mark();
        
        if(facing.equals("right"))
        {
            setImage(movePlayerRight[imageIndex]);
            imageIndex = (imageIndex + 1) % movePlayerRight.length;
        }
        else
        {
            setImage(movePlayerLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % movePlayerLeft.length;
        }
    }
    
    static final int GRAVITY = 2;
    static final int JUMP_FORCE = 30;
    int xSpeed = 4;
    int ySpeed = 0;
    public void act()
    {
        moveHorizontal();
        moveVertically();
        
        animatePlayer();
    }
    
    private void moveHorizontal()
    {
        int worldWidth = getWorld().getWidth();
        int myWidth = getImage().getHeight();
        int dx = 0;
        
        if(Greenfoot.isKeyDown("left"))
        {
            facing = "left";
            dx--;
        }
        if(Greenfoot.isKeyDown("right"))
        {
            facing = "right";
            dx++;
        }
        
        setLocation(getX() + dx * xSpeed, getY());
        if(getX() < myWidth/2) setLocation(myWidth/2, getY());
        if(getX() > worldWidth-myWidth/2) setLocation(worldWidth - myWidth/2, getY());
        while(getOneIntersectingObject(null) != null) setLocation(getX() - dx, getY());
    }
    
    private void moveVertically()
    {
        int worldHeight = getWorld().getHeight();
        int myHeight = getImage().getHeight();
        boolean onGround = false;
        
        ySpeed += GRAVITY;
        setLocation(getX(), getY() + ySpeed);
        
        if(getY() > worldHeight - myHeight / 2)
        {
            setLocation(getX(), worldHeight - myHeight / 2);
            ySpeed = 0;
            onGround = true;
        }
        int dy = (int)Math.signum(ySpeed);
        while(getOneIntersectingObject(null) != null)
        {
            setLocation(getX(), getY() - dy);
            if(dy > 0) onGround = true;
            ySpeed = 0;
        }
        if (onGround && Greenfoot.isKeyDown("up")) ySpeed = -JUMP_FORCE;
    }
}
