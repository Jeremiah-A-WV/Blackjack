import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a description of class Deck here.
 * 
 * @author Jeremiah Whitehurst 
 * @version 29-04-2024
 */
public class Deck extends Actor
{
    private final List<Rank> CARD_RANKS = Arrays.asList(Rank.values());
    private final List<Suit> CARD_SUITS = Arrays.asList(Suit.values());
    
    private List<Card> cards;
    
    public Deck() {
        cards = new ArrayList<Card>();
        
        shuffle();
    }
    
    public Deck(int numOfDecks) {
        int numOfCards = numOfDecks * 52;
        
        cards = new ArrayList<Card>();
        
        for (int deckCount=0; deckCount < numOfDecks; deckCount++) {
            for(Suit suit: Suit.values()){
                for(Rank rank: Rank.values()){
                    cards.add(new Card(suit,rank));
                }
            }
        }
        
        shuffle();
        
        if (numOfCards > 0){
            setImage(cards.get(numOfCards-1).getImage());
        }
    }
    
    public int getSize(){
        return cards.size();
    }
    
    private void reset() {
        int rankCount = 0;
        int suitCount = 0;
        
        for (int i = 0; i < 52; i++) {
            if (rankCount == 13) {
                rankCount = 0;
                suitCount++;
            }
            
            cards.add(new Card(CARD_SUITS.get(suitCount), CARD_RANKS.get(rankCount)));
            rankCount++;
        }
    }
    
    public void shuffle() {
        Collections.shuffle(cards);
    }
    
    public boolean isEmpty() {
        return cards.isEmpty();
    }
    
    public boolean remove(Card aCard) {
        return cards.remove(aCard);
    }
    
    public void add(Card aCard){
        cards.add(aCard);
    }
    
    protected List<Card> getCards() {
        return cards;
    }
    
    public Card getCard() {
        int i = Greenfoot.getRandomNumber(cards.size());
        
        Card card = cards.get(i);
        
        cards.remove(i);
        
        return card;
    }
    
    public Card deal(boolean isFaceUp){
        Card topCard = deal();
        if (isFaceUp){
            topCard.show();
        }
        return topCard;
    }
    
    public Card deal(){
        return cards.remove(cards.size()-1);
    }
    
    @Override
    public String toString() {
        String str = "";
        for(Card c: cards){
            if (str.length() > 0){
                str +=", ";
            }
            str += c;
        }
        return str;
    }
}
