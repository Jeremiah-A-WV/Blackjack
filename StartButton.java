import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Button
{
    GreenfootSound defaultMusic = new GreenfootSound("Gimme_Gimme.mp3");
    GreenfootImage defaultGameScreen = new GreenfootImage("jazzGameScreen.png");
    public StartButton(String image, int width, int height, World link){
        super(image, width, height, link);
    }
    
    /**
     * Act - do whatever the StartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            defaultMusic.playLoop();
            Greenfoot.setWorld(new Game());
        }
    }
}
