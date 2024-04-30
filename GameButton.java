import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameButton here.
 * 
 * @author Jeremiah Whitehurst 
 * @version 29-04-2024
 */
public class GameButton extends Button
{
    GameWorld world;
    /**
     * GameButton constructor.
     */
    public GameButton(GameWorld world) {
        super(150, 60);
        this.world = world;
    }
    
    public GameWorld getWorld() {
        return world;
    }
}
