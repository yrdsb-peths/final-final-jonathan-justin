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
    
    /**
     * constructor for SpikeR
     * rotated 270 degres to be on the right side facing left
     * kills player
     */
    public SpikeR(){
        setImage(spike);
        getImage().rotate(270);
    }
}
