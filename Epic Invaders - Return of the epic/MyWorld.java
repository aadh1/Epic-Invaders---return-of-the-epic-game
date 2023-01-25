import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Aadhi) 
 * @version (20/01/23)
 */
public class MyWorld extends World
{
    int zorgCount=0;
    Counter counter = new Counter();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    public Counter getCounter()
    {
        return counter;
    }
    public void act()
    {
        addKash();
        addSnat();
    }
    public void addKash()
    {
        if (Greenfoot.getRandomNumber(120)<1)
        {
            addObject(new Kash(), Greenfoot.getRandomNumber(600), 0);
        }
    }
     public void addSnat()
    {
        if (Greenfoot.getRandomNumber(200)<1)
        {
            addObject(new Snat(), Greenfoot.getRandomNumber(600), 0);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(counter, 100, 50);
        Player player = new Player();
        addObject(player,252,510);
        player.setLocation(270,491);
    }
    
}
