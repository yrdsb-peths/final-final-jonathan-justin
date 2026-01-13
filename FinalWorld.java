import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class congradulations here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalWorld extends World
{

    /**
     * Constructor for objects of class congradulations.
     * 
     */
    public FinalWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(384, 320, 1, false); 
        setBackground("finalworld.png");
        
    }
    
    private void prepare()
    {
        for(int i = 0; i < 5; i++)addObject(new platforms1(), 8 + i * 16, 248);
        for(int i = 0; i < 10; i++)addObject(new platforms1(), 120 + i * 16, 248);
        for(int i = 0; i < 5
    }
}
