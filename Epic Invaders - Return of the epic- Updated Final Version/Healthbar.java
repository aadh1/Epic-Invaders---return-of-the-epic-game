import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Healthbar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Healthbar extends Actor
{
    /**
     * Act - do whatever the Healthbar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int health = 20;
    int healthbarWidth = 80;
    int healthbarHeight = 10;
    int pixelsPerHealthPoint = (int)healthbarWidth/health;
    public Healthbar()
    {
        update();
    }
    public void act()
    {
        update();
        youLose();
    }
    public void  update()
    {
        setImage (new GreenfootImage(healthbarWidth + 2, healthbarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0, 0, healthbarWidth + 1, healthbarHeight + 1);
        myImage.setColor(Color.RED);
        myImage.fillRect(1, 1, health*pixelsPerHealthPoint, healthbarHeight);
    }
    public void loseHealth()
    {
        health--;
    
    }
    public void youLose()
    {
        if (health ==0)
        {
            getWorld().addObject (new youlose(), 300,300);
            Greenfoot.stop();
        }
    }
}
