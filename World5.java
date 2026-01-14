import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World5 extends World
{
    private boolean resetting = false;
    private GreenfootSound music = new GreenfootSound("world5.mp3");
    /**
     * Constructor for objects of class World5.
     * 
     */
    public World5(Player player)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(785, 448, 1, false); 
        setBackground("world5.png");
        
        addObject(new Portal(), 560, 300);
        music.playLoop();
        prepare(player);
    }
    public void stopMusic() {
        music.stop();
    }
    private void prepare(Player player)
    {
        addObject(player, 536, 260);
        addObject(new SpawnPoint(), 536, 260);
        addObject(new Portal(), 168, 184);
        addObject(new Coin(false), 536, 408);
        addObject(new Coin(true), 404, 134);
        addObject(new PauseButton(), 10, 10);
        
        
        for(int i = 0; i < 5; i++)addObject(new platforms1(), 8 + i * 16, 56);
        for(int i = 0; i < 7; i++)addObject(new platforms1(), 40, 152 + i * 16);
        addObject(new platforms1(), 56, 136);
        addObject(new platforms1(), 56, 264);
        addObject(new platforms1(), 72, 280);
        addObject(new platforms1(), 72, 120);
        addObject(new platforms1(), 88, 296);
        for(int i = 0; i < 12; i++)addObject(new platforms1(), 88 + i * 16, 72);
        for(int i = 0; i < 2; i++)addObject(new platforms1(), 104 - i * 16, 104);
        addObject(new platforms1(), 104, 312);
        for(int x = 0; x < 3; x++)for(int i = 0; i < 3; i++)addObject(new platforms1(), 104 + x * 16, 184 + i * 16);
        addObject(new platforms1(), 120, 168);
        for(int i = 0; i < 4; i++)addObject(new platforms1(), 120 + i * 16, 232);
        addObject(new platforms1(), 120, 88);
        addObject(new platforms1(), 120, 328);
        for(int i = 0; i < 6; i++)addObject(new platforms1(), 136 + i * 16, 152);
        for(int i = 0; i < 7; i++)addObject(new platforms1(), 136 + i * 16, 248);
        addObject(new platforms1(), 152, 264);
        addObject(new platforms1(), 152, 184);
        for(int i = 0; i < 2; i++)addObject(new platforms1(), 168 + i * 16, 280);
        for(int i = 0; i < 3; i++)addObject(new platforms1(), 168 - i * 16, 344);
        for(int i = 0; i < 5; i++)addObject(new platforms1(), 200 + i * 16, 296);
        for(int i = 0; i < 3; i++)addObject(new platforms1(), 200 - i * 16, 168);
        for(int i = 0; i < 3; i++)addObject(new platforms1(), 216, 232 - i * 16);
        for(int i = 0; i < 2; i++)addObject(new platforms1(), 248 + i * 16, 232);
        for(int i = 0; i < 12; i++)addObject(new platforms1(), 280, 280 - i * 16);
        addObject(new platforms1(), 296, 104);
        for(int i = 0; i < 8; i++)addObject(new platforms1(), 296 - i * 16, 360);
        addObject(new platforms1(), 312, 344);
        for(int i = 0; i < 2; i++)addObject(new platforms1(), 328, 312 + i * 16);
        for(int i = 0; i < 10; i++)addObject(new platforms1(), 344, 152 + i * 16);
        for(int i = 0; i < 2; i++)addObject(new platforms1(), 360, 184 - i * 16);
        addObject(new platforms1(), 360, 312);
        addObject(new platforms1(), 376, 328);
        addObject(new platforms1(), 392, 344);
        addObject(new platforms1(), 392, 104);
        for(int i = 0; i < 2; i++)addObject(new platforms1(), 408, 104 + i * 16);
        for(int i = 0; i < 4; i++)addObject(new platforms1(), 408, 232 + i * 16);
        for(int i = 0; i < 13; i++)addObject(new platforms1(), 424, 104 + i * 16);
        for(int i = 0; i < 7; i++)addObject(new platforms1(), 440, 104 + i * 16);
        for(int i = 0; i < 4; i++)addObject(new platforms1(), 456 - i * 16, 360);
        for(int i = 0; i < 15; i++)addObject(new platforms1(), 472 - i * 16, 88);
        addObject(new platforms1(), 472, 344);
        for(int i = 0; i < 6; i++)addObject(new platforms1(), 488, 248 + i * 16);
        for(int i = 0; i < 7; i++)addObject(new platforms1(), 504, 136 + i * 16);
        for(int i = 0; i < 2; i++)addObject(new platforms1(), 520, 408 + i * 16);
        for(int i = 0; i < 14; i++)addObject(new platforms1(), 520, 296 - i * 16);
        for(int i = 0; i < 6; i++)addObject(new platforms1(), 536, 312 + i * 16);
        for(int i = 0; i < 2; i++)addObject(new platforms1(), 536, 88 + i * 16);
        addObject(new platforms2(), 552, 342);
        for(int i = 0; i < 2; i++)addObject(new platforms2(), 552 + i * 16, 84);
        addObject(new platforms2(), 584, 310);
        addObject(new platforms2(), 616, 150);
        addObject(new platforms2(), 632, 198);
        addObject(new platforms2(), 632, 102);
        addObject(new platforms2(), 648, 310);
        addObject(new platforms2(), 680, 214);
        addObject(new platforms2(), 696, 294);
        addObject(new platforms2(), 744, 230);
        for(int i = 0; i < 2; i++)addObject(new platforms2(), 760 - i * 16, 278);
        for(int i = 0; i < 6; i++)addObject(new platforms1(), 776, 280 + i * 16);
        for(int y = 0; y < 2; y++)for(int i = 0; i < 14; i++)addObject(new platforms1(), 760 - i * 16, 392 + y * 16);
        for(int i = 0; i < 16; i++)addObject(new platforms1(), 776 - i * 16, 440);
        
        addWater();
        
        addSpikes();
    }
    private void addWater()
    {
        for(int i = 0; i < 3; i++)addObject(new Water(), 56 + i * 16, 184);
        for(int i = 0; i < 3; i++)addObject(new Water(), 56 + i * 16, 200);
        for(int i = 0; i < 3; i++)addObject(new Water(), 56 + i * 16, 216);
        for(int i = 0; i < 4; i++)addObject(new Water(), 56 + i * 16, 232);
        for(int i = 0; i < 5; i++)addObject(new Water(), 56 + i * 16, 248);
        for(int i = 0; i < 5; i++)addObject(new Water(), 72 + i * 16, 264);
        for(int i = 0; i < 5; i++)addObject(new Water(), 88 + i * 16, 280);
        for(int i = 0; i < 6; i++)addObject(new Water(), 104 + i * 16, 296);
        for(int i = 0; i < 13; i++)addObject(new Water(), 120 + i * 16, 312);
        for(int i = 0; i < 12; i++)addObject(new Water(), 136 + i * 16, 328);
        for(int i = 0; i < 8; i++)addObject(new Water(), 184 + i * 16, 344);
        for(int i = 0; i < 4; i++)addObject(new Water(), 280 + i * 16, 296);
        for(int y = 0; y < 11; y++)for(int i = 0; i < 3; i++)addObject(new Water(), 296 + i * 16, 280 - y * 16);
        for(int i = 0; i < 5; i++)addObject(new Water(), 312 + i * 16, 104);
        for(int i = 0; i < 4; i++)addObject(new Water(), 344 + i * 16, 120);
        for(int i = 0; i < 5; i++)addObject(new Water(), 344 + i * 16, 136);
        for(int i = 0; i < 2; i++)addObject(new Water(), 360, 200 + i * 16);
        for(int i = 0; i < 4; i++)addObject(new Water(), 360 + i * 16, 152);
        for(int y = 0; y < 4; y++)for(int i = 0; i < 3; i++)addObject(new Water(), 360 + i * 16, 232 + y * 16);
        for(int y = 0; y < 4; y++)for(int i = 0; i < 3; i++)addObject(new Water(), 376 + i * 16, 168 + y * 16);
        for(int i = 0; i < 4; i++)addObject(new Water(), 360 + i * 16, 296);
        for(int i = 0; i < 4; i++)addObject(new Water(), 376 + i * 16, 312);
        for(int i = 0; i < 3; i++)addObject(new Water(), 392 + i * 16, 328);
        for(int i = 0; i < 2; i++)addObject(new Water(), 408 + i * 16, 344);
        for(int i = 0; i < 9; i++)addObject(new Water(), 440, 344 - i * 16);
        for(int i = 0; i < 16; i++)addObject(new Water(), 456, 344 - i * 16);
        for(int i = 0; i < 15; i++)addObject(new Water(), 472, 328 - i * 16);
        for(int i = 0; i < 9; i++)addObject(new Water(), 488, 232 - i * 16);
        for(int i = 0; i < 2; i++)addObject(new Water(), 504, 120 - i * 16);
    }
    private void addSpikes()
    {
        addSpikeRs();
        addSpikeLs();
        addSpikeUs();
        addSpikeDs();
    }
    private void addSpikeRs()
    {
        for(int i = 0; i < 2; i++)addObject(new SpikeR(), 507, 104 + i * 16);
        for(int i = 0; i < 7; i++)addObject(new SpikeR(), 491, 136 + i * 16);
        for(int i = 0; i < 6; i++)addObject(new SpikeR(), 475, 248 + i * 16);
        addObject(new SpikeR(), 410, 294);
        for(int i = 0; i < 4; i++)addObject(new SpikeR(), 394, 278 - i * 16);
        for(int i = 0; i < 6; i++)addObject(new SpikeR(), 410, 214 - i * 16);
        addObject(new SpikeR(), 394, 118);
        for(int i = 0; i < 10; i++)addObject(new SpikeR(), 330, 294 - i * 16);
        for(int i = 0; i < 2; i++)addObject(new SpikeR(), 314, 310 + i * 16);
        addObject(new SpikeR(), 154, 278);
        addObject(new SpikeR(), 138, 262);
        addObject(new SpikeR(), 122, 246);
        addObject(new SpikeR(), 106, 230);
        addObject(new SpikeR(), 90, 214);
    }
    private void addSpikeLs()
    {
        for(int i = 0; i < 7; i++)addObject(new SpikeL(), 453, 104 + i * 16);        
        for(int i = 0; i < 6; i++)addObject(new SpikeL(), 437, 216 + i * 16);
        addObject(new SpikeL(), 389, 328);
        addObject(new SpikeL(), 373, 312);
        for(int i = 0; i < 7; i++)addObject(new SpikeL(), 357, 296 - i * 16);
        for(int i = 0; i < 2; i++)addObject(new SpikeL(), 373, 184 - i * 16);
        addObject(new SpikeL(), 357, 152);
        for(int i = 0; i < 11; i++)addObject(new SpikeL(), 293, 120 + i * 16);
        addObject(new SpikeL(), 277, 296);
        addObject(new SpikeL(), 117, 312);
        addObject(new SpikeL(), 101, 296);
        addObject(new SpikeL(), 85, 280);
        addObject(new SpikeL(), 69, 264);
        for(int i = 0; i < 7; i++)addObject(new SpikeL(), 53, 248 - i * 16);
        for(int i = 0; i < 2; i++)addObject(new SpikeL(), 149, 200 + i * 16);
    }
    private void addSpikeUs()
    {
        for(int i = 0; i < 4; i++)addObject(new Spike(), 456 - i * 16, 346);
        addObject(new Spike(), 343, 138);
        for(int i = 0; i < 8; i++)addObject(new Spike(), 296 - i * 16, 346);
        for(int i = 0; i < 3; i++)addObject(new Spike(), 168 - i * 16, 330);
        for(int i = 0; i < 2; i++)addObject(new Spike(), 168 + i * 11, 138);
        addObject(new Spike(), 200, 234);
        addObject(new Spike(), 232, 234);
    }
    private void addSpikeDs()
    {
        addObject(new SpikeD(), 424, 310);
        for(int i = 0; i < 5; i++)addObject(new SpikeD(), 376 - i * 16, 102);
        for(int i = 0; i < 5; i++)addObject(new SpikeD(), 264 - i * 16, 310);
        for(int i = 0; i < 2; i++)addObject(new SpikeD(), 184 - i * 16, 294);
    }
    //reset world on player death
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
