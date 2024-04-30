import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TextBox here.
 * 
 * @author Jeremiah Whitehurst 
 * @version 29-04-2024
 */
public class TextBox extends Actor
{
    private String text;
    
    /**
     * TextBox constructor.
     * 
     * Sets text inside the box.
     */
    public TextBox(String text)
    {
        this.text = text;
        setTextImage(); 
    }
    
    /**
     * updateText - method that changes the text.
     */
    public void updateText(String text)
    {
        this.text = text;
        setTextImage();
    }
    
    /**
     * setTextImage - method that sets the text inside the box as well as the style of the box.
     */
    private void setTextImage()
    {
        setImage(  new GreenfootImage( this.text, 24, new Color(254, 209, 5), new Color(59, 125, 35), new Color(254, 209, 5) ));
    }
}
