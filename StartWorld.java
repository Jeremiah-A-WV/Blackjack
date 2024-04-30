import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartWorld here.
 * 
 * @author Jeremiah Whitehurst 
 * @version 29-04-2024
 */
public class StartWorld extends World
{
    private String name = Greenfoot.ask("Please enter your name:");
    
    /**
     * Constructor for objects of class StartWorld.
     * 
     */
    public StartWorld()
    {    
        // Create a new world with 1100x619 cells with a cell size of 1x1 pixels.
        super(1100, 619, 1); 
        
        addObject(new StartButton(new GameWorld(this)), getWidth() / 2, getHeight() / 2 + 80);
        addObject(new MusicButton(new MusicWorld()), getWidth() / 2, getHeight() / 2 + 160);
        addObject(new RuleButton(new RuleWorld()), getWidth() / 2, getHeight() / 2 + 240);
    }
    
    public String getName() {
        return name;
    }
}
