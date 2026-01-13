import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Actor
{
    SimpleTimer animationTimer = new SimpleTimer();
    GreenfootImage[] coin = new GreenfootImage[10];
    
    double velocityY = 0;
    double gravity = 1;
    boolean collected = false;
    int lifeTimer = 30;
    static int numOfCoins=0;
    boolean visibleOnStart;
    
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
    
    int coinIndex = 0;
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
    
    public static int coinCount(){
        return numOfCoins;
    }
    
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
    public void collect()
    {
        if(!collected)
        {
            collected = true;
            velocityY = -8;
            getImage().setTransparency(255);
        }
    }
    private void applyGravity()
    {
        velocityY += gravity;
        setLocation(getX(), (int)(getY()+velocityY));
    }
}
