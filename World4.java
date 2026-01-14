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
    /**
     * Constructor for objects of class World4.
     * 
     */
    public World4(Player player)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1537, 608, 1, false); 
        setBackground("world4.png");
        
        //addObject(new Portal(), 130, 260);//test portal
        
        prepare(player);
    }
    
    private void prepare(Player player)
    {
        //add starting objects
        addObject(new SpawnPoint(), 160, 260);
        addObject(player, 160, 260); 
        addObject(new Portal(), 1528, 248);
        addObject(new Coin(false), 216, 360);
        addObject(new Coin(false), 1160, 392);
        addObject(new Coin(false), 632, 120);
        addObject(new Coin(false), 1320, 344);
        
        //add anti-cheese
        addObject(new Spike(), 1190, 234);
        
        //add first island
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
        
        
        //add first half of water and bottom void
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
        
        //add bottom left platforms
        for(int i = 0; i<2; i++) addObject(new platforms1(), 8 + i*16, 504);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 24 + i*16, 520);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 40 + i*16, 536);
        for(int i = 0; i<7; i++) addObject(new platforms1(), 72 + i*16, 552);
        for(int i = 0; i<4; i++) addObject(new platforms1(), 168 + i*16, 568);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 216 + i*16, 584);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 248 + i*16, 600);
        
        //add tunnel platforms
        for(int i = 0; i<5; i++) addObject(new platforms1(), 440 + i*16, 600);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 504 + i*16, 584);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 536 + i*16, 568);
        for(int i = 0; i<4; i++) addObject(new platforms1(), 568 + i*16, 552);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 616 + i*16, 536);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 648 + i*16, 520);
        for(int i = 0; i<8; i++) addObject(new platforms1(), 680 + i*16, 504);
        for(int i = 0; i<5; i++) addObject(new platforms1(), 792 + i*16, 520);
        addObject(new platforms1(), 856,504);
        addObject(new platforms1(), 856, 488);
        addObject(new platforms1(), 856, 472);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 856 + i*16, 456);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 872 + i*16, 440);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 872 + i*16, 424);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 888 + i*16, 408);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 904 + i*16, 392);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 904 + i*16, 376);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 920 + i*16, 360);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 936 + i*16, 344);
        addObject(new platforms1(), 952, 328);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 952 + i*16, 312);
        addObject(new platforms1(), 968, 296);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 968 + i*16, 280);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 984 + i*16, 264);
        for(int i = 0; i<7; i++) addObject(new platforms1(), 1000 + i*16, 248);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1096 + i*16, 264);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1080 + i*16, 280);
        for(int i = 0; i<5; i++) addObject(new platforms1(), 1016 + i*16, 296);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1000 + i*16, 312);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 984 + i*16, 328);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 968 + i*16, 344);
        addObject(new platforms1(), 968, 360);
        addObject(new platforms1(), 968, 376);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 952 + i*16, 392);
        addObject(new platforms1(), 952, 408);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 936 + i*16, 424);
        addObject(new platforms1(), 936, 440);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 920 + i*16, 456);
        addObject(new platforms1(), 920, 472);
        addObject(new platforms1(), 920, 488);
        addObject(new platforms1(), 920, 504);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 920 + i*16, 520);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 952 + i*16, 536);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 968 + i*16, 552);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 984 + i*16, 568);
        for(int i = 0; i<7; i++) addObject(new platforms1(), 1016 + i*16, 584);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1112 + i*16, 568);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1144 + i*16, 552);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1160 + i*16, 536);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1192 + i*16, 520);
        addObject(new platforms1(), 1192, 552);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1192 + i*16, 568);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1208 + i*16, 584);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1224 + i*16, 600);
        addObject(new platforms1(), 1240, 616);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1208 + i*16, 504);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1240 + i*16, 488);
        addObject(new platforms1(), 1240, 472);
        addObject(new platforms1(), 1240, 456);
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
        addObject(new platforms1(), 1320, 392);
        addObject(new platforms1(), 1320, 408);
        addObject(new platforms1(), 1320, 424);
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
        
        //add second half of tunnel platforms
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1352 + i*16, 552);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1368 + i*16, 568);
        for(int i = 0; i<6; i++) addObject(new platforms1(), 1384 + i*16, 584);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1464 + i*16, 568);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1496 + i*16, 552);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1496 + i*16, 536);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1496 + i*16, 520);
        addObject(new platforms1(), 1496, 504);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1480 + i*16, 488);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1480 + i*16, 472);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1480 + i*16, 456);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1480 + i*16, 440);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1464 + i*16, 424);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1464 + i*16, 408);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1448 + i*16, 392);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1448 + i*16, 376);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1432 + i*16, 360);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1416 + i*16, 344);
        addObject(new platforms1(), 1416, 328);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1384 + i*16, 312);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1368 + i*16, 296);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1336 + i*16, 280);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1336 + i*16, 264);
        for(int i = 0; i<11; i++) addObject(new platforms1(), 1192 + i*16, 248);
        for(int i = 0; i<7; i++) addObject(new platforms1(), 1240 + i*16, 232);
        for(int i = 0; i<6; i++) addObject(new platforms1(), 1192 + i*16, 264);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1192 + i*16, 280);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1160 + i*16, 296);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1144 + i*16, 312);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1112 + i*16, 328);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1080 + i*16, 344);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1064 + i*16, 360);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1048 + i*16, 376);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1032 + i*16, 392);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1016 + i*16, 408);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1000 + i*16, 424);
        addObject(new platforms1(), 1000, 440);
        addObject(new platforms1(), 1000, 456);
        addObject(new platforms1(), 1000, 472);
        addObject(new platforms1(), 1000, 488);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1000 + i*16, 504);
        for(int i = 0; i<7; i++) addObject(new platforms1(), 1016 + i*16, 520);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1112 + i*16, 504);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1128 + i*16, 488);
        for(int i = 0; i<4; i++) addObject(new platforms1(), 1160 + i*16, 472);
        addObject(new platforms1(), 1208, 456);
        addObject(new platforms1(), 1128, 472);
        addObject(new platforms1(), 1128, 456);
        
        //add island
        addObject(new platforms1(),1528,344);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1496 + i*16, 328);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1480 + i*16, 312);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1464 + i*16, 296);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1432 + i*16, 280);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 1432 + i*16, 264);
        for(int i = 0; i<4; i++) addObject(new platforms1(), 1448 + i*16, 248);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 1496 + i*16, 264);
        
        //add iceberg
        addObject(new platforms1(), 552, 296);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 552 + i*16, 312);
        addObject(new platforms1(), 568, 328);
        addObject(new platforms1(), 568, 344);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 568 + i*16, 360);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 600 + i*16, 376);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 616 + i*16, 392);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 632 + i*16, 408);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 664 + i*16, 424);
        for(int i = 0; i<5; i++) addObject(new platforms1(), 696 + i*16, 440);
        for(int i = 0; i<4; i++) addObject(new platforms1(), 760 + i*16, 424);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 808 + i*16, 408);
        addObject(new platforms1(), 824, 392);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 824 + i*16, 376);
        addObject(new platforms1(), 840, 360);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 840 + i*16, 344);
        addObject(new platforms1(), 856, 328);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 856 + i*16, 312);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 872 + i*16, 296);
        addObject(new platforms1(), 888, 280);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 888 + i*16, 264);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 888 + i*16, 248);
        for(int i = 0; i<2; i++)addObject(new platforms1(), 888, 232 - i*16);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 856 + i*16, 200);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 840 + i*16, 184);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 824 + i*16, 168);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 808 + i*16, 152);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 792 + i*16, 136);
        addObject(new platforms1(), 792, 120);
        for(int i = 0; i<3; i++) addObject(new platforms1(), 760 + i*16, 104);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 744 + i*16, 88);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 728 + i*16, 72);
        for(int i = 0; i<4; i++) addObject(new platforms1(), 680 + i*16, 56);
        for(int i = 0; i<4; i++) addObject(new platforms1(), 632 + i*16, 72);
        for(int i = 0; i<4; i++)addObject(new platforms1(), 632, 72 + i*16);
        for(int i = 0; i<4; i++) addObject(new platforms1(), 584 + i*16, 136);
        for(int i = 0; i<2; i++)addObject(new platforms1(), 584, 136 + i*16);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 568 + i*16, 168);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 552 + i*16, 184);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 536 + i*16, 200);
        for(int i = 0; i<2; i++) addObject(new platforms1(), 520 + i*16, 216);
        for(int i = 0; i<2; i++)addObject(new platforms1(), 520, 248 - i*16);
        for(int i = 0; i<3; i++)addObject(new platforms1(), 536, 248 + i*16);
        
        //add remaining water inside tunnels
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
