import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MenuStart extends World {
    private GreenfootSound bgm = new GreenfootSound("C:/Users/ASUS/Desktop/tes/bgm.mp3");
    private boolean isMusicPlaying = false;
    
    public MenuStart() {
        super(1080, 500, 1);
        bgm.setVolume(100);
        prepare();
    }

    private void prepare() {
        addObject(new StartButton(), getWidth() / 2-5, getHeight() / 2+145);
    }
     
    private void startGame() {
    if (isMusicPlaying) {
        bgm.stop();
    }
    Greenfoot.setWorld(new MyWorld());
}

    public void started(){
        bgm.playLoop();
    }
    
    public GreenfootSound getBgm() {
    return bgm;
}

}


