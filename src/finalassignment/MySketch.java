/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalassignment;
import processing.core.PApplet;
/**
 *
 * @author 342393436
 */
public class MySketch extends PApplet{
  private Person person;
  private Person person1;
 
  
  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(255);
    person = new Person(this, 200, 200, "Amdrew",20 ,"images/person.png");
    person1 = new Person(this, 150, 150, "Amdrew",20 ,"images/person.png");
  }
  
  public void draw() {
    background(255);
    person.draw();
         
    if (keyPressed) {
        if (keyCode == LEFT) {
            person1.move(-2, 0);
        } else if (keyCode == RIGHT) {
            person1.move(2, 0);
        } else if (keyCode == UP) {
            person1.move(0, -2);
        } else if (keyCode == DOWN) {
            person1.move(0, 2);
         }
    }
    person1.draw();
    
    if (person.isCollidingWith(person1)){
        fill(255,0,0);
        this.text("oouch",person1.x, person1.y);
    }
    
    }
  }


