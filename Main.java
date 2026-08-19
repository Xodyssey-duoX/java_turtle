import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {  
    World world = new World(1000,1000);
   
    // World world2 = new World();
   
    // World world3 = new World();
     
    Turtle aertle = new Turtle(world);

    Turtle certle = new Turtle( 200, 200, world);

    Turtle gertle = new Turtle( 600, 600, world);

    Turtle jertle = new Turtle( 100, 700, world);

    // // Add your code here
    aertle.setShellColor(Color.black);
    certle.setShellColor(Color.black);
    gertle.setShellColor(Color.black);
    jertle.setShellColor(Color.black);
    //yertle.setPenWidth(40);

    // yertle.forward();
    // yertle.turnRight();
    // yertle.forward();
    // yertle.turnRight();
    // yertle.forward();
    // yertle.turnRight();
    // yertle.forward();
    // yertle.turnRight();

    aertle.setPenWidth(5);
    aertle.star(5,60);
    certle.smiley(10,40);
    gertle.asterisk(100);
    jertle.beacon(3,200);
  

    aertle.setName("aertle");
    certle.setName("certle");
    gertle.setName("gertle");
    jertle.setName("jertle");

    aertle.data("star");
    certle.data("smiley");
    gertle.data("asterisk");
    jertle.data("beacon");
    // certle.name = "certle";
    // gertle.name = "gertle";
    // jertle.name = "jertle";


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
