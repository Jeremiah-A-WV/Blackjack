import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartWorld extends World
{
    GreenfootSound defaultMusic = new GreenfootSound("Gimme_Gimme.mp3");
    /**
     * Constructor for objects of class StartWorld.
     * 
     */
    public StartWorld()
    {    
        // Create a new world with 1100x619 cells with a cell size of 1x1 pixels.
        super(1100, 619, 1); 
        LinkedBigButton startButton = new LinkedBigButton("StartButton.png", new GameWorld());
        LinkedBigButton rulesButton = new LinkedBigButton("RulesButton.png", new RulesWorld(this));
        addObject(startButton, 550, 400);
        addObject(rulesButton, 990, 550);
        defaultMusic.playLoop();
    }
}
