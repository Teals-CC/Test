package myKarelCCPackage;

/**
   @Author:
      Date:
   Teacher:
       Lab:
      Misc:
  */
import kareltherobot.*;
import java.awt.Color;

public class Test implements Directions
{
    public static void main(String args[])  {
        UrRobot karel = new UrRobot(1, 1, East, 0);  
        karel.turnLeft();
        karel.move();
        
        karel.turnOff();  
        Math.sqrt(8);
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/fig3-1.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(50);  
        World.setVisible(true);
    }
    
   
    
}