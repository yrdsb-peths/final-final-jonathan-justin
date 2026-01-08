import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpawnPoint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpawnPoint extends Actor
{
    public SpawnPoint()
    {
        GreenfootImage img = new GreenfootImage(16, 16);
        img.setColor(Color.YELLOW);
        img.fill();
        setImage(img);
        //getImage().setTransparency(0);
    }
}
