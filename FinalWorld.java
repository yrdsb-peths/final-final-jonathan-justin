import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class congradulations here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalWorld extends World
{

    /**
     * Constructor for objects of class FinalWorld.
     * 
     */
    public FinalWorld(Player player)
    {   
        super(385, 320, 1, false); 
        setBackground("finalworld.png");
        prepare(player);
    }
    
    private void prepare(Player player)
    {
        
        addObject(player, 50, 50);
        //add ground platforms
        for(int i = 0; i < 5; i++)addObject(new platforms1(), 8 + i * 16, 264);
        for(int i = 0; i < 10; i++)addObject(new platforms1(), 120 + i * 16, 264);
        for(int i = 0; i < 5; i++)addObject(new platforms1(), 376 - i *16, 264);
        addObject(new platforms1(), 72, 280);
        for(int i = 0; i < 4; i++)addObject(new platforms1(), 72+i*16, 296);
        addObject(new platforms1(), 120, 280);
        addObject(new platforms1(), 264, 280);
        for(int i = 0; i<4; i++)addObject(new platforms1(), 312 - i*16,296);
        addObject(new platforms1(), 312, 280);
        
        //add individual small slab platforms on top
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
        
        //3rd layer of double slabs on top
        for(int i = 0; i<2; i++)addObject(new platforms2(), 8+i*16, 164);
        for(int i = 0; i<2; i++)addObject(new platforms2(), 56+i*16, 164);
        for(int i = 0; i<2; i++)addObject(new platforms2(), 120+i*16, 164);
        for(int i = 0; i<2; i++)addObject(new platforms2(), 168+i*16, 164);
        for(int i = 0; i<2; i++)addObject(new platforms2(), 200+i*16, 164);
        for(int i = 0; i<2; i++)addObject(new platforms2(), 248+i*16, 164);
        for(int i = 0; i<2; i++)addObject(new platforms2(), 312+i*16, 164);
        for(int i = 0; i<2; i++)addObject(new platforms2(), 360+i*16, 164);
        
        //water
        for(int i = 0; i<2; i++)addObject(new Water(), 88+i*16, 264);
        for(int i = 0; i<2; i++)addObject(new Water(), 88+i*16, 280);
        for(int i = 0; i<2; i++)addObject(new Water(), 280+i*16, 264);
        for(int i = 0; i<2; i++)addObject(new Water(), 280+i*16, 280);
        
    }
}
