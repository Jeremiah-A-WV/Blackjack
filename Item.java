import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Item extends Actor
{
    // Screens
    public Item(GreenfootImage image){
        image.scale(800, 600);
        setLocation(550,400);
        setImage(image);
    }
    
    //other items
    public Item(GreenfootImage image, int width, int height, int x, int y){
        image.scale(width, height);
        setLocation(x, y);
        setImage(image);
    }
    
    /**
     * Act - do whatever the Screen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
