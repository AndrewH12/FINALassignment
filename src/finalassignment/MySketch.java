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
  public String health;
  String userInput = "";
  int stage = 0;
 
  
  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(255);
    textSize(20);
    person = new Person(this, 200, 200, "Andrew","100",20 ,"images/person.png");
    person1 = new Person(this, 150, 150, "Andrew","100",20 ,"images/person.png");
  }
  
  public void draw() {
    background(255);
    if (stage ==0){
        fill(0);
        text("Game START:", 140,150);
        text("PRESS ENTER TO START...", 100,200);
        text(userInput, 200,300);
    }else if(stage ==1){
        person1.displayInfo(this);
        person.draw();
        person1.draw();    
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

        if (person.isCollidingWith(person1)){
            fill(255,0,0);
            this.text("oouch",person1.x, person1.y);
            String health ="0";
        }
    }
    
    }
    public void keyPressed(){
        if (stage==0){
            if (keyCode ==ENTER){
                stage = 1;
            }else if(key != CODED){
                userInput +=key;
            }
            
        }
    } 
  }


