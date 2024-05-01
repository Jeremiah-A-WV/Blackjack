import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MusicOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MusicOneButton extends Button
{
    GreenfootSound musicOne = new GreenfootSound("Good_Night.mp3");

    GreenfootImage drumsGameScreen = new GreenfootImage("drums.png");

    public MusicOneButton(String image, int width, int height){
        super(image, width, height);
    }

    /**
     * Act - do whatever the MusicOne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            if(!musicOne.isPlaying()){
            getWorld().setBackground(drumsGameScreen);
            musicOne.playLoop();
        } else {
            musicOne.stop();
        }
    }

        if(!this.isTouching(Item.class)){
            getWorld().removeObject(this);
        }
    }
}
