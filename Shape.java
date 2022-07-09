public class Shape{
	String color;
	public Shape(String color){
	this.color=color;	
	}
	
	public double calculateArea(){
	return 0;
	}
	public double calculatePerimeter(){
	return 0;
	}
	public void display(){
	System.out.println("This is a shape with color:" +this.color);
	}
}
	class Triangle extends Shape{
	 int height;
	 int base;
	 public triangle(String color, int height, int base){
	 	super(color);
	 	this.height=height;
	 	this.base=base;
	 }
	 public double calculateArea(){
	 return (this.height*this.base)/2;	
	 }
	 
	 public double calculatePerimeter(){
	 return this.height+this.height+this.base;
	 }
	 
	 public void display(){
	 System.out.println("This is a " + super.color + " " + "Triangle");	
	 }
	 }
	 class Rectangle extends Shape{ 
	 int length;
	 int width;
	 public rectangle(String color, int length, int width){
	 	super(color);
	 	this.length=length;
	 	this.width=width;
	 }
	 public double calculateArea(){
	 return this.length*this.width;	
	 }
	 
	 public double calculatePerimeter(){
	 return 2*(this.width+this.length);
	 }
	 
	 public void display(){
	 System.out.println("This is a " + super.color + " " + "Rectangle");	
	 }
	 class Circle extends Shape{
	 int radius;
	 final double pie=3.14;
	 public circle(String color, int radius){
	 super(color);
	 this.radius=radius;	
	 }
	 
	 public double calculateArea(){
	 return pie*this.radius*this.radius;	
	 }
	 
	 public double calculatePerimeter(){
	 return 2*pie*this.radius;
	 }
	 
	 public void Display(){
	 System.out.println("This is a " + super.color + " " + "circle");
	 }
	 class Square extends Rectangle{
	 public square(String color, int side){
	 	super(color,side,side);
	 }
	 System.out.println("This is a " + super.color + " " + "square");
	 }
	 public class Main{
	 public static void main(String[] args){
	 	Rectangle rectangle=new Rectangle(color:"yellow", length:2, width:5);
	 	System.out.println(rectangle.calculateArea());
	 	Rectangle.display();
	  

	 }
	}
}