import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spike here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spike extends Actor
{
    //spike class
    GreenfootImage spike = new GreenfootImage("spike.png");
    
    /**
     * constructor for a spike
     * kills player
     */
    public Spike(){
        setImage(spike);
    }
}
