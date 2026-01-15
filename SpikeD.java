import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpikeD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpikeD extends Actor
{
    //upside down spike class
    GreenfootImage spike = new GreenfootImage("spike.png");
    
    /**
     * constructor for a spike
     * rotated 180 degrees to face downwards
     * kills player
     */
    public SpikeD(){
        setImage(spike);
        getImage().rotate(180);
    }
}
