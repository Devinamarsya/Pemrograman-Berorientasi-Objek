import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boom extends Actor
{
    int boomTimer = 0;
    public void act()
    {
        turn(2);
        if (boomTimer==60){
            getWorld().removeObject(this);
        }
        boomTimer++;
    }
}
