import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(800, 600, 1, false);
        Player player = new Player();
        addObject(player, 26, getHeight() - 25);
    }
}
