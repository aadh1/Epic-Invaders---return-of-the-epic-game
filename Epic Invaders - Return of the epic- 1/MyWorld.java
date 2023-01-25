import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Aadhi) 
 * @version (20/01/23)
 */
public class MyWorld extends World
{

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
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Player player = new Player();
        addObject(player,283,509);
        player.setLocation(316,509);
        player.setLocation(294,505);
        Zorg zorg = new Zorg();
        addObject(zorg,206,80);
        zorg.setLocation(279,160);
        removeObject(zorg);
        addObject(zorg,238,71);
    }
}
