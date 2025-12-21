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
        super(600, 400, 1, false); 
        
        prepare(player);
    }
    
    private void prepare(Player player)
    {
        addObject(player, 50, 50);
    }
}
