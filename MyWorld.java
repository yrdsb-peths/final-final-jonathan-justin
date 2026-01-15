import greenfoot.*;
/**
 * starting world, should immediately teleport player to first world
 */
public class MyWorld extends World {
    /**
     * sets the world to the first levelt
     */
    public MyWorld() {
        super(305, 400, 1, false);
        Greenfoot.setWorld(new TitlePage());
    }
}
