import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{
    GreenfootImage defaultGameScreen = new GreenfootImage("jazzGameScreen.png");
    Button menu = new MenuButton("Menu_Button.png", 100, 75);
    Button hitButton = new HitButton("HitButton.png", 280, 210);
    Button standButton = new StandButton("StandButton.png", 280, 210);
    Button dealButton = new DealButton("DealButton.png", 280, 210);
    Deck newDeck = new Deck(1);
    /**
     * Constructor for objects of class Game.
     * 
     */
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 800, 1);
        setBackground(defaultGameScreen);
        addObject(menu, 1000, 30);
        addObject(dealButton, 1000, 600);
        addObject(hitButton, 1000, 640);
        addObject(standButton, 1000, 680);
        addObject(newDeck, 400, 260);
    }
}
