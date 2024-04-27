import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HitButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HitButton extends Button
{
    public HitButton(String image, int width, int height) {
        super(image, width, height);
    }
    
    /**
     * Act - do whatever the HitButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            
        }
    }
}
