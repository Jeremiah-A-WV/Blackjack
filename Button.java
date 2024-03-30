import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private World link;
    public Button(String image, int width, int height, World link) {
        GreenfootImage display = new GreenfootImage(image);
        display.scale(width, height);
        setImage(display);
        this.link = link;
    }
    
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // If this Button is clicked, set world to the link
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(this.link);
        }
    }
}
