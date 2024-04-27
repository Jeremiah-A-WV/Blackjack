import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackButton extends Button
{
    public BackButton(String image, int width, int height){
        super(image, width, height);
   }
   
   /**
     * Act - do whatever the StartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    { 
        if(Greenfoot.mouseClicked(this)){
            if (this.isTouching(Item.class)){
                this.removeTouching(Item.class);
            }
            getWorld().removeObject(this);
            
        }
    }
}
