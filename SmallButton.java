import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SmallButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SmallButton extends Button
{
    public SmallButton () {
        super(80, 80);
    }
    
    public SmallButton(World link) {
        this();
        setLink(link);
    }
    
    public SmallButton (String imageName, World link) {
        super(imageName, 80, 80);
        setLink(link);
    }
    
    public void onClick() {
        if (getLink() != null) {
            Greenfoot.setWorld(getLink());
        }
    }
}
