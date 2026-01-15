import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KnightImage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KnightImage extends Actor
{
    public KnightImage()
    {
        GreenfootImage image = new GreenfootImage("images/idle_knight/idleknight0.png");
        image.scale(100, 100);
        setImage(image);
    }
}
