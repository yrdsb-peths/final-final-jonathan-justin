import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PauseOverlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PauseOverlay extends Actor
{
    public PauseOverlay()
    {
        GreenfootImage img = new GreenfootImage(400, 200);
        img.setColor(new Color(0, 0, 0, 180)); // translucent
        img.fillRect(0, 0, 400, 200);

        img.setColor(Color.WHITE);
        img.drawString("the pause button is broken\nmaybe try another button?\n Click anywhere to resume", 80, 100);

        setImage(img);
    }

    public void act()
    {
        if (Greenfoot.mouseClicked(null))
        {
            World world = getWorld();
            world.removeObject(this);
        }
    }
}

