import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    //animation sprite variables
    GreenfootImage[] idlePlayerRight = new GreenfootImage[4];
    GreenfootImage[] idlePlayerLeft = new GreenfootImage[4];
    GreenfootImage[] movePlayerRight = new GreenfootImage[16];
    GreenfootImage[] movePlayerLeft = new GreenfootImage[16];
    
    //change which side character is facing based on input
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    
    //all variables
    int numOfCoins = 0;
    static boolean isDying = false; 
    int walkIndex = 0;
    int idleIndex = 0;
    static final int GRAVITY = 1;
    static final int JUMP_FORCE = 11;
    int xSpeed = 3;
    int ySpeed = 0;
    int numOfDeaths = 0;
    boolean dying = false;
    SimpleTimer deathTimer = new SimpleTimer();
    static final int DEATH_DELAY = 500;
    GreenfootImage[] idleDeadRight = new GreenfootImage[4];
    GreenfootImage[] idleDeadLeft = new GreenfootImage[4];
    boolean touchingWater = false;
    boolean jumpKeyHeld = false;
    
    //constructor for animation
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
    
    //animate player based off of input
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
    
    //move function for underwater
    private void swimMove()
    {
        int speed = 1;
        int dx = 0;
        int dy = 0;
        
        //boolean verticalInput = false;
        
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
        if(Greenfoot.isKeyDown("up")||Greenfoot.isKeyDown("w")||Greenfoot.isKeyDown("space"))
        {
            dy--;
            //verticalInput = true;
        }
        if(Greenfoot.isKeyDown("down")||Greenfoot.isKeyDown("s")||Greenfoot.isKeyDown("shift"))
        {
            dy++;
            //verticalInput = true;
        }
        
        //if(!verticalInput) dy += 1;
        
        setLocation(getX() + dx * speed, getY());
        while(isTouching(platforms1.class) ||isTouching(platforms2.class)) setLocation(getX() - dx, getY());
        
        setLocation(getX(), getY() + dy * speed);
        while(isTouching(platforms1.class) ||isTouching(platforms2.class)) setLocation(getX(), getY() - dy);
    }

    //horizontal movement function
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
    
    //vertical movement function
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
        boolean jumpPressed =Greenfoot.isKeyDown("up")|| Greenfoot.isKeyDown("w")|| Greenfoot.isKeyDown("space");

        if (onGround && jumpPressed && !jumpKeyHeld)
        {
            ySpeed = -JUMP_FORCE;
            Greenfoot.playSound("jump.mp3");
        }

        jumpKeyHeld = jumpPressed;
    }
    
    //teleport to new world if touching a portal
    public void teleport()
    {
        if(!isTouching(Portal.class)) return;
        
        World current = getWorld();
        Player player = this;
        Coin.saveCoinCount();
        if (current instanceof World1)
        {
            ((World1) current).stopMusic();
            Greenfoot.setWorld(new World2(player));
        }
        else if (current instanceof World2)
        {
            ((World2) current).stopMusic();
            Greenfoot.setWorld(new World3(player));
        }
        else if (current instanceof World3)
        {
            ((World3) current).stopMusic();
            Greenfoot.setWorld(new World4(player));
        }
        else if (current instanceof World4)
        {
            ((World4) current).stopMusic();
            Greenfoot.setWorld(new World5(player));
        }
        else if (current instanceof World5)
        {
            ((World5) current).stopMusic();
            Greenfoot.setWorld(new FinalWorld(player));
        }
    }
    //teleport back to the spawn point if touching the void(not a death)
    private void checkVoid()
    {
        if(isTouching(theVoid.class))
        {
            SpawnPoint spawn = (SpawnPoint) getWorld().getObjects(SpawnPoint.class).get(0);
            setLocation(spawn.getX(), spawn.getY());
            ySpeed = 0;
        }
        
    }
    
    //collect coin if touching one
    private void collectCoin()
    {
        Coin coin = (Coin) getOneIntersectingObject(Coin.class);
        if (coin != null)
        {
            Greenfoot.playSound("coin.mp3");
            coin.collect();
        }
    }
    
    //kill character if touching a spike
    private void checkSpike()
    {
        if(dying) return;
        if(isTouching(Spike.class)||isTouching(SpikeR.class))
        {
            dying = true;
            deathTimer.mark();
            ySpeed = 0;
            
            int frame = (idleIndex - 1 + idleDeadRight.length) % idleDeadRight.length;
            
            if(facing.equals("right")) setImage(idleDeadRight[frame]);
            else setImage(idleDeadLeft[frame]);
        }
    }
    
    //change to swimming if character touching water
    private void checkWater()
    {
        boolean nowTouching = isTouching(Water.class);
        
        if(touchingWater && !nowTouching) ySpeed = -8;
        touchingWater = nowTouching;
    }
    
    //check death status for other classes
    public static boolean getDeath(){
        return isDying;
    }
    //animate character on death, reset coins and respawn on death
    private void handleDeath()
    {
        if(!dying) {
            isDying = false;
            return;
        }
        isDying = true;
        numOfCoins = Coin.savedCoins();
        Coin.resetCheckpoint();
        Greenfoot.playSound("death.mp3");
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
    public void act()
    {
        checkWater();
        //move character based off current conditions and touching classes
        if(!dying)
        {
            if(touchingWater){
                swimMove();
                ySpeed = 0;
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
        
        numOfCoins = Coin.coinCount();
        checkSpike();
        handleDeath();
        //show coin counter/stats depending on world
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
}
