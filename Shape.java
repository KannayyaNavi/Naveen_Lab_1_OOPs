package com.shapenaveen.gl;

public class Shape {
    public String color;
    public Shape(String Color){
        this.color=color;
    }
    public double calculateArea(){
        return 0;
    }
    public double calculatePerimeter(){
        return 0;
    }
    public void display(){
        System.out.println("this is a shape with color"+ this.color);
    }

}
