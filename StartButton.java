import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Button
{
    
    GreenfootImage image = new GreenfootImage("startButton.png");
    
    public StartButton (World link) {
        this.getImage().scale(170, 80);
        setImage(this.getImage());
        onClick(link);
    }
    public void onClick(World link) {
        Greenfoot.setWorld(link);
    }
}
