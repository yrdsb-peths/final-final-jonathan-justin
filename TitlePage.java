import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitlePage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitlePage extends World
{
    GreenfootSound music = new GreenfootSound("titlepage.mp3");
    
    /**
     * Constructor for objects of class TitlePage.
     * 
     */
    public TitlePage()
    {
        super(609, 400, 1, false); 
        
        music.playLoop();
        
        prepare();
    }
    
    private void stopMusic()
    {
        music.stop();
    }
    
    /**
     * changes from title screen to tutorial world once space is pressed
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            stopMusic();
            Greenfoot.setWorld(new TutorialWorld());
        }
    }
    
    /**
     * prepare the world
     */
    private void prepare()
    {
        setBackground("titlePage.png");
        
        GreenfootImage knightI = new GreenfootImage("images/idle_knight/idleknight0.png");
        knightI.scale(100, 100);
    
        KnightImage knight = new KnightImage();
        knight.setImage(knightI);
        addObject(knight, getWidth() / 2, getHeight() / 5 * 3);
        
        
        Label label = new Label("Leap Saga", 40);
        addObject(label, getWidth() / 2, getHeight() / 3);
        Label label2 = new Label("Press 'Space' to Start", 30);
        addObject(label2, getWidth() / 2, getHeight() / 6 * 5);
        
    }
}
