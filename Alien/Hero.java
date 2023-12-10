import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //move (5);
        if (isAtEdge()){
            setLocation(0, getY());
    
        }
        
        heroMovement();
        shootLaser();
    }
    
    public void heroMovement(){
        if (Greenfoot.isKeyDown("D")){
            setLocation(getX()+3, getY());
        } else if (Greenfoot.isKeyDown("A")){
            setLocation(getX()-3, getY());
        }
        if (Greenfoot.isKeyDown("W")){
            setLocation(getX(), getY()-3);
        } else if (Greenfoot.isKeyDown("S")){
            setLocation(getX(), getY()+3);
        }
    }
    
    
    int laserTimer = 0;
    public void shootLaser(){
        if (laserTimer==30){
            HeroLaser laser = new HeroLaser();
            getWorld().addObject(
                laser,
                getX()+10,
                getY()
            );
            laserTimer = 0;
        }
        
        laserTimer++;
    }
}
