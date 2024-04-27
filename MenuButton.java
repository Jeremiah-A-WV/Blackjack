import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuButton extends Button
{
    GreenfootImage menu = new GreenfootImage("MenuScreen.png");
    Item menuScreen = new Item(menu);
    Button rules = new RulesButton("Rules_Button.png", 240, 180, new RulesWorld());
    Button back = new BackButton("Back_Button.png", 400,300);
    Button music = new MusicButton("MusicButton.png", 280, 210);
    public MenuButton(String image, int width, int height){
        super(image, width, height);
    }
    
    /**
     * Act - do whatever the StartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            createScreen(menuScreen, 550, 400);
            getWorld().addObject(rules, 260, 250);
            getWorld().addObject(back, 870, 630);
            getWorld().addObject(music, 260, 550);
        }
    }
}
