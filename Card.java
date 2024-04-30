import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Card here.
 * 
 * @author Jeremiah Whitehurst 
 * @version 29-04-2024
 */
public class Card extends Actor
{
    private final GreenfootImage BACK_OF_CARD = new GreenfootImage("cards/misc/red_back.png");
    
    private Suit suit;
    private Rank rank;
    private boolean isShowing;
    GreenfootImage frontOfCard;
    
    public Card(Suit suit, Rank rank) {
        this.isShowing = isShowing;
        this.suit = suit;
        this.rank = rank;
        this.isShowing = false;
        
        frontOfCard = new GreenfootImage("cards/" + this.suit + "/" + this.rank + "_of_" + this.suit + ".png");
        frontOfCard.scale(100, 145);
        BACK_OF_CARD.scale(100, 145);
        setImage(BACK_OF_CARD);
    }
    
    public Suit getSuit() {
        return suit;
    }
    public Rank getRank() {
        return rank;
    }
    
    public boolean isShowing() {
        return isShowing;
    }
    
    public void show() {
        isShowing = true;
        
        getImage().clear();
        getImage().drawImage(frontOfCard, 0, 0);
    }
    
    public void hide()
    {
        isShowing = false;
        setImage(BACK_OF_CARD);
    }
    
    @Override
    public String toString(){
        if (isShowing){
            return ""+rank+suit;
        }
        return "??";
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Card card = (Card) o;

        if (rank != card.rank) return false;
        return suit == card.suit;
    }
}
