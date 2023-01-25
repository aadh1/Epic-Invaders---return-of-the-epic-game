import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Aadhi) 
 * @version (20/01/23)
 */
public class MyWorld extends World
{
    int zorgCount = 0;
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
    public void act()
    {
        addKash();
    }
    public void addKash()
    {
        if (Greenfoot.getRandomNumber(60)<1)
        {
            addObject(new Kash(), Greenfoot.getRandomNumber(600), 0);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,252,510);
        player.setLocation(270,491);
    }
    
}
