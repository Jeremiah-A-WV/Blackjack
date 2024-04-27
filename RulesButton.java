import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rules_Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RulesButton extends Button
{
    GreenfootImage rules = new GreenfootImage("RulesScreen.png");
    Item rulesScreen = new Item(rules);
    Button back = new BackButton("Back_Button.png", 400,300);
    public RulesButton(String image, int width, int height, World link){
        super(image, width, height, link);
    }
    
    /**
     * Act - do whatever the StartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            createScreen(rulesScreen, 550, 400);
            getWorld().addObject(back, 870, 630);
        }
        
        if(!this.isTouching(Item.class)){
                getWorld().removeObject(this);
        }
    }
}
