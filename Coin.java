import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Actor
{
    //sprite variables
    SimpleTimer animationTimer = new SimpleTimer();
    GreenfootImage[] coin = new GreenfootImage[10];
    
    //necessary variables
    double velocityY = 0;
    double gravity = 1;
    boolean collected = false;
    int lifeTimer = 30;
    static int numOfCoins=0;
    boolean visibleOnStart;
    static int previousCoins = 0;
    int coinIndex = 0;
    
    //contructor with option to make invisible
    public Coin(boolean visibleOnStart)
    {
        this.visibleOnStart = visibleOnStart;
        
        for(int i = 0; i < coin.length; i++)
        {
            coin[i] = new GreenfootImage("images/spinning_coin/coin" + i + ".png");
            coin[i].scale(20, 20);
        }
        animationTimer.mark();
        
        setImage(coin[0]);
        
        if(!visibleOnStart)getImage().setTransparency(0);
    }
    
    
    //animate the coin
    public void animateCoin()
    {
        // Add your action code here.
        if(animationTimer.millisElapsed()<100) return;
        animationTimer.mark();
        
        int currentTransparency = getImage().getTransparency();
        
        setImage(coin[coinIndex]);
        coinIndex = (coinIndex + 1) % coin.length;
        
        getImage().setTransparency(currentTransparency);
    }
    //function to keep track of coins saved(after portal) and current coins from the world
    public static void saveCoinCount(){
        previousCoins = numOfCoins;
    }
    public static int savedCoins(){
        return previousCoins;
    }
    public static int coinCount(){
        return numOfCoins;
    }
    public static void reset(){
        numOfCoins = 0;
    }
    public static void resetCheckpoint(){
        numOfCoins = previousCoins;
    }
    //animate coin if collected
    public void collect()
    {
        if(!collected)
        {
            collected = true;
            velocityY = -8;
            getImage().setTransparency(255);
        }
    }
    //add gravity to coin so it drops
    private void applyGravity()
    {
        velocityY += gravity;
        setLocation(getX(), (int)(getY()+velocityY));
    }
    //apply collection animation if collected
    public void act()
    {
        animateCoin();
        if(collected)
        {
            applyGravity();
            lifeTimer--;
            if(lifeTimer<=0)
            {
                getWorld().removeObject(this);
                numOfCoins++;
            }
        }
    }
}
