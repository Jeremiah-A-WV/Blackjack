import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LinkedBigButton here.
 * 
 * @author Jeremiah Whitehurst 
 * @version 29-04-2024
 */
public class LinkedBigButton extends Button
{
    World link; // World that the button "links" to
    
    /**
     * LinkedBigButton constructor.
     * 
     * Sets link equal to link parameter.
     */
    public LinkedBigButton(World link) {
        super(150, 60);
        this.link = link;
    }

    /**
     * onClick - method to be ran when a LinkedBigButton type is clicked on.
     * 
     * Sets world equal to link.
     */
    public void onClick() {
        Greenfoot.setWorld(link);
    }
}
