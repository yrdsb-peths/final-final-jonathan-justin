import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TutorialWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TutorialWorld extends World
{
    //reset world and music variables
    private boolean resetting = false;
    private GreenfootSound music = new GreenfootSound("tutorial.mp3");
    
    /**
     * Constructor for objects of class TutorialWorld.
     * 
     */
    public TutorialWorld()
    {    
        //add all necessary objects
        super(641, 256, 1, false); 
        
        
        //addObject(new Portal(), 168, 216); //test portal
        
        music.playLoop();
        
        Coin.reset();
        prepare();
    }
    
    /**
     * stop music when leaving world
     */
    public void stopMusic()
    {
        music.stop();
    }
    
    /**
     * prepare the world
     */
    private void prepare()
    {
        setBackground("tutorial.png");
        Player player = new Player();
        addObject(player, 8, 216);
        addBasics();
        showText();
        
        addCoins();
        addSpikes();
        
        addLand();
        addWater();
    }
    
    /**
     * add spikes to the map
     */
    private void addSpikes()
    {
        addObject(new Spike(), 503, 170);
    }
    
    /**
     * add world necessities
     */
    private void addBasics()
    {
        addObject(new Portal(), 520, 232);
        addObject(new SpawnPoint(), 8, 216);
        addObject(new PauseButton(), 10, 10);
    }
    
    /**
     * add coins to the map
     */
    private void addCoins()
    {
        addObject(new Coin(false), 416, 192);
    }
    
    /**
     * tell players how to move and interact in the game
     */
    private void showText()
    {
        showText("W or 'Space' to jump, A and D to move", 200, 60);
        showText("? = coin", 415, 165);
        showText("ouch", 500, 190);
        showText("S or 'Shift' to", 560, 60);
        showText("swim down", 560, 80);
    }
    
    /**
     * add all land to the map
     */
    private void addLand()
    {
        addFloor();
        addPlatforms();
    }
    
    /**
     * add platforms to the map
     */
    private void addPlatforms()
    {
        addObject(new platforms2(), 56, 182);
        addObject(new platforms2(), 72, 134);
        for(int i = 0; i < 2; i++)addObject(new platforms2(), 104 + i * 16, 182);
        addObject(new platforms2(), 168, 182);
        addObject(new platforms2(), 200, 134);
        for(int i = 0; i < 2; i++)addObject(new platforms2(), 232 + i * 16, 102);
        addObject(new platforms2(), 328, 134);
        for(int i = 0; i < 2; i++)addObject(new platforms2(), 376 + i * 16, 150);
        addObject(new platforms2(), 456, 134);
    }
    
    /**
     * add ground to the map
     */
    private void addFloor()
    {
        for(int i = 0; i < 32; i++) addObject(new platforms1(), 8 + i * 16, 232);
        for(int i = 0; i < 3; i++) addObject(new platforms1(), 504, 216 - i * 16);
        for(int i = 0; i < 5; i++) addObject(new platforms1(), 520, 216 - i * 16);
        for(int i = 0; i < 4; i++) addObject(new platforms1(), 536, 184 - i * 16);
        for(int i = 0; i < 6; i++) addObject(new platforms1(), 520 + i * 16, 248);
        addObject(new platforms1(), 616, 232);
        for(int i = 0; i < 2; i++) addObject(new platforms1(), 632, 216 - i * 16);
    }
    
    /**
     * add water to the map
     */
    private void addWater()
    {
        for(int y = 0; y < 3; y++)for(int i = 0; i < 5; i++) addObject(new Water(), 536 + i * 16, 200 + y * 16);
        for(int i = 0; i < 2; i++)addObject(new Water(), 616, 216 - i * 16);
        for(int y = 0; y < 4; y++)for(int i = 0; i < 6; i++) addObject(new Water(), 552 + i * 16, 184 - y * 16);
    }
    
    /**
     * reset world on player death
     */
    public void act()
    {
        if(Player.getDeath() && !resetting)
        {
            resetting = true;
            removeObjects(getObjects(Coin.class));
            removeObjects(getObjects(Player.class));
            prepare();
        }
        if(!Player.getDeath())
        {
            resetting = false;
        }
    }
}
