import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World4 extends World
{

    /**
     * Constructor for objects of class World4.
     * 
     */
    public World4(Player player)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1537, 608, 1, false); 
        setBackground("world4.png");
        
        addObject(new Portal(), 130, 260);
        
        prepare(player);
    }
    
    private void prepare(Player player)
    {
        addObject(new SpawnPoint(), 160, 260);
        addObject(player, 160, 260); 
        for(int i = 0; i<14;i++) addObject(new platforms1(), 120 + i*16, 280);
        addObject(new platforms1(), 120, 296);
        addObject(new platforms1(), 136, 328);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 136 + i*16, 344);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 136 + i*16, 344);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 152 + i*16, 360);
        for(int i = 0; i<6; i++) addObject(new platforms1(), 168 + i*16, 376);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 200 + i*16, 392);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 232 + i*16, 360);
        addObject(new platforms1(), 280, 344);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 280 + i*16, 328);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 312 + i*16, 296);
        addObject(new platforms1(), 312, 312);
        
        for(int i = 0; i< 96; i++) addObject(new theVoid(), 8+i*16, 620);
        for(int i = 0; i < 7 ;i++) addObject(new Water(), 8 + i*16, 280);
        for(int i = 0; i < 7 ;i++) addObject(new Water(), 8 + i*16, 296);
        for(int i = 0; i < 8 ;i++) addObject(new Water(), 8 + i*16, 312);
        for(int i = 0; i < 8 ;i++) addObject(new Water(), 8 + i*16, 328);
        for(int i = 0; i < 8 ;i++) addObject(new Water(), 8 + i*16, 344);
        for(int i = 0; i < 9 ;i++) addObject(new Water(), 8 + i*16, 360);
        for(int i = 0; i < 10 ;i++) addObject(new Water(), 8 + i*16, 376);
        for(int i = 0; i < 12 ;i++) addObject(new Water(), 8 + i*16, 392);
        for(int i = 0; i < 39 ;i++) addObject(new Water(), 8 + i*16, 408);
        for(int i = 0; i < 41 ;i++) addObject(new Water(), 8 + i*16, 424);
        for(int i = 0; i < 43 ;i++) addObject(new Water(), 8 + i*16, 440);
        for(int i = 0; i < 53 ;i++) addObject(new Water(), 8 + i*16, 456);
        for(int i = 0; i < 53 ;i++) addObject(new Water(), 8 + i*16, 472);
        for(int i = 0; i < 53 ;i++) addObject(new Water(), 8 + i*16, 488);
        for(int i = 0; i < 40 ;i++) addObject(new Water(), 40 + i*16, 504);
        for(int i = 0; i < 37 ;i++) addObject(new Water(), 56 + i*16, 520);
        for(int i = 0; i < 33 ;i++) addObject(new Water(), 88 + i*16, 536);
        for(int i = 0; i < 24 ;i++) addObject(new Water(), 184 + i*16, 552);
        for(int i = 0; i < 19 ;i++) addObject(new Water(), 232 + i*16, 568);
        for(int i = 0; i < 15 ;i++) addObject(new Water(), 264 + i*16, 584);
        for(int i = 0; i < 10 ;i++) addObject(new Water(), 280 + i*16, 600);
        for(int i = 0; i < 24 ;i++) addObject(new Water(), 232 + i*16, 392);
        for(int i = 0; i < 21 ;i++) addObject(new Water(), 264 + i*16, 376);
        for(int i = 0; i < 18 ;i++) addObject(new Water(), 280 + i*16, 360);
        for(int i = 0; i < 17 ;i++) addObject(new Water(), 296 + i*16, 344);
        for(int i = 0; i < 16;i++) addObject(new Water(), 312 + i*16, 328);
        for(int i = 0; i < 14;i++) addObject(new Water(), 328 + i*16, 312);
        for(int i = 0; i < 14;i++) addObject(new Water(), 328 + i*16, 296);
        for(int i = 0; i < 13;i++) addObject(new Water(), 328 + i*16, 280);
        for(int i = 0; i < 3;i++) addObject(new Water(), 808 + i*16, 504);
        for(int i = 0; i < 6;i++) addObject(new Water(), 776 + i*16, 440);
        for(int i = 0; i < 3;i++) addObject(new Water(), 824 + i*16, 424);
        for(int i = 0; i < 3;i++) addObject(new Water(), 840 + i*16, 408);
        for(int i = 0; i < 4;i++) addObject(new Water(), 840 + i*16, 392);
        for(int i = 0; i < 3;i++) addObject(new Water(), 856 + i*16, 376);
        for(int i = 0; i < 4;i++) addObject(new Water(), 856 + i*16, 360);
        for(int i = 0; i < 4;i++) addObject(new Water(), 872 + i*16, 344);
        for(int i = 0; i < 5;i++) addObject(new Water(), 872 + i*16, 328);
        for(int i = 0; i < 4;i++) addObject(new Water(), 888 + i*16, 312);
        for(int i = 0; i < 4;i++) addObject(new Water(), 904 + i*16, 296);
        for(int i = 0; i < 4;i++) addObject(new Water(), 904 + i*16, 280);
        
        for(int i = 0; i<2; i++) addObject(new platforms1(), 8 + i*16, 504);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 24 + i*16, 520);
    }
    private boolean resetting = false;
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
