import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LinkedBigButton here.
 * 
 * @author Jeremiah Whitehurst 
 * @version 04-27-2024
 */
public class LinkedBigButton extends Button
{
    public LinkedBigButton (String imageName, World link) {
        super(imageName, 170, 80);
        setLink(link);
    }
    
    public void onClick() {
        Greenfoot.setWorld(getLink());
    }
}
