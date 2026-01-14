import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpikeL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpikeL extends Actor
{
    GreenfootImage spike = new GreenfootImage("spike.png");
    
    
    public SpikeL(){
        setImage(spike);
        getImage().rotate(90);
    }
    /**
     * Act - do whatever the SpikeL wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
