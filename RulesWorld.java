import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RulesWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RulesWorld extends World
{

    /**
     * Constructor for objects of class RulesWorld.
     * 
     */
    public RulesWorld(World link)
    {    
        // Create a new world with 1100x619 cells with a cell size of 1x1 pixels.
        super(1100, 619, 1);
        BackButton backButton = new BackButton(link);
        addObject(backButton, 110, 550);
    }
}
