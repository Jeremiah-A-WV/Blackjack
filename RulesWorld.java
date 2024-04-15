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
    public RulesWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 800, 1);
        this.showText("This is a modified version of the Blackjack game", 300, 50);
        this.showText("Here are the rules:", 139, 100);
        /* Each player attempts to beat the dealer by getting
         * as close to 40 as possible, without going over
         * 40.
         */ 
        this.showText("\u25cf To win, you have to get as close to 40 as possible," + 
        "without going over 40", 450, 150);
        /* Depending on the current value of your deck, an ace
         * is scored either as a 1 or 11. Face cards are 10, and
         * all other cards correspond with their own values.
         */
        this.showText("\u25cf Ace = 1 or 11 depending on value of the deck", 360, 200);
        this.showText("\u25cf Face cards = 10", 200, 250);
        this.showText("\u25cf Number cards = number value", 280, 300);
        /* A player can choose to either Hit or Stand depending on
         * the value of their current deck. A Hit is when it is your
         * turn and you pick another card, and a Stand is when you
         * decide to pass, keeping your current deck.
         */
        this.showText("\u25cf But there's a twist!", 165, 350);
        /* But there's a twist!
         * Diamond cards utilize multiplication instead of addition
         * so be wary when you decide to Hit.
         */
        this.showText("\u25cf Diamond cards use multiplication", 295, 400);
    }
}
