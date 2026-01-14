import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World2 extends World
{
    private boolean resetting = false;
    /**
     * Constructor for objects of class World2.
     * 
     */
    public World2(Player player)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(801, 112, 1, false); 
        setBackground("world2.png");
        
        addObject(new Portal(), 70, 70);//test portal
        
        prepare(player);
    }
    
    private void prepare(Player player)
    {
        addObject(player, 8, 56);
        
        addBasics();
        
        addCoins();
        addPlatforms();
        addTopAndBottom();
        addSpikes();        
    }
    
    //basic level needs
    private void addBasics()
    {
        addObject(new SpawnPoint(), 8, 56);
        addObject(new PauseButton(), 10, 10);
        addObject(new Portal(), 792, 70);
    }
    
    //adds secret coins to the level (L - R)
    private void addCoins()
    {
        addObject(new Coin(false), 8, 30);
        addObject(new Coin(false), 272, 27);
        addObject(new Coin(true),536, 104);
    }
    
    //creates the platforms for the player to jump on (L - R)
    private void addPlatforms()
    {
        for(int i = 0; i < 6; i++)for(int x = 0; x < 2; x++)addObject(new platforms2(),8 + 16 * x + (64 * i), 86);
        for(int i = 0; i < 3; i++)addObject(new platforms2(), 392 + 48 * i, 86);
        for(int i = 0; i < 3; i++)addObject(new platforms2(), 520 + 32 * i, 86);
        for(int i = 0; i < 3; i++)addObject(new platforms2(), 632 + 48 * i, 86);
        for(int i = 0; i < 2; i++)addObject(new platforms2(), 792 - 16 * i, 86);
    }
    
    //creates the floor and ceiling of the map (L - R)
    private void addTopAndBottom()
    {
        for(int i = 0; i < 50; i++)addObject(new platforms1(), 8 + 16 * i, 119);
        for(int i = 0; i < 16; i++)addObject(new platforms1(), 8 + 16 * i, 38);
        for(int i = 0; i < 32; i++)addObject(new platforms1(), 300 + 16 * i, 38);
        addObject(new platforms1(), 300, 24);
    }
    
    //add the bottom row of spikes (L - R)
    private void addSpikes()
    {
        for(int i = 0; i < 29;i++)addObject(new Spike(), 8+16*i, 108);
        for(int i = 0; i < 10; i++)addObject(new FakeSpike(), 472 + 16*i,109);
        for(int i = 0; i <12; i++)addObject(new Spike(), 632 + 16*i, 108);
    }
    
    //reset world if player dies
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
