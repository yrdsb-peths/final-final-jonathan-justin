import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(800, 600, 1, false);
        addObject(new Player(), 26, getHeight() - 26);
    }
}
