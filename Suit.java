/**
 * Write a description of class Suit here.
 * 
 * @author Jeremiah Whitehurst 
 * @version 29-04-2024
 */
public enum Suit  
{
    CLUB(0,"clubs"), SPADE(1, "spades"),
    HEART(2, "hearts"), DIAMOND(3, "diamonds");

    private int value;
    private String rep;

    Suit(int value, String representation){
        this.value = value;
        rep = representation;
    }
    
    public int getValue(){
        return value;
    }
    
    public String toString(){
        return rep;
    }

}
