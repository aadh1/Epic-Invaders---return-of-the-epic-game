import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class boom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boom extends Player
{
    /**
     * Act - do whatever the boom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        boomMove();
        removeFromWorld();
    }
    public void boomMove()
    {
        setLocation(getX() , getY() - 5);
    }
    public void removeFromWorld()
    {
       if (getY()==0)
       {
            getWorld(). removeObject(this);
       }
    }
}
