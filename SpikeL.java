import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpikeL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpikeL extends Actor
{
    //spike facing left class
    GreenfootImage spike = new GreenfootImage("spike.png");
    
    /**
     * constructor for SpikeL
     * rotated 90 degrees to be on the left side facing right
     * kills player
     */
    public SpikeL(){
        setImage(spike);
        getImage().rotate(90);
    }
}
