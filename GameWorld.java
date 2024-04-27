import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{
    GreenfootImage gameScreen = new GreenfootImage("jazzScreen.png");
    int playerCount = 0;
    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    public GameWorld()
    {    
        // Create a new world with 1100x619 cells with a cell size of 1x1 pixels.
        super(1100, 619, 1);
        SmallButton optionsButton = new SmallButton("small-OptionsButton.png", new OptionsWorld(this));
        SmallButton restartButton = new SmallButton("RestartButton.png", this);
        SmallButton rulesButton = new SmallButton("small-RulesButton.png", this);
        addObject(rulesButton, 810, 64);
        addObject(optionsButton, 900, 64);
        addObject(restartButton, 990, 64);
        setBackground(gameScreen);
    }
    
    public GameWorld(int playerCount) {
        this();
        this.playerCount = playerCount;
    }
}
