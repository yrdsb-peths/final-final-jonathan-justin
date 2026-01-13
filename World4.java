import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World4 extends World
{

    /**
     * Constructor for objects of class World4.
     * 
     */
    public World4(Player player)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1537, 608, 1, false); 
        setBackground("world4.png");
        
        prepare(player);
    }
    
    private void prepare(Player player)
    {
        addObject(player, 160, 304);
                
    }
    private boolean resetting = false;
    public void act()
    {
        if (Player.getDeath() && !resetting)
        {
            resetting = true;
            removeObjects(getObjects(Coin.class));
            Player player = getObjects(Player.class).get(0);
            prepare(player);
        }

        if (!Player.getDeath())
        {
            resetting = false;
        }
    }
}
