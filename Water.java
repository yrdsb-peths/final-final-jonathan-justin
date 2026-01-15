import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Water here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Water extends Actor
{
    /**
     * constructor for water
     * color is orange
     * transparent
     */
    public void act()
    {
        GreenfootImage image = new GreenfootImage(16, 16);
        image.setColor(Color.ORANGE);
        image.fill();
        setImage(image);
        getImage().setTransparency(0);
    }
}
