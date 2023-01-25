import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snat extends Zorg
{
    int timesHit = 2;
    /**
     * Act - do whatever the Snat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Snat()
    {
        setRotation(90);
    }
    public void act()
    {
        moveZorg();
        removeZorg();
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
            timesHit--;
        }
        if (timesHit == 0)
        {
            getWorld().removeObject(this);
        }
        else if(getY()==599)
        {
            getWorld(). removeObject(this);
        }
    }
  
}
