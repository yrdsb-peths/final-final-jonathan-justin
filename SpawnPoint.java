import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpawnPoint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpawnPoint extends Actor
{
    /**
     * constructor for a spawnpoint
     * color is yellow
     * invisible
     */
    public SpawnPoint()
    {
        //spawn point for simple respawning
        GreenfootImage img = new GreenfootImage(16, 16);
        img.setColor(Color.YELLOW);
        img.fill();
        setImage(img);
        getImage().setTransparency(0);
    }
}
