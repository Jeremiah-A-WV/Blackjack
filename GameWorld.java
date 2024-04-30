import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class GameWorld here.
 * 
 * @author Jeremiah Whitehurst 
 * @version 29-04-2024
 */
public class GameWorld extends World
{
    private Deck deck;
    private Hand dealerCards;
    private Hand playerCards;
    
    private boolean dealersTurn;
    private boolean gameOver;
    
    private int dealerScore;
    private int playerScore;
    
    private TextBox dealerScoreBox;
    private TextBox playerScoreBox;
    private TextBox restartBox;
    
    private StartWorld startWorld;

    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    public GameWorld(StartWorld startWorld)
    {    
        // Create a new world with 1100x619 cells with a cell size of 1x1 pixels.
        super(1100, 619, 1); 
        
        this.startWorld = startWorld;
        
        deck = new Deck(1);
        
        dealerScore = 0;
        playerScore = 0;
        
        dealerCards = new Hand("Dealer");
        playerCards = new Hand(startWorld.getName());
        
        dealersTurn = false;
        gameOver = false;
        
        dealerScoreBox = new TextBox(dealerCards.getName() + ": " + dealerScore);
        playerScoreBox = new TextBox(playerCards.getName() + ": " + playerScore);
        restartBox = new TextBox("Press here to restart!");
    
        newGame();
    }
    
    public Hand getPlayerCards() {
        return playerCards;
    }
    
    public Deck getDeck() {
        return deck;
    }
    
    public void switchTurn() {
        dealersTurn = true;
    }
    
    private void resetGame() {
        dealerCards.getCards().clear();
        playerCards.getCards().clear();
        
        deck.shuffle();
        
        dealersTurn = false;
        gameOver = false;
        dealerScore = 0;
        playerScore = 0;
    }
    
    private void removeAll() {
        ArrayList<Actor> actors = (ArrayList) getObjects(null);
        
        for (Actor actor: actors) {
            removeObject(actor);
        }
    }
    
    private void newGame() {
        resetGame();
        addButtons();
        addTextBoxes();
        
        Card card = deck.getCard();
        card.show();
        dealerCards.add(card);
        
        card = deck.getCard();
        dealerCards.add(card);
        
        dealerCards.calculateWeight();
        
        addObject( this.dealerCards.getCards().get(0), (getWidth() / 2) - 150 , 100 );
        addObject( this.dealerCards.getCards().get(1), (getWidth() / 2) - 40 , 100 );
        
        for (int i = 0; i < 2; i++) {
            card = deck.getCard();
            card.show();
            playerCards.add(card);
        }
        
        playerCards.calculateWeight();
        
        addObject( this.playerCards.getCards().get(0), (getWidth() / 2) - 150 , getHeight() - 100 );
        addObject( this.playerCards.getCards().get(1), (getWidth() / 2) - 40, getHeight() - 100 );
        
        updateTextBoxes();
    }
    
    public boolean isGameOver() {
        return gameOver;
    }
    
    public void endGame() {
        gameOver = true;
    }
    
    private void addButtons() {
        addObject( new StandButton(this), getWidth() - 140, (getHeight() / 2) - 80 );
        addObject( new HitButton(this), getWidth() - 140, (getHeight() / 2) + 80 );
    }
    
    private void addTextBoxes() {
        addObject( new TextBox(dealerCards.getName()), 50, 35 );
        addObject( this.dealerScoreBox, 59, 60 );
        
        addObject( new TextBox(playerCards.getName()), 50, getHeight() - 165 );
        addObject( this.playerScoreBox, 59, getHeight() - 140 );
    }
    private void updateTextBoxes() {
        dealerScoreBox.updateText(dealerCards.getName() + ": " + dealerScore);
        playerScoreBox.updateText(playerCards.getName() + ": " + playerScore);
    }
    
    /**
     * Act - do whatever the i wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (!gameOver) {
            
            if (playerScore >= 40) {
                switchTurn();
            }
            
            if (dealersTurn && dealerScore < 40) {
                for (Card card: dealerCards.getCards()) {
                    card.show();
                    dealerCards.calculateWeight();
                    updateTextBoxes();
                }
                
                if (dealerScore < playerScore && playerScore <= 40) {
                    this.getPlayerCards().add(this.getDeck().getCard());
                } else {
                    endGame();
                }
            } else  if (dealersTurn && dealerScore >= 40) {
                endGame();
            }
        } else {
            if (dealerScore <= 21 && dealerScore 
            >= playerScore || playerScore > 21) {
                addObject(new TextBox(dealerCards.getName() + " has won."), getWidth()/2, getHeight()/2);
            } else {
                addObject(new TextBox(playerCards.getName() + " has won! Woo-hoo!"), getWidth()/2, getHeight()/2);
            }
            
            addObject(restartBox, getWidth() / 2, (getHeight() / 2) + 20);
            
            if (Greenfoot.mouseClicked(restartBox)) {
                removeAll();
                newGame();
            }
        }
    }
}
