import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * third level of the game
 */
public class World3 extends World
{
    //reset and music variables
    private boolean resetting = false;
    private GreenfootSound music = new GreenfootSound("world3.mp3");
    /**
     * Constructor for objects of class World3.
     * 
     */
    public World3(Player player)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(513, 512, 1, false);
        //addObject(new Portal(), 0, 400);//test portal
        music.playLoop();
        prepare(player);
    }
    /**
     * stop music when leaving world
     */
    public void stopMusic() {
        music.stop();
    }
    /**
     * prepare the world
     * @param player use the existing player to continue playing
     */
    private void prepare(Player player)
    {
        //add all necessary objects
        addObject(player, 50, 400);
        setBackground("world3.png");
        
        addObject(new Portal(), 8, 400); //test portal
        
        addBasics();
        
        addCoins();
        addSpikes();
        addWater();
        addGround();
    }
    
    /**
     * add necessities of the level
     */
    private void addBasics()
    {
        addObject(new SpawnPoint(), 50, 400);
        addObject(new Portal(), 504, 230);
        addObject(new PauseButton(), 10, 10);
    }
    /**
     * add all platforms in the world
     */
    private void addGround()
    {
        addFloor();
        addPlatforms();
    }
    
    /**
     * add floor of the map
     */
    private void addFloor()
    {
        for(int i = 0; i < 4; i++)addObject(new platforms1(), 8, 424 + i * 16);
        for(int i = 0; i < 4; i++)addObject(new platforms1(), 8 + i * 16, 488);
        addObject(new platforms2(), 8, 198);
        for(int i = 0; i < 2; i++)addObject(new platforms1(), 24, 424 + i * 16);
        addObject(new platforms2(), 24, 214);
        for(int i = 0; i < 9; i++)addObject(new platforms1(), 40 + i * 16, 424);
        for(int i = 0; i < 2; i++)addObject(new platforms2(), 56 + i * 16, 262);
        for(int i = 0; i < 28; i++)addObject(new platforms1(), 72 + i * 16, 504);
        for(int i = 0; i < 2; i++)addObject(new platforms2(), 136 + i * 16, 294);
        addObject(new platforms2(), 136, 150);
        for(int i = 0; i < 3; i++)addObject(new platforms1(), 152 + i * 16, 408);
        for(int i = 0; i < 2; i++)addObject(new platforms1(), 184 + i * 16, 392);
        addObject(new platforms1(), 184, 488);
        addObject(new platforms2(), 184, 86);
        for(int i = 0; i < 6; i++)addObject(new platforms1(), 200 + i * 16, 472);
        for(int i = 0; i < 4; i++)addObject(new platforms1(), 200 + i * 16, 376);
        for(int i = 0; i < 2; i++)for(int x = 0; x < 2; x++)addObject(new platforms1(), 216 + x * 16, 424 + i * 16);        
        for(int i = 0; i < 2; i++)addObject(new platforms1(), 264 + i * 16, 360);
        for(int i = 0; i < 2; i++)addObject(new platforms1(), 264 - i * 16, 408);
        for(int i = 0; i < 2; i++)addObject(new platforms1(), 280, 376 + i * 16);        
        for(int i = 0; i < 2; i++)addObject(new platforms1(), 296 + i * 16, 456);
        addObject(new platforms1(), 328, 440);
        for(int i = 0; i < 3; i++)addObject(new platforms1(), 344, 472 - i * 16);
        for(int i = 0; i < 4; i++)addObject(new platforms1(), 344 + i * 16, 488);
    }
    
    /**
     * add all floating platforms of the world
     */
    private void addPlatforms()
    {
        addObject(new platforms1(), 56, 152);
        for(int i = 0; i < 2; i++)addObject(new platforms1(), 152, 136 + i * 16);
        addObject(new platforms1(), 216, 104);
        for(int i = 0; i < 2; i++)addObject(new platforms1(), 248, 264 - i * 16);
        for(int i = 0; i < 2; i++)addObject(new platforms1(), 264, 280 - i * 16);
        for(int i = 0; i < 2; i++)addObject(new platforms2(), 280 + i * 16, 166);
        for(int i = 0; i < 2; i++)addObject(new platforms1(), 280, 296 - i * 16);
        for(int i = 0; i < 2; i++)addObject(new platforms1(), 296, 312 - i * 16);
        for(int i = 0; i < 2; i++)addObject(new platforms1(), 312, 328 - i * 16);
        addObject(new platforms1(), 328, 344);
        for(int i = 0; i < 2; i++)addObject(new platforms2(), 392 - i * 16, 166);
        addObject(new platforms2(), 408, 406);
        addObject(new platforms2(), 408, 118);
        addObject(new platforms2(), 424, 70);
        addObject(new platforms1(), 424, 312);
        for(int i = 0; i < 2; i++)addObject(new platforms2(), 472 + i * 16, 374);
        addObject(new platforms2(), 504, 246);
        for(int i = 0; i < 4; i++)addObject(new platforms1(), 504, 376 - i * 16);

    }
    
    /**
     * add all the water in the map
     */
    private void addWater()
    {
        for(int i = 0; i < 7; i++)addObject(new Water(), 408 + i * 16, 488);
    }
    
    /**
     * adds all secret coins
     */
    private void addCoins()
    {
        addObject(new Coin(false), 24, 472);
        addObject(new Coin(false), 264, 392);
        addObject(new Coin(true), 420, 200);
    }
    
    /**
     * adds all spikes
     */
    private void addSpikes()
    {
        addObject(new Spike(), 72, 490);
        addObject(new Spike(), 120, 490);
    }
    
    /**
     * reset world on player death
     */
    public void act()
    {
        if (Player.getDeath() && !resetting)
        {
            resetting = true;
            removeObjects(getObjects(Coin.class));
            Player player = getObjects(Player.class).get(0);
            prepare(player);
        }

        if (!Player.getDeath())
        {
            resetting = false;
        }
    }
}
