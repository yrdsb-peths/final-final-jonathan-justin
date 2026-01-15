import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FakeSpike here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FakeSpike extends Actor
{
    //fake spike class(used in world3)
    GreenfootImage spike = new GreenfootImage("spike.png");
    
    /**
     * sets the image of the fake spike to match the real spike
     * does not kill player
     * used for secret coins
     */
    public FakeSpike(){
        setImage(spike);
    }
}
