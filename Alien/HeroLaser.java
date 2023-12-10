import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HeroLaser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HeroLaser extends Actor
{
    /**
     * Act - do whatever the HeroLaser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    
        move(10);
        if (isTouching(Enemy.class)){
            touchEnemy();
        }
        else if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
    
    public void touchEnemy(){
        getWorld().addObject(new Boom(), getX(), getY());
        removeTouching(Enemy.class);
        getWorld().removeObject(this);
    }
    
}
