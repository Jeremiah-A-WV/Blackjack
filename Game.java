import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{
    private Deck deck;
    private BlackjackHand dealerCards;
    private BlackjackHand playerCards;
    private boolean dealersTurn;
    private boolean gameOver;
    
    private int dealerScore;
    private int playerScore;
    GreenfootImage defaultGameScreen = new GreenfootImage("jazzGameScreen.png");
    Button menu = new MenuButton("Menu_Button.png", 100, 75);
    Button hitButton = new HitButton("HitButton.png", 280, 210);
    Button standButton = new StandButton("StandButton.png", 280, 210);
    ArrayList<BlackjackHand> inGame = new ArrayList<BlackjackHand>();
    /**
     * Constructor for objects of class Game.
     * 
     */
    public Game(Start link)
    {    
        super(1100, 800, 1);
        this.deck = new Deck(1);
        this.dealerCards = new BlackjackHand("Dealer");
        this.playerCards = new BlackjackHand(link.getPlayerName());
        inGame.add(dealerCards);
        inGame.add(playerCards);
        setBackground(defaultGameScreen);
        addObject(menu, 1000, 30);
        addObject(hitButton, 1000, 640);
        addObject(standButton, 1000, 680);
        addObject(deck, 400, 260);
        addObject(dealerCards, 552, 267);
        addObject(playerCards, 671, 594);
        for (BlackjackHand actor: inGame) {
            actor.add(deck.getCard());
            actor.add(deck.getCard());
        }
        dealerCards.getCard().show();
        playerCards.getCard().show();
    }
}
