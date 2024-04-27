import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartWorld extends World
{
    GreenfootSound music = new GreenfootSound("Gimme_Gimme.mp3");
    int playerCount = 0;
    /**
     * Constructor for objects of class StartWorld.
     * 
     */
    public StartWorld()
    {    
        // Create a new world with 1100x619 cells with a cell size of 1x1 pixels.
        super(1100, 619, 1); 
        BigButton startButton = new BigButton("StartButton.png", new GameWorld());
        BigButton rulesButton = new BigButton("RulesButton.png", new RulesWorld(this));
        BigButton optionsButton = new BigButton("OptionsButton.png", new OptionsWorld(this));
        
        addObject(startButton, 550, 400);
        addObject(rulesButton, 990, 550);
        addObject(optionsButton, 550, 490);
        music.playLoop();
    }
    
    public int getPlayerCount() {
        return playerCount;
    }
    
    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }
}
