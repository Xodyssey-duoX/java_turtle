import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;


public class Main {
  public static void main(String[] args) {  
    World world = new World(300,300);

    // World world2 = new World();
   
    // World world3 = new World();
     
    Turtle yertle = new Turtle(world);

    Turtle aertle = new Turtle( 200, 200, world);

    Turtle bertle = new Turtle( 100, 100, world);
    // // Add your code here
    yertle.setShellColor(Color.black);
    bertle.setShellColor(Color.black);
    aertle.setShellColor(Color.black);
    //yertle.setPenWidth(40);

    // yertle.forward();
    // yertle.turnRight();
    // yertle.forward();
    // yertle.turnRight();
    // yertle.forward();
    // yertle.turnRight();
    // yertle.forward();
    // yertle.turnRight();

    bertle.turnToFace(yertle);
    yertle.star(5,30);
    aertle.polygon(5,30);
    bertle.smiley(10,40);

  
    // //world.setVisible(true);

    // World world2 = new World(true);
   
     
    // Turtle yertle2 = new Turtle(world2);
    // // Add your code here
    // yertle2.forward();
    // yertle2.turnRight();
    // yertle2.forward();

  
    //world.setVisible(true);
  }
}
