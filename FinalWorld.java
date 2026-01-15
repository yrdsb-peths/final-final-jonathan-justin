import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class congradulations here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalWorld extends World
{
    private GreenfootSound music = new GreenfootSound("finalworld.mp3");
    /**
     * Constructor for objects of class FinalWorld.
     * 
     */
    public FinalWorld(Player player)
    {   
        super(385, 320, 1, false); 
        setBackground("finalworld.png");
        
        music.playLoop();
        
        prepare(player);
    }
    
    /**
     * prepare the world
     */
    private void prepare(Player player)
    {
        addObject(player, 50, 50);
        
        showStats(player);
        
        addLand();
        addWater();
    }
    
    /**
     * shows the statistics of the game
     * death count
     * coin count
     */
    private void showStats(Player player)
    {
        int numOfCoins = player.getNumOfCoins();
        int numOfDeaths = player.getNumOfDeaths();
        
        showText("Congratulations for beating the game!", 200, 30);
        showText("Stats: ", 200, 64);
        showText("Coins Collected: " + numOfCoins + "/15", 200, 100);
        showText("Deaths: "+numOfDeaths, 200, 130);
    }
    
    /**
     * adds all land to the world
     */
    private void addLand()
    {
        addFloor();
        addPlatforms();
    }
    
    /**
     * add ground floor hitboxes on map
     */
    private void addFloor()
    {
        for(int i = 0; i < 5; i++)addObject(new platforms1(), 8 + i * 16, 264);
        for(int i = 0; i < 10; i++)addObject(new platforms1(), 120 + i * 16, 264);
        for(int i = 0; i < 5; i++)addObject(new platforms1(), 376 - i *16, 264);
        addObject(new platforms1(), 72, 280);
        for(int i = 0; i < 4; i++)addObject(new platforms1(), 72+i*16, 296);
        addObject(new platforms1(), 120, 280); addObject(new platforms1(), 264, 280);
        for(int i = 0; i<4; i++)addObject(new platforms1(), 312 - i*16,296);
        addObject(new platforms1(), 312, 280);
    }
    
    /**
     * add floating platforms to jump on
     */
    private void addPlatforms()
    {
        addObject(new platforms2(), 8, 214);
        addObject(new platforms2(), 40, 214);
        addObject(new platforms2(), 72, 214);
        addObject(new platforms2(), 120, 214);
        addObject(new platforms2(), 152, 214);
        addObject(new platforms2(), 184, 214);
        addObject(new platforms2(), 200, 214);
        addObject(new platforms2(), 232, 214);
        addObject(new platforms2(), 264, 214);
        addObject(new platforms2(), 312, 214);
        addObject(new platforms2(), 344, 214);
        addObject(new platforms2(), 376, 214);
        for(int i = 0; i<2; i++)addObject(new platforms2(), 8+i*16, 164);
        for(int i = 0; i<2; i++)addObject(new platforms2(), 56+i*16, 164);
        for(int i = 0; i<2; i++)addObject(new platforms2(), 120+i*16, 164);
        for(int i = 0; i<2; i++)addObject(new platforms2(), 168+i*16, 164);
        for(int i = 0; i<2; i++)addObject(new platforms2(), 200+i*16, 164);
        for(int i = 0; i<2; i++)addObject(new platforms2(), 248+i*16, 164);
        for(int i = 0; i<2; i++)addObject(new platforms2(), 312+i*16, 164);
        for(int i = 0; i<2; i++)addObject(new platforms2(), 360+i*16, 164);
    }
    
    /**
     * adds water on map
     */
    private void addWater()
    {
        for(int i = 0; i<2; i++)addObject(new Water(), 88+i*16, 264);
        for(int i = 0; i<2; i++)addObject(new Water(), 88+i*16, 280);
        for(int i = 0; i<2; i++)addObject(new Water(), 280+i*16, 264);
        for(int i = 0; i<2; i++)addObject(new Water(), 280+i*16, 280);
    }
}
