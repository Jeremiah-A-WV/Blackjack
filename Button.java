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
    GreenfootSound buttonSound = new GreenfootSound("Button_Click.mp3");
    
    public Button() {
        
    }
     
    // Linked button
    public Button (int width, int height, World link) {
        this.getImage().scale(width, height);
        setImage(this.getImage());
        this.link = link;
    }
    
    // Linked buttons
    public Button(String image, int width, int height, World link) {
        GreenfootImage display = new GreenfootImage(image);
        display.scale(width, height);
        setImage(display);
        this.link = link;
    }
    
    
    // TO BE IMPLEMENTED LATER -- COMMAND BUTTONS ("HIT", "STAND", etc.)
    public Button(String image, int width, int height) {
        GreenfootImage display = new GreenfootImage(image);
        display.scale(width, height);
        setImage(display);
    }
    
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            buttonSound.play();
            onClick();
        }
    }
    
    public void onClick() {
        
    }
}
