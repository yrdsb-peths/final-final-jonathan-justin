import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class theVoid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class theVoid extends Actor
{
    //void class for out-of-bounds checking
    /**
     * Act - do whatever the theVoid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage image = new GreenfootImage(16, 16);
        image.setColor(Color.RED);
        image.fill();
        setImage(image);
        //getImage().setTransparency(0);
    }
}
