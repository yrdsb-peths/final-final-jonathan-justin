import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PauseButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PauseButton extends Actor
{
    GreenfootImage pause = new GreenfootImage("pause.png");
    public PauseButton(){
        setImage(pause);
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
            World world = getWorld();
            world.addObject(new PauseOverlay(), 
            world.getWidth() / 2, 
            world.getHeight() / 2);
        }
    }
}

