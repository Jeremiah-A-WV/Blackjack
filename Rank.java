/**
 * Write a description of class Rank here.
 * 
 * @author Jeremiah Whitehurst 
 * @version 29-04-2024
 */
public enum Rank  
{
    ACE(1,"ace"), TWO(2,"2"), THREE(3,"3"),
    FOUR(4,"4"), FIVE(5,"5"), SIX(6,"6"), SEVEN(7,"7"),
    EIGHT(8,"8"), NINE(9,"9"),TEN(10,"10"), 
    JACK(10,"jack"), QUEEN(10,"queen"), KING(10,"king");

    private int rank;
    private String rep;

    private Rank(int rank, String representation){
        this.rank = rank;
        rep = representation;
    }
    public int getRank(){
        return rank;
    }
    public String toString() {
        return rep;
    }
}
