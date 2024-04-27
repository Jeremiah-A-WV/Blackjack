import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlackJackGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackjackGame extends CardGame
{
    private BlackjackHand[] hands;
    private BlackjackHand dealer;
    int numberOfHands;

    public BlackjackGame(int numberOfDecks, int maxNumberOfHands)
    {
        super(numberOfDecks);
        hands = new BlackjackHand[maxNumberOfHands];
        dealer = new BlackjackHand("Dealer");
        numberOfHands = 0;

    }

    public void join(String name)
    {
        if (numberOfHands < hands.length){
            hands[numberOfHands] = new BlackjackHand(name);
            numberOfHands++;
        }
    }

    public void leave(String name)
    {
        boolean isFound = true;
        for(int index=0; index < numberOfHands; index++){
            if (!isFound){
                if (hands[index].getName().equals(name)){
                    isFound = true;
                } 
            } else {
                hands[index-1] = hands[index];
            }
        }
        if (isFound) {
            numberOfHands--;
            hands[numberOfHands] = null;
        }
    }

    public void deal()
    {
        int cardsToDeal = 2; 

        int[] xPositions = {65, 178, 325, 467, 617, 725};
        int[] yPositions = {290, 399, 447, 447, 380, 273};
        int[] rotations = {45, 35, 10, -10, -35, -45};

        
        for (int i = 0; i < numberOfHands; i++) { // dealing cards to players 
            for (int j = 0; j < cardsToDeal; j++) {
                Card card = getGameDeck().deal(true); 
                card.setRotation(rotations[i]); 
                card.setLocation(xPositions[i], yPositions[i]); 
                hands[i].add(card);
            }
        }

        
        for (int i = 0; i < cardsToDeal; i++) { //// dealing cards to dealer
            Card card = getGameDeck().deal(i == 0); // the first card face down, the second face up
            card.setRotation(rotations[numberOfHands]); 
            card.setLocation(xPositions[numberOfHands], yPositions[numberOfHands]);
            dealer.add(card);
        }

    }

    /**
     * Act - do whatever the BlackJackGame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
