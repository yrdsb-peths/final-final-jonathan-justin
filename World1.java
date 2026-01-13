import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World1 extends World
{

    /**
     * Constructor for objects of class World2.
     * 
     */
    public World1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(305, 400, 1, false); 
        setBackground("world1.png");
        
        addObject(new Portal(), 220, 365); // test portal
        
        addObject(new PauseButton(), 8, 8);
        prepare();
        Coin.reset();
    }
    
    private void prepare()
    {
        Player player = new Player();
        addObject(new SpawnPoint(), 180, 375);
        addObject(player, 180, getHeight() - 25);
        addObject(new Portal(), 56, 22);
        addObject(new Coin(false), 8, 390);
        addObject(new Spike(), 150, 375);
        addObject(new Coin(true), 74, 22);
        addObject(new Coin(true), 299, 200);
        
        for (int i = 0; i < 2; i++)addObject(new platforms1(), 8, 266 - 16 * i);
        addObject(new platforms2(), 8, 198);
        addObject(new platforms2(), 8, 150);
        
        for (int i = 0; i < 2; i++)addObject(new platforms1(), 24, 298 - i * 16);

        addObject(new platforms1(), 40, 314);
        for(int i = 0; i < 3; i++)addObject(new platforms2(), 40 - i * 16, 392);
        
        for (int i = 0; i < 2; i++)addObject(new platforms1(), 56 + i * 16, 346);
        for (int i = 0; i < 2; i++)addObject(new platforms2(), 56 + i * 16, 150);
        for (int i = 0; i < 2; i++)addObject(new platforms2(), 56 + i * 16, 38);
        for (int i = 0; i < 3; i++)addObject(new platforms1(), 56, getHeight() - i * 16 - 8);

        for (int i = 0; i < 2; i++)addObject(new platforms2(), 72 + i * 16, 230);
        
        addObject(new platforms1(), 88, 362);
        for (int i = 0; i < 2; i++)addObject(new platforms2(), 88 + i * 16, 54);

        for (int i = 0; i < 3; i++)addObject(new platforms1(), 104 + i * 16, 378);
        
        for (int i = 0; i < 2; i++)addObject(new platforms2(), 120 + i * 16, 150);

        for (int i = 0; i < 2; i++)addObject(new platforms2(), 136 + i * 16, 342);

        for (int i = 0; i < 2; i++)addObject(new platforms2(), 152 + i * 16, 230);
        for (int i = 0; i < 5; i++)addObject(new platforms1(), 152 + i * 16, 394);
        addObject(new platforms2(), 152, 70);
        
        for (int i = 0; i < 4; i++)addObject(new platforms2(), 184 + i * 16, 310);
        for (int i = 0; i < 2; i++)addObject(new platforms2(), 184 + i * 16, 150);

        for (int i = 0; i < 2; i++)addObject(new platforms2(), 200 + i * 16, 262);        
        addObject(new platforms2(), 200, 86);

        addObject(new platforms1(), 232, 378);
        
        addObject(new platforms1(), 248, 362);
        for (int i = 0; i < 2; i++)addObject(new platforms2(), 248 + i * 16, 166);

        addObject(new platforms1(), 264, 346);
        addObject(new platforms2(), 264, 54);

        addObject(new platforms1(), 280, 330);
        addObject(new platforms2(), 280, 86);

        addObject(new platforms2(), 296, 118);

        for (int i = 0; i < 3; i++)addObject(new platforms1(), getWidth() - 9, 314 - i * 16);
    }
}
