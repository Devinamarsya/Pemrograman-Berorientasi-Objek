import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    protected int speed = 4;
    
    public Enemy()
    {
        turn(180);
    }
    
    public Enemy(int enemySpeed){
        turn(180);
        speed = enemySpeed;
        
    }
    
    public void act()
    {
        move(speed);
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
