import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author Jeremiah Whitehurst 
 * @version 29-04-2024
 */
public class Button extends Actor
{
    /**
     * Button constructor.
     * 
     * Sets the dimensions of the button.
     */
    public Button(int width, int height) {
        getImage().scale(width, height);
    }
    
    /**
     * onClick - method to be ran when a Button type is clicked on.
     */
    public void onClick() {}
    
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     * In this case, run the onClick method when a button is pressed.
     */
    public void act()
    {
        if (Greenfoot.mousePressed(this)) {
            onClick();
        }
    }
}
