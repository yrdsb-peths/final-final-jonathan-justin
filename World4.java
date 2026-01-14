import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World4 extends World
{
    private boolean resetting = false;
    private GreenfootSound music = new GreenfootSound("world4.mp3");
    /**
     * Constructor for objects of class World4.
     * 
     */
    public World4(Player player)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1537, 608, 1, false);  
        
        addObject(new Portal(), 130, 260);//test portal
        music.playLoop();
        prepare(player);
    }
    public void stopMusic() {
        music.stop();
    }
    private void prepare(Player player)
    {
        addObject(player, 160, 260);
        setBackground("world4.png");
        
        addBasics();
        
        addCoins();
        addSpikes();
        
        addLand();
        addWater();
    }
    
    //adds spikes (L - R)
    private void addSpikes()
    {
        addObject(new Spike(), 1190, 234);
    }
    
    //basic level needs
    private void addBasics()
    {
        addObject(new PauseButton(), 10, 10);
        addObject(new SpawnPoint(), 160, 260); 
        addObject(new Portal(), 1528, 248);
    }
    
    //adds secret coins (L - R)
    private void addCoins()
    {
        addObject(new Coin(false), 216, 360);
        addObject(new Coin(false), 632, 120);
        addObject(new Coin(false), 1160, 392);
        addObject(new Coin(false), 1320, 344);
    }
    
    
    private void addLand()
    {
        startingIsland();
        cornerLand();
        middleIslandBottom();
        middleIslandTop();
        finalIsland();
        iceberg();
    }
    
    
    private void addWater()
    {
        openWater();
        tunnelWater();
    }
    
    //adds the island the player spawns on (L - R)
    private void startingIsland()
    {
        for(int i = 0; i<13;i++) addObject(new platforms1(), 120 + i*16, 280);
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
    }
    
    //adds the submerged land in bottom left (L - R)
    private void cornerLand()
    {
        for(int i = 0; i<2; i++) addObject(new platforms1(), 8 + i*16, 504);
        addObject(new platforms1(), 40, 520);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 56 + i*16, 536);
        for(int i = 0; i<6; i++) addObject(new platforms1(), 88 + i*16, 552);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 184 + i*16, 568);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 232 + i*16, 584);
        addObject(new platforms1(), 264, 600);
    }
    
    //adds the land connected to the bottom of the map (L - R)
    private void middleIslandBottom()
    {
        for(int i = 0; i<4; i++) addObject(new platforms1(), 440 + i*16, 600);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 504 + i*16, 584);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 536 + i*16, 568);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 568 + i*16, 552);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 616 + i*16, 536);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 648 + i*16, 520);
        for(int i = 0; i<8; i++) addObject(new platforms1(), 680 + i*16, 504);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 808 + i*16, 520);
        for(int i = 0; i<4; i++) addObject(new platforms1(), 856, 504 - i*16);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 872, 440 - i*16);
        addObject(new platforms1(), 888, 408);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 904, 392 - i*16);
        addObject(new platforms1(), 920, 360);
        addObject(new platforms1(), 936, 344);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 952, 328 - i*16);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 968 , 280 + i*16);
        addObject(new platforms1(), 984, 264);
        for(int i = 0; i<7; i++) addObject(new platforms1(), 1000 + i*16, 248);
        addObject(new platforms1(), 1112, 264);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1096 + i*16, 280);
        for(int i = 0; i<4; i++) addObject(new platforms1(), 1032 + i*16, 296);
        addObject(new platforms1(), 1016, 312);
        addObject(new platforms1(), 1000, 328);
        addObject(new platforms1(), 984, 344);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 968, 360 + i*16);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 952, 408 + i*16);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 936, 440 + i*16);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 920, 472 + i*16);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 936 + i*16, 520);
        addObject(new platforms1(), 968, 536);
        addObject(new platforms1(), 984, 552);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1000 + i*16, 568);
        for(int i = 0; i<5; i++) addObject(new platforms1(), 1032 + i*16, 584);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1112 + i*16, 568);
        addObject(new platforms1(), 1144, 552);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1160 + i*16, 536);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1192, 520 + i*16);
        addObject(new platforms1(), 1208, 568);
        addObject(new platforms1(), 1208, 520);
        addObject(new platforms1(), 1224, 584);
        addObject(new platforms1(), 1240, 600);
        addObject(new platforms1(), 1240, 616);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1208 + i*16, 504);
        
        for(int i = 0; i < 3; i++)addObject(new platforms1(), 1240, 488 - i * 16);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1240 + i*16, 440);
        for(int i = 0; i<7; i++) addObject(new platforms1(), 1144 + i*16, 424);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1160 + i*16, 440);
        for(int i = 0; i<5; i++) addObject(new platforms1(), 1096 + i*16, 408);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1080 + i*16, 424);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1064 + i*16, 440);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1064 + i*16, 456);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1048 + i*16, 472);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1112 + i*16, 392);
        addObject(new platforms1(), 1144, 376);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1160 + i*16, 360);
        for(int i = 0; i<8; i++) addObject(new platforms1(), 1192 + i*16, 344);
        for(int i = 0; i<8; i++) addObject(new platforms1(), 1224 + i*16, 328);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1288 + i*16, 360);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1304 + i*16, 376);
        for(int i = 0; i < 3; i++)addObject(new platforms1(), 1320, 392 + i*16);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1304 + i*16, 440);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1304 + i*16, 456);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1288 + i*16, 472);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1288 + i*16, 488);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1304 + i*16, 504);
        for(int i = 0; i<4; i++) addObject(new platforms1(), 1272 + i*16, 520);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1288 + i*16, 536);
        for(int i = 0; i<4; i++) addObject(new platforms1(), 1240 + i*16, 552);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1256 + i*16, 568);
        addObject(new platforms1(), 1272, 584);
        addObject(new platforms1(), 1352, 344);
        addObject(new platforms1(), 1368, 360);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1368 + i*16, 376);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1352 + i*16, 392);
        for(int i = 0; i<4; i++) addObject(new platforms1(), 1352 + i*16, 408);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1368 + i*16, 424);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1384 + i*16, 440);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1400 + i*16, 456);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1400 + i*16, 472);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1416 + i*16, 488);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1416 + i*16, 504);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1416 + i*16, 520);
        addObject(new platforms1(), 1432, 536);
    }
    
    //adds the floating island above middleIslandBottom (L - R)
    private void middleIslandTop()
    {
        for(int i = 0; i<2; i++)addObject(new platforms1(), 1000 + i*16, 424);
        for(int i = 0; i<4; i++)addObject(new platforms1(), 1000, 440 + i*16);
        for(int i = 0; i<2; i++)addObject(new platforms1(), 1000 + i*16, 504);
        for(int i = 0; i<2; i++)addObject(new platforms1(), 1016 + i*16, 408);
        for(int i = 0; i<7; i++)addObject(new platforms1(), 1016 + i*16, 520);
        for(int i = 0; i<2; i++)addObject(new platforms1(), 1032 + i*16, 392);
        for(int i = 0; i<2; i++)addObject(new platforms1(), 1048 + i*16, 376);
        for(int i = 0; i<2; i++)addObject(new platforms1(), 1064 + i*16, 360);
        for(int i = 0; i<3; i++)addObject(new platforms1(), 1080 + i*16, 344);
        for(int i = 0; i<2; i++)addObject(new platforms1(), 1112 + i*16, 328);
        for(int i = 0; i<3; i++)addObject(new platforms1(), 1112 + i*16, 504);
        for(int i = 0; i<2; i++)addObject(new platforms1(), 1128, 472 - i*16);
        for(int i = 0; i<3; i++)addObject(new platforms1(), 1128 + i*16, 488);
        for(int i = 0; i<2; i++)addObject(new platforms1(), 1144 + i*16, 312);
        for(int i = 0; i<4; i++)addObject(new platforms1(), 1160 + i*16, 472);
        for(int i = 0; i<3; i++)addObject(new platforms1(), 1160 + i*16, 296);
        for(int i = 0; i<2; i++)addObject(new platforms1(), 1192 + i*16, 280);
        for(int i = 0; i<3; i++)addObject(new platforms1(), 1192 + i*16, 248);
        addObject(new platforms1(), 1192, 264);
        addObject(new platforms1(), 1208, 456);
        for(int i = 0; i<4; i++)addObject(new platforms1(), 1224 + i*16, 264);
        for(int i = 0; i<7; i++)addObject(new platforms1(), 1240 + i*16, 232);
        for(int i = 0; i<3; i++)addObject(new platforms1(), 1288 + i*16, 248);
        for(int i = 0; i<2; i++)addObject(new platforms1(), 1336 + i*32, 264);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1336 + i*16, 280);
        addObject(new platforms1(), 1352, 248);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1352 + i*16, 552);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1368 + i*16, 296);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1368 + i*16, 568);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1384 + i*16, 312);
        for(int i = 0; i<6; i++) addObject(new platforms1(), 1384 + i*16, 584);
        addObject(new platforms1(), 1416, 328);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1416 + i*16, 344);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1432 + i*16, 360);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1448 + i*16, 376);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1448 + i*16, 392);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1464 + i*16, 408);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1464 + i*16, 424);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1464 + i*16, 568);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1480 + i*16, 440);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1480 + i*16, 456);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1480 + i*16, 472);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1480 + i*16, 488);
        addObject(new platforms1(), 1496, 504);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1496 + i*16, 520);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1496 + i*16, 536);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1496 + i*16, 552);
    }
    
    //adds the final platform at the end (L - R)
    private void finalIsland()
    {
        addObject(new platforms1(), 1432, 264);
        for(int i = 0; i<2; i++)addObject(new platforms1(), 1432 + i * 16, 280);
        for(int i = 0; i<4; i++)addObject(new platforms1(), 1448 + i*16, 248);
        addObject(new platforms1(), 1464, 296);
        addObject(new platforms1(), 1480, 312);
        for(int i = 0; i<2; i++)addObject(new platforms1(), 1496 + i * 16, 328);
        for(int i = 0; i<2; i++)addObject(new platforms1(), 1512 + i * 16, 264);
        addObject(new platforms1(), 1528, 344);
    }
    
    private void iceberg()
    {
        icebergTop();
        icebergBottom();
    }
    
    //adds the iceberg above water y < 280 (L - R)
    private void icebergTop()
    {
        for(int i = 0; i<3; i++)addObject(new platforms1(), 520, 248 - i*16);
        addObject(new platforms1(), 536, 200);
        for(int i = 0; i<2; i++)addObject(new platforms1(), 536, 264 + i*16);
        addObject(new platforms1(), 552, 184);
        addObject(new platforms1(), 568, 168);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 584 + i*16, 136);
        addObject(new platforms1(), 584, 152);
        for(int i = 0; i<4; i++)addObject(new platforms1(), 632, 72 + i*16);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 648 + i*16, 72);
        for(int i = 0; i<4; i++) addObject(new platforms1(), 680 + i*16, 56);
        addObject(new platforms1(), 744, 72);
        addObject(new platforms1(), 760, 88);
        for(int i = 0; i<2; i++)addObject(new platforms1(), 776 + i*16, 104);
        addObject(new platforms1(), 792, 120);
        addObject(new platforms1(), 808, 136);
        addObject(new platforms1(), 824, 152);
        addObject(new platforms1(), 840, 168);
        addObject(new platforms1(), 856, 184);
        for(int i = 0; i<2; i++)addObject(new platforms1(), 872 + i*16, 200);
        for(int i = 0; i<2; i++)addObject(new platforms1(), 888, 216 + i * 16);
        for(int i = 0; i<2; i++)addObject(new platforms1(), 904, 248 + i * 16);
        }
    
    //adds the bottom of the iceberg below water level y >= 280 (L - R)
    private void icebergBottom()
    {
        for(int i = 0; i < 2; i++)addObject(new platforms1(), 552, 296 + i * 16);
        for(int i = 0; i < 3; i++)addObject(new platforms1(), 568, 328 + i * 16);
        for(int i = 0; i<2; i++)addObject(new platforms1(), 568 + i*16, 360);
        addObject(new platforms1(), 600, 376);
        addObject(new platforms1(), 616, 392);
        for(int i = 0; i<2; i++)addObject(new platforms1(), 632 + i*16, 408);
        for(int i = 0; i<2; i++)addObject(new platforms1(), 664 + i*16, 424);
        for(int i = 0; i<5; i++)addObject(new platforms1(), 696 + i*16, 440);
        for(int i = 0; i<3; i++)addObject(new platforms1(), 776 + i*16, 424);
        for(int i = 0; i<2; i++)addObject(new platforms1(), 824, 408 - i * 16);
        for(int i = 0; i<2; i++)addObject(new platforms1(), 840, 376 - i * 16);
        addObject(new platforms1(), 856, 344);
        for(int i = 0; i<2; i++)addObject(new platforms1(), 872, 328 - i * 16);
        for(int i = 0; i<2; i++)addObject(new platforms1(), 888, 296 - i * 16);
    }
    
    //adds water outside of the tunnel on the left (L - R)
    private void openWater()
    {
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
    }
    
    //adds water inside the tunnel system 
    private void tunnelWater()
    {
        for(int i = 0; i<18;i++)addObject(new Water(), 1256+i*16,600);
        for(int i = 0; i<6;i++)addObject(new Water(), 1288+i*16, 584);
        for(int i = 0; i<5;i++)addObject(new Water(), 1288+i*16, 568);
        for(int i = 0; i<3;i++)addObject(new Water(), 1304+i*16, 552);
        for(int i = 0; i<6;i++)addObject(new Water(), 1336+i*16, 536);
        for(int i = 0; i<5;i++)addObject(new Water(), 1336+i*16, 520);
        for(int i = 0; i<5;i++)addObject(new Water(), 1336+i*16, 504);
        for(int i = 0; i<5;i++)addObject(new Water(), 1336+i*16, 488);
        for(int i = 0; i<4;i++)addObject(new Water(), 1336+i*16, 472);
        for(int i = 0; i<3;i++)addObject(new Water(), 1352+i*16, 456);
        for(int i = 0; i<2;i++)addObject(new Water(), 1352+i*16, 440);
        for(int i = 0; i<7;i++)addObject(new Water(), 1384+i*16, 552);
        for(int i = 0; i<4;i++)addObject(new Water(), 1400+i*16, 568);
        for(int i = 0; i<3;i++)addObject(new Water(), 1448+i*16, 536);
        for(int i = 0; i<2;i++)addObject(new Water(), 1464+i*16, 520);
        for(int i = 0; i<2;i++)addObject(new Water(), 1464+i*16, 504);
        for(int i = 0; i<2;i++)addObject(new Water(), 1448+i*16, 488);
        for(int i = 0; i<2;i++)addObject(new Water(), 1448+i*16, 472);
        for(int i = 0; i<3;i++)addObject(new Water(), 1432+i*16, 456);
        for(int i = 0; i<3;i++)addObject(new Water(), 1432+i*16, 440);
        for(int i = 0; i<3;i++)addObject(new Water(), 1416+i*16, 424);
        for(int i = 0; i<3;i++)addObject(new Water(), 1416+i*16, 408);
        for(int i = 0; i<3;i++)addObject(new Water(), 1400+i*16, 392);
        for(int i = 0; i<3;i++)addObject(new Water(), 1400+i*16, 376);
        for(int i = 0; i<3;i++)addObject(new Water(), 1384+i*16, 360);
        for(int i = 0; i<3;i++)addObject(new Water(), 1368+i*16, 344);
        for(int i = 0; i<4;i++)addObject(new Water(), 1352+i*16, 328);
        for(int i = 0; i<13;i++)addObject(new Water(), 1176+i*16, 312);
        for(int i = 0; i<10;i++)addObject(new Water(), 1208+i*16, 296);
        for(int i = 0; i<5;i++)addObject(new Water(), 1144+i*16, 328);
        for(int i = 0; i<4;i++)addObject(new Water(), 1128+i*16, 344);
        for(int i = 0; i<4;i++)addObject(new Water(), 1096+i*16, 360);
        for(int i = 0; i<4;i++)addObject(new Water(), 1080+i*16, 376);
        for(int i = 0; i<3;i++)addObject(new Water(), 1064+i*16, 392);
        for(int i = 0; i<3;i++)addObject(new Water(), 1048+i*16, 408);
        for(int i = 0; i<3;i++)addObject(new Water(), 1032+i*16, 424);
        for(int i = 0; i<3;i++)addObject(new Water(), 1016+i*16, 440);
        for(int i = 0; i<3;i++)addObject(new Water(), 1016+i*16, 456);
        for(int i = 0; i<2;i++)addObject(new Water(), 1016+i*16, 472);
        for(int i = 0; i<7;i++)addObject(new Water(), 1016+i*16, 488);
        for(int i = 0; i<5;i++)addObject(new Water(), 1032+i*16, 504);
        for(int i = 0; i<3;i++)addObject(new Water(), 1080+i*16, 472);
        for(int i = 0; i<2;i++)addObject(new Water(), 1096+i*16, 456);
        for(int i = 0; i<4;i++)addObject(new Water(), 1096+i*16, 440);
        for(int i = 0; i<2;i++)addObject(new Water(), 1112+i*16, 424);
        for(int i = 0; i<4;i++)addObject(new Water(), 1144+i*16, 456);
        addObject(new Water(), 1144, 472);
        for(int i = 0; i<3;i++)addObject(new Water(), 1192+i*16, 440);
        for(int i = 0; i<2;i++)addObject(new Water(), 1224, 456+i*16);
        for(int i = 0; i<4;i++)addObject(new Water(), 1176+i*16, 488);
        for(int i = 0; i<3;i++)addObject(new Water(), 1160+i*16, 504);
        for(int i = 0; i<4;i++)addObject(new Water(), 1128+i*16, 520);
        for(int i = 0; i<11;i++)addObject(new Water(), 984+i*16, 536);
        for(int i = 0; i<9;i++)addObject(new Water(), 1000+i*16, 552);
        for(int i = 0; i<5;i++)addObject(new Water(), 1032+i*16, 568);
        for(int i = 0; i<3;i++)addObject(new Water(), 968+i*16, 520);
        for(int i = 0; i<4;i++)addObject(new Water(), 936+i*16, 504);
        for(int i = 0; i<4;i++)addObject(new Water(), 936+i*16, 488);
        for(int i = 0; i<4;i++)addObject(new Water(), 936+i*16, 472);
        for(int i = 0; i<3;i++)addObject(new Water(), 952+i*16, 456);
        for(int i = 0; i<3;i++)addObject(new Water(), 952+i*16, 440);
        for(int i = 0; i<2;i++)addObject(new Water(), 968+i*16, 424);
        for(int i = 0; i<3;i++)addObject(new Water(), 968+i*16, 408);
        for(int i = 0; i<3;i++)addObject(new Water(), 984+i*16, 392);
        for(int i = 0; i<4;i++)addObject(new Water(), 984+i*16, 376);
        for(int i = 0; i<5;i++)addObject(new Water(), 984+i*16, 360);
        for(int i = 0; i<5;i++)addObject(new Water(), 1000+i*16, 344);
        for(int i = 0; i<6;i++)addObject(new Water(), 1016+i*16, 328);
        for(int i = 0; i<7;i++)addObject(new Water(), 1032+i*16, 312);
        for(int i = 0; i<4;i++)addObject(new Water(), 1096+i*16, 296);
        for(int i = 0; i<4;i++)addObject(new Water(), 1128+i*16, 280);
        for(int i = 0; i<4;i++)addObject(new Water(), 1480+i*16, 584);
        for(int i = 0; i<2;i++)addObject(new Water(), 1512+i*16, 568);
        for(int i = 0; i<3;i++)addObject(new Water(), 1528, 520+i*16);
        for(int i = 0; i<2;i++)addObject(new Water(), 1512+i*16, 504);
        for(int i = 0; i<2;i++)addObject(new Water(), 1512+i*16, 488);
        for(int i = 0; i<2;i++)addObject(new Water(), 1512+i*16, 472);
        for(int i = 0; i<2;i++)addObject(new Water(), 1512+i*16, 456);
        for(int i = 0; i<2;i++)addObject(new Water(), 1512+i*16, 440);
        for(int i = 0; i<2;i++)addObject(new Water(), 1512+i*16, 424);
        for(int i = 0; i<3;i++)addObject(new Water(), 1496+i*16, 408);
        for(int i = 0; i<4;i++)addObject(new Water(), 1480+i*16, 392);
        for(int i = 0; i<4;i++)addObject(new Water(), 1480+i*16, 376);
        for(int i = 0; i<5;i++)addObject(new Water(), 1464+i*16, 360);
        for(int i = 0; i<5;i++)addObject(new Water(), 1448+i*16, 344);
        for(int i = 0; i<4;i++)addObject(new Water(), 1432+i*16, 328);
        for(int i = 0; i<3;i++)addObject(new Water(), 1432+i*16, 312);
        for(int i = 0; i<4;i++)addObject(new Water(), 1400+i*16, 296);
        for(int i = 0; i<3;i++)addObject(new Water(), 1384+i*16, 280);
    }
    
    //reset coins on death
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
