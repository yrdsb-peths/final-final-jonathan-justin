import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World3 extends World
{

    /**
     * Constructor for objects of class World3.
     * 
     */
    public World3(Player player)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(513, 512, 1, false);
        
        prepare(player);
    }
    
    private void prepare(Player player)
    {
        addObject(player, 50, 50);
        setBackground("world3Outside.png");
        for(int i = 0; i < 4; i++)addObject(new platforms1(), 8, 424 + i * 16);
        for(int i = 0; i < 4; i++)addObject(new platforms1(), 8 + i * 16, 488);
        
        for(int i = 0; i < 2; i++)addObject(new platforms1(), 24, 424 + i * 16);
    
        
        for(int i = 0; i < 9; i++)addObject(new platforms1(), 40 + i * 16, 424);
        
        for(int i = 0; i < 28; i++)addObject(new platforms1(), 72 + i * 16, 504);
        
        for(int i = 0; i < 3; i++)addObject(new platforms1(), 152 + i * 16, 408);
        
        for(int i = 0; i < 2; i++)addObject(new platforms1(), 184 + i * 16, 392);
        addObject(new platforms1(), 184, 488);
        
        for(int i = 0; i < 6; i++)addObject(new platforms1(), 200 + i * 16, 472);
        
        for(int i = 0; i < 4; i++)addObject(new platforms1(), 200 + i * 16, 376);
        for(int i = 0; i < 2; i++)for(int x = 0; x < 2; x++)addObject(new platforms1(), 216 + x * 16, 424 + i * 16);
        
        for(int i = 0; i < 2; i++)addObject(new platforms1(), 264 + i * 16, 360);
        for(int i = 0; i < 2; i++)addObject(new platforms1(), 264 - i * 16, 408);
        
        for(int i = 0; i < 3; i++)addObject(new platforms1(), 280 + i * 16, 456);
        for(int i = 0; i < 2; i++)addObject(new platforms1(), 280, 376 + i * 16);
            
        addObject(new platforms1(), 328, 440);
        
        for(int i = 0; i < 3; i++)addObject(new platforms1(), 344, 472 - i * 16);
        for(int i = 0; i < 3; i++)addObject(new platforms1(), 360 + i * 16, 488);
        
        addObject(new platforms2(), 408, 406);
        
    }
}
