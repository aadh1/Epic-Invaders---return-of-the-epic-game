import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kash extends Zorg
{
    /**
     * Act - do whatever the Kash wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Kash()
    {
        setRotation(90);
    }
    public void act()
    {
       moveZorg();
       hitByboom();
    }
    public void hitByboom()
    {
        Actor boom = getOneIntersectingObject(boom.class);
        if  (boom != null)
        {
            getWorld().removeObject(boom);
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            Counter counter = myWorld.getCounter();
            counter.addScore();
            getWorld().removeObject(this);
        }
        else if (getY()==599)
        {
            getWorld(). removeObject(this);
        }
    }
            
}
