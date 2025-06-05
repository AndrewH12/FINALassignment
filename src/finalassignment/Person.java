/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalassignment;

import processing.core.PApplet;
import processing.core.PImage;

/**
 *
 * @author 342393436
 */
public class Person {
    public int x, y;
    private String name;
    private int age;
    public String health;
    private PApplet app;
    private PImage image; 
    public Person(PApplet p, int x, int y, String name,String health, int age,String imagePath ){
        this.app = p;
        this.x =x;
        this.y=y;
        this.name = name;
        this.health = health;
        this.age = age;
        this.image = app.loadImage(imagePath);
    }
    public void move(int dx, int dy){
     x += dx;
     y += dy;
     
    }
    public void draw(){
        app.image(image, x,y);
        
    }
    public boolean isCollidingWith(Person other){
        int centerX = x+(image.pixelWidth/2);
        int centerY = y+(image.pixelHeight/2);
        int otherCenterX = other.x+(other.image.pixelHeight/2);
        int otherCenterY = other.y+(other.image.pixelHeight/2);
        float d = PApplet.dist(otherCenterX, otherCenterY, centerX, centerY);
        
        return d <32;
    }
    public void displayInfo(PApplet p){
        app.fill(0);
        app.text("Name:"+ name, x,y-50);
        app.text("Health:"+ health, x,y-30);
    }    
}
