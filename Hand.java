import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Hand here.
 * 
 * @author Jeremiah Whitehurst 
 * @version 29-04-2024
 */
public class Hand extends Deck
{
    public static final int BLACKJACK = 40;
    public static final int BUST = -1;
    
    private String name;
    private boolean isDealer;
    private int weight;
    
    public Hand(String name) {
        this.name = name;
        if (name.equals("Dealer")) {
            isDealer = true;
        } else {
            isDealer = false;
        }
        weight = 40;
    }
    
    public String getName() {
        return name;
    }
    
    private int getWeight(Rank rank) {
        return rank.getRank();
    }
    
    /**
     * Calculates the weight of this blackjack hand based on the cards that are face up.
     */
    public void calculateWeight(){
        int[] weight = {0, 0};
        List<Card> cards = getCards();
        int numOfCards = getSize();

        for(Card card: cards){
            if (!card.isShowing()){
                continue;  // if the card is face down don't include in weight
            }
            int currentCardValue = getWeight(card.getRank());
            if (card.getRank() != Rank.ACE){
                weight[0] += currentCardValue;
                weight[1] += currentCardValue;
            } else {
                if (11+Math.max(weight[0],weight[1]) > 40){
                    int minWeight = Math.min(weight[0],weight[1]);
                    weight[0] = 1 + minWeight;
                    weight[1] = 11 + minWeight;
                } else {
                    weight[0] += 1;
                    weight[1] += 11;
                }
            }
        }
        // calculate the weight of the hand
        this.weight = Math.max(weight[0],weight[1]);
        if (this.weight > 40){
            this.weight = Math.min(weight[0],weight[1]);
        }
        // check for Blackjack or Bust
        if (this.weight > 40){
            this.weight = BUST;
        } else if (getSize() == 2 && this.weight == 40){
            this.weight = BLACKJACK;
        }
    }
    
    public int getWeight()
    {
        return weight;
    }
    
    protected void setImage() {
        List<Card> cards = getCards();
        
        int numOfCards = cards.size();
        
        if (numOfCards > 0) {
            GreenfootImage cardImage = cards.get(0).getImage();
            int width = 1100 / 2;
            int height = 619;
            int widthInc = width - 150 + (110 * numOfCards);
            int heightInc;
            
            if (isDealer) {
                heightInc = 100;
            } else {
                heightInc = height - 100;
            }
            GreenfootImage image = new GreenfootImage(widthInc, 
                                                        heightInc);
            int x = 0;
            int y = 0;
            for(Card card: cards){
                image.drawImage(card.getImage(),x,y);
                x += widthInc;
                y += heightInc;
            }
            setImage(image);
        }
    }
    
    public void add(Card aCard) {
        super.add(aCard);
        setImage();
        calculateWeight();
    }
    
    public boolean remove(Card aCard){
        boolean isDone = super.remove(aCard);
        setImage();
        if (isDone) {
            calculateWeight();
        }
        return isDone;
    }
    
    public void show()
    {
        List<Card> cards = getCards();
        for(Card card: cards){
            card.show();
        }
        setImage();
        calculateWeight();
    }
    
    public void hide()
    {
        List<Card> cards = getCards();
        for(Card card: cards){
            card.hide();
        }
        setImage();
        calculateWeight();
    }
    
    
}
