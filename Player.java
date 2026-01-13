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
    
    int numOfCoins = 0;
    static boolean isDying = false; 
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
        
        for(int i = 0; i < idleDeadRight.length; i++)
        {
            idleDeadRight[i] = new GreenfootImage("images/idle_knight_dead/idleknight" + i + ".png");
            idleDeadRight[i].scale(16, 16);
        }   
        
        for(int i = 0; i < idleDeadLeft.length; i++)
        {
            idleDeadLeft[i] = new GreenfootImage("images/idle_knight_dead/idleknight" + i + ".png");
            idleDeadLeft[i].mirrorHorizontally();
            idleDeadLeft[i].scale(16, 16);
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
            idleIndex = 0;
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
            walkIndex = 0;
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
    int numOfDeaths = 0;
    public void act()
    {
        if(!dying)
        {
            if(touchingWater){
                swimMove();
            }
            else{
                moveHorizontal();
                moveVertically(); 
            }
            animatePlayer();
            teleport();
            collectCoin();
            checkVoid();
        }
        checkWater();
        numOfCoins = Coin.coinCount();
        checkSpike();
        handleDeath();
        if(getWorld() instanceof FinalWorld){
            getWorld().showText("Congratulations for beating the game!", 200, 30);
            getWorld().showText("Stats: ", 200, 64);
            getWorld().showText("Coins Collected: " + numOfCoins + "/15", 200, 100);
            getWorld().showText("Deaths: "+numOfDeaths, 200, 130);
        }
        else{
            getWorld().showText("Coins: " + numOfCoins, getWorld().getWidth() - 60, 8);
        }
    }
    private double swimVX = 0;
    private double swimVY = 0;
    private double swimAccel = 0.25; 
    private double swimMax = 3.0;  
    private double swimDrag = 0.90;
    private double buoyancy = 0.05;
    int stepX = (int) Math.signum(swimVX);
    int stepY = (int) Math.signum(swimVY);
    
    private void swimMove()
    {
        int worldWidth = getWorld().getWidth();
        int worldHeight = getWorld().getHeight();
        int myWidth = getImage().getWidth();
        int myHeight = getImage().getHeight();
        int stepX = (int) Math.signum(swimVX);
        int stepY = (int) Math.signum(swimVY);
        // input keys
        if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a"))
        {
            facing = "left";
            swimVX -= swimAccel;
        }
        if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d"))
        {
            facing = "right";
            swimVX += swimAccel;
        }
        if (Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w"))
        {
            swimVY -= swimAccel;
        }
        if (Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s"))
        {
            swimVY += swimAccel;
        }
    
        // add bouyancy
        swimVY += buoyancy;
    
        // prevent speed from going too high
        if (swimVX > swimMax) swimVX = swimMax;
        if (swimVX < -swimMax) swimVX = -swimMax;
        if (swimVY > swimMax) swimVY = swimMax;
        if (swimVY < -swimMax) swimVY = -swimMax;
    
        // add drag to speed
        swimVX *= swimDrag;
        swimVY *= swimDrag;
    
        setLocation((int)(getX() + swimVX), getY());

        if (isTouching(platforms1.class) || isTouching(platforms2.class)) {
            setLocation(getX() - (int)Math.signum(swimVX), getY());
            swimVX = 0;
        }
        
        setLocation(getX(), (int)(getY() + swimVY));
        
        if (isTouching(platforms1.class) || isTouching(platforms2.class)) {
            setLocation(getX(), getY() - (int)Math.signum(swimVY));
            swimVY = 0;
        }
        
        if (getX() < myWidth / 2)
        {
            setLocation(myWidth / 2, getY());
            swimVX = 0;
        }
        if (getX() > worldWidth - myWidth / 2)
        {
            setLocation(worldWidth - myWidth / 2, getY());
            swimVX = 0;
        }
        if (getY() < myHeight / 2)
        {
            setLocation(getX(), myHeight / 2);
            swimVY = 0;
        }
        if (getY() > worldHeight - myHeight / 2)
        {
            setLocation(getX(), worldHeight - myHeight / 2);
            swimVY = 0;
        }
    
        
        /*if (isTouching(platforms1.class) || isTouching(platforms2.class)) {
            setLocation(getX() - stepX, getY());
            swimVX = 0;
        }
        
        if (isTouching(platforms1.class) || isTouching(platforms2.class)) {
            setLocation(getX(), getY() - stepY);
            swimVY = 0;
        }*/
    }

    private void moveHorizontal()
    {
        int worldWidth = getWorld().getWidth();
        int myWidth = getImage().getWidth();
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
        while(getOneIntersectingObject(platforms1.class) != null||getOneIntersectingObject(platforms2.class) != null) setLocation(getX() - dx, getY());
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
        Coin.saveCoinCount();
        if (current instanceof World1)
        {
            Greenfoot.setWorld(new World2(player));
        }
        else if (current instanceof World2)
        {
            Greenfoot.setWorld(new FinalWorld(player));
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
            Greenfoot.setWorld(new FinalWorld(player));
        }
    }
    private void checkVoid()
    {
        if(isTouching(theVoid.class))
        {
            SpawnPoint spawn = (SpawnPoint) getWorld().getObjects(SpawnPoint.class).get(0);
            setLocation(spawn.getX(), spawn.getY());
            ySpeed = 0;
        }
        
    }
    private void collectCoin()
    {
        Coin coin = (Coin) getOneIntersectingObject(Coin.class);
        if (coin != null)
        {
            coin.collect();
        }
    }
    boolean dying = false;
    SimpleTimer deathTimer = new SimpleTimer();
    static final int DEATH_DELAY = 500;
    GreenfootImage[] idleDeadRight = new GreenfootImage[4];
    GreenfootImage[] idleDeadLeft = new GreenfootImage[4];
    
    private void checkSpike()
    {
        if(dying) return;
        if(isTouching(Spike.class))
        {
            dying = true;
            deathTimer.mark();
            ySpeed = 0;
            
            int frame = (idleIndex - 1 + idleDeadRight.length) % idleDeadRight.length;
            
            if(facing.equals("right")) setImage(idleDeadRight[frame]);
            else setImage(idleDeadLeft[frame]);
        }
    }
    boolean touchingWater = false;
    private void checkWater()
    {
        if(isTouching(Water.class))
        {
            touchingWater= true;
        }
        else{
            touchingWater = false;
        }
    }
    
    public static boolean getDeath(){
        return isDying;
    }
    private void handleDeath()
    {
        if(!dying) {
            isDying = false;
            return;
        }
        isDying = true;
        numOfCoins = Coin.savedCoins();
        Coin.resetCheckpoint();
        if(deathTimer.millisElapsed() >= DEATH_DELAY)
        {
            SpawnPoint spawn = (SpawnPoint) getWorld().getObjects(SpawnPoint.class).get(0);
            setLocation(spawn.getX(), spawn.getY());
            ySpeed = 0;
            dying = false;
            
            idleIndex = 0;
            walkIndex = 0;
            animationTimer.mark();
            numOfDeaths++;
            if(facing.equals("right"))setImage(idlePlayerRight[0]);
            else setImage(idlePlayerLeft[0]);
        }
    }
}
