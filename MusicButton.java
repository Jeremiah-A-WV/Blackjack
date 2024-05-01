import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MusicButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MusicButton extends Button
{   
    GreenfootImage music = new GreenfootImage("MusicScreen.png");
    Item MusicScreen = new Item(music);
    Button back = new BackButton("Back_Button.png", 400,300);
    Button musicOne = new MusicOneButton("drums.png", 220, 160);
    Button musicTwo = new MusicTwoButton("jazzGameScreen.png", 220, 160);
    
    public MusicButton(String image, int width, int height){
        super(image, width, height);
    }

    /**
     * Act - do whatever the StartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            createScreen(MusicScreen, 550, 400);
            getWorld().addObject(back, 870, 630);
            getWorld().addObject(musicOne, 290, 250);
            getWorld().addObject(musicTwo, 290, 550);
            getWorld().showText("Press once to play! \n Press again to stop!", 700, 200);
            Greenfoot.delay(80);
            getWorld().showText(" ", 700, 200);

        }

        if(!this.isTouching(Item.class)){
            getWorld().removeObject(this);
        }
    }
}
