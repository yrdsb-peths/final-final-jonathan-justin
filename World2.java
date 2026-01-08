import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World2 extends World
{

    /**
     * Constructor for objects of class World2.
     * 
     */
    public World2(Player player)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(801, 112, 1, false); 
        
        setBackground("world2.png");
        
        prepare(player);
    }
    
    private void prepare(Player player)
    {
        addObject(player, 8, 40);
        for(int i = 0; i < 50; i++)addObject(new platforms2(), 8+ 16 * i, 112);
        for(int i = 0; i < 2; i++)addObject(new platforms2(), 16*i + 8, 86);
        for(int i = 0; i < 2; i++)addObject(new platforms2(), 16* i + 72, 86);
        for(int i = 0; i < 2; i++)addObject(new platforms2(), 16* i + 136, 86);
        for(int i = 0; i < 2; i++)addObject(new platforms2(), 16* i + 200, 86);
    }
}
