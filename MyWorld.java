import greenfoot.*;
/**
 * starting world, should immediately teleport player to first world
 */
public class MyWorld extends World {
    public MyWorld() {
        //set world to first level
        super(305, 400, 1, false);
        Greenfoot.setWorld(new World1());
    }
}
