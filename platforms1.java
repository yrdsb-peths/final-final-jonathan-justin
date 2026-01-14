import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class platforms1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class platforms1 extends Actor
{
    //16x16 block platform 
    public platforms1()
    {
        GreenfootImage image = new GreenfootImage(16, 16);
        image.setColor(Color.GREEN);
        image.fill();
        setImage(image);
        //getImage().setTransparency(0);
    }
}
