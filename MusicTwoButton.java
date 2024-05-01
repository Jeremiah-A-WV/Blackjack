import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MusicTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MusicTwoButton extends Button
{   GreenfootSound musicTwo = new GreenfootSound("Gimme_Gimme.mp3");
    GreenfootImage drumsGameScreen = new GreenfootImage("jazzGameScreen.png");
    
    public MusicTwoButton(String image, int width, int height){
        super(image, width, height);
    }
    
    /**
     * Act - do whatever the MusicOne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            if(!musicTwo.isPlaying()){
            getWorld().setBackground(drumsGameScreen);
            musicTwo.playLoop();
        } else {
            musicTwo.stop();
        }
    }
        
    if(!this.isTouching(Item.class)){
        getWorld().removeObject(this);
    }
    }
}
