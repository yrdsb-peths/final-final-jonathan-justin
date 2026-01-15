import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * World 1 Class, first level of the game
 * 
 */
public class World1 extends World
{
    //adding music
    private GreenfootSound music = new GreenfootSound("world1.mp3");
    
    /**
     * Constructor for objects of class World1.
     * 
     */
    public World1(Player player)
    {    
        //add all necessary objects
        super(305, 400, 1, false); 
        
        //addObject(new Portal(), 220, 365); // test portal
        music.playLoop();
        prepare(player);
    }
    
    /**
     * add all elements to the world
     */
    private void prepare(Player player)
    {
        //add all necessary objects
        setBackground("world1.png");
        addObject(player, 180, 375);
        
        //addObject(new Portal(), 230, 375); //test portal
        
        addBasics();
        
        addCoins();
        addGround();
        }
    
    /**
     * add necessary elements for the world
     */
    private void addBasics()
    {
        addObject(new SpawnPoint(), 180, 375);
        addObject(new Portal(), 56, 22);
        addObject(new PauseButton(), 10, 10);
    }
    
    /**
     * add all platforms
     */
    private void addGround()
    {
        addFloor();
        addPlatforms();
    }
    
    /**
     * stop music, call when leaving world
     */
    public void stopMusic() {
        music.stop();
    }
    
    /**
     * add floor of the world, goes from left to right
     */
    private void addFloor()
    {
        for (int i = 0; i < 2; i++)addObject(new platforms1(), 8, 264 - 16 * i);
        for (int i = 0; i < 2; i++)addObject(new platforms1(), 24, 296 - i * 16);
        addObject(new platforms1(), 40, 312);
        for (int i = 0; i < 2; i++)addObject(new platforms1(), 56 + i * 16, 344);
        for (int i = 0; i < 3; i++)addObject(new platforms1(), 56, 392 - i * 16);
        addObject(new platforms1(), 88, 360);
        for (int i = 0; i < 3; i++)addObject(new platforms1(), 104 + i * 16, 376);
        for (int i = 0; i < 5; i++)addObject(new platforms1(), 152 + i * 16, 392);
        addObject(new platforms1(), 232, 376);
        addObject(new platforms1(), 248, 360);
        addObject(new platforms1(), 264, 344);
        addObject(new platforms1(), 280, 328);
        for (int i = 0; i < 3; i++)addObject(new platforms1(), getWidth() - 9, 312 - i * 16);
    }
    
    /**
     * add all floating platforms of the world
     */
    private void addPlatforms()
    {
        addObject(new platforms2(), 8, 198);
        addObject(new platforms2(), 8, 150);
        for(int i = 0; i < 3; i++)addObject(new platforms2(), 40 - i * 16, 392);
        for (int i = 0; i < 2; i++)addObject(new platforms2(), 56 + i * 16, 150);
        for (int i = 0; i < 2; i++)addObject(new platforms2(), 56 + i * 16, 38);
        for (int i = 0; i < 2; i++)addObject(new platforms2(), 72 + i * 16, 230);
        for (int i = 0; i < 2; i++)addObject(new platforms2(), 88 + i * 16, 54);
        for (int i = 0; i < 2; i++)addObject(new platforms2(), 120 + i * 16, 150);
        for (int i = 0; i < 2; i++)addObject(new platforms2(), 136 + i * 16, 342);
        for (int i = 0; i < 2; i++)addObject(new platforms2(), 152 + i * 16, 230);
        addObject(new platforms2(), 152, 70);
        for (int i = 0; i < 4; i++)addObject(new platforms2(), 184 + i * 16, 310);
        for (int i = 0; i < 2; i++)addObject(new platforms2(), 184 + i * 16, 150);
        for (int i = 0; i < 2; i++)addObject(new platforms2(), 200 + i * 16, 262);        
        addObject(new platforms2(), 200, 86);
        for (int i = 0; i < 2; i++)addObject(new platforms2(), 248 + i * 16, 166);
        addObject(new platforms2(), 264, 54);
        addObject(new platforms2(), 280, 86);
        addObject(new platforms2(), 296, 118);
    }
    
    /**
     * add coins, some secret
     */
    private void addCoins()
    {
        addObject(new Coin(false), 8, 390);
        addObject(new Coin(true), 299, 200);
    }
}
