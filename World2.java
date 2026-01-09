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
        addObject(player, 8, 56);
        addObject(new Portal(), 792, 70);
        addObject(new SpawnPoint(), 8, 56);
        addObject(new Coin(false), 272, 27);
        addObject(new PauseButton(), 8, 8);
        
        for(int i = 0; i < 50; i++)addObject(new theVoid(), 8 + 16 * i, 119);
        for(int i = 0; i < 16; i++)addObject(new platforms1(), 8 + 16 * i, 35);
        for(int i = 0; i < 32; i++)addObject(new platforms1(), 300 + 16 * i, 35);

        
        for(int i = 0; i < 6; i++)for(int x = 0; x < 2; x++)addObject(new platforms2(),8 + 16 * x + (64 * i), 86);
        for(int i = 0; i < 3; i++)addObject(new platforms2(), 392 + 48 * i, 86);
        for(int i = 0; i < 3; i++)addObject(new platforms2(), 520 + 32 * i, 86);
        for(int i = 0; i < 3; i++)addObject(new platforms2(), 632 + 48 * i, 86);
        for(int i = 0; i < 2; i++)addObject(new platforms2(), 792 - 16 * i, 86);
    }
}
