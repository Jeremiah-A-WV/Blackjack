import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{
    String playerName;
    /**
     * Constructor for objects of class Start.
     * 
     */
    public Start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 800, 1); 
        playerName = Greenfoot.ask("Please enter your name");
        Button button = new StartButton("startButton.png", 100, 60, new Game(this)); // Enter image path
        addObject(button, 550, 400);
    }
    
    public String getPlayerName() {
        return playerName;
    }
}
