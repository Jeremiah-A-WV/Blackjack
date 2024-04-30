import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StandButton here.
 * 
 * @author Jeremiah Whitehurst 
 * @version 29-04-2024
 */
public class StandButton extends GameButton
{
    public StandButton(GameWorld world) {
        super(world);
    }
    public void onClick() {
        getWorld().switchTurn();
    }
    /**
     * Act - do whatever the StandButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this) && !getWorld().isGameOver()) {
            onClick();
        }
    }
}
