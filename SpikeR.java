import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpikeR here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpikeR extends Actor
{
    //spike facing right class
    GreenfootImage spike = new GreenfootImage("spike.png");
    
    
    public SpikeR(){
        setImage(spike);
        getImage().rotate(270);
    }
    /**
     * Act - do whatever the SpikeR wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
