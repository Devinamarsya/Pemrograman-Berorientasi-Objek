import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyLaser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyLaser extends Actor
{
    /**
     * Act - do whatever the EnemyLaser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move (-5);
        
        if (isTouching(Hero.class)){
            touchHero();
        }
        else if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
    
    public void touchHero(){
        getWorld().addObject(new Boom(), getX(), getY());
        removeTouching(Hero.class);
        getWorld().removeObject(this);
    }
}
