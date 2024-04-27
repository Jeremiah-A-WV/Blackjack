import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LinkedSmallButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LinkedSmallButton extends Button
{
    public LinkedSmallButton (String imageName, World link) {
        super(imageName, 80, 80);
        setLink(link);
    }
    
    public void onClick() {
        Greenfoot.setWorld(getLink());
    }
}
