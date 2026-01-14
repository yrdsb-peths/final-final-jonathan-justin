import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class platforms2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class platforms2 extends Actor
{
    //16x8 slab platform
    public platforms2()
    {
        GreenfootImage image = new GreenfootImage(16, 8);
        image.setColor(Color.BLUE);
        image.fill();
        setImage(image);
        getImage().setTransparency(0);
    }
}
