import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HitButton here.
 * 
 * @author Jeremiah Whitehurst 
 * @version 29-04-2024
 */
public class HitButton extends GameButton
{
    public HitButton(GameWorld world) {
        super(world);
    }
    
    public void onClick() {
        
    }
    /**
     * Act - do whatever the HitButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this) && !getWorld().isGameOver()) {
            onClick();
        }
    }
}
