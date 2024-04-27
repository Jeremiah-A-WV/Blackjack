import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BigButton here.
 * 
 * @author Jeremiah Whitehurst 
 * @version 04-27-2024
 */
public class BigButton extends Button
{
    public BigButton () {
        super(170, 80);
    }
    
    public BigButton (String imageName) {
        super(imageName, 170, 80);
    }
    
    public BigButton(World link) {
        this();
        setLink(link);
    }
    
    public BigButton (String imageName, World link) {
        this(imageName);
        setLink(link);
    }
    
    public void onClick() {
        if (getLink() != null) {
            Greenfoot.setWorld(getLink());
        }
    }
}
