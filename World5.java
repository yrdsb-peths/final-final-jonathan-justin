import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World5 extends World
{

    /**
     * Constructor for objects of class World5.
     * 
     */
    public World5(Player player)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(785, 448, 1, false); 
        setBackground("world5.png");
        
        
        prepare(player);
    }
    
    private void prepare(Player player)
    {
        addObject(player, 520, 288);
        for(int i = 0; i < 5; i++)addObject(new platforms1(), 520, 296 + i * 16);
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
