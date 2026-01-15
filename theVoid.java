import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class theVoid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class theVoid extends Actor
{
    /**
     * constructor for void class
     * color is red
     * transparent
     * used to check if players are out-of-bounds
     */
    public void act()
    {
        GreenfootImage image = new GreenfootImage(16, 16);
        image.setColor(Color.RED);
        image.fill();
        setImage(image);
        getImage().setTransparency(0);
    }
}
