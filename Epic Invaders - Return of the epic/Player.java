import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    boolean canFire = true;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player()
    {
        setRotation(270);
    }
    public void act()
    {
        moveAround();
        fireBoom();
    }
    public void moveAround()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+5,getY());
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5,getY());
        }
    }
    public void fireBoom()
    {
        if (Greenfoot.isKeyDown("Space") && canFire == true )
        {
            getWorld().addObject(new boom(), getX(), getY()-30);
            canFire = false;
        }
        else if (!Greenfoot.isKeyDown("space"))
        {
            canFire = true;
        }
    }
}
    

