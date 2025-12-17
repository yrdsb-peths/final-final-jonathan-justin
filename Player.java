import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    static final int GRAVITY = 2;
    static final int JUMP_FORCE = 30;
    int xSpeed = 4;
    int ySpeed = 0;
    public void act()
    {
        moveHorizontal();
        moveVertically();
    }
    
    private void moveHorizontal()
    {
        int worldWidth = getWorld().getWidth();
        int myWidth = getImage().getHeight();
        int dx = 0;
        
        if(Greenfoot.isKeyDown("left")) dx--;
        if(Greenfoot.isKeyDown("right")) dx++;
        
        setLocation(getX() + dx * xSpeed, getY());
        if(getX() < myWidth/2) setLocation(myWidth/2, getY());
        if(getX() > worldWidth-myWidth/2) setLocation(worldWidth - myWidth/2, getY());
        while(getOneIntersectingObject(null) != null) setLocation(getX() - dx, getY());
    }
    
    private void moveVertically()
    {
        int worldHeight = getWorld().getHeight();
        int myHeight = getImage().getHeight();
        boolean onGround = false;
        
        ySpeed += GRAVITY;
        setLocation(getX(), getY() + ySpeed);
        
        if(getY() > worldHeight - myHeight / 2)
        {
            setLocation(getX(), worldHeight - myHeight / 2);
            ySpeed = 0;
            onGround = true;
        }
        int dy = (int)Math.signum(ySpeed);
        while(getOneIntersectingObject(null) != null)
        {
            setLocation(getX(), getY() - dy);
            if(dy > 0) onGround = true;
            ySpeed = 0;
        }
        if (onGround && Greenfoot.isKeyDown("up")) ySpeed = -JUMP_FORCE;
    }
}
