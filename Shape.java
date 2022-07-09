public class Shape{
	String color;
	this.color=color;

	public double CalculateArea(){
	return 0;
	}
	public double CalculatePerimeter(){
	return 0;
	}
	public void Display(){
	System.out.println("This is a shape with color:" +this.color);
	}
	class Triangle extends Shape{
	 double height;
	 double base;
	 super(color)=this.color;
	 public double CalculateArea(1/2*(this.base*this.height));
	 public double CalculatePerimeter(this.height+this.height+this.base);
	 public void Display(){
	 System.out.println("This is a Triangle:"+ " ": +this.color);
	 }
	 class Rectangle extends Shape{
	 double width;
	 double height;
	 super(color)=this.color;
	 public double CalculateArea(this.width*this.height);
	 public double CalculatePerimeter(2(this.width+this.height));
	 public void Display(){
	 System.out.println("This is a Rectangle:"+ " ": +this.color);
	 }
	 class Circle extends Shape{
	 double radius;
	 final double pie=3.14;
	 super(color)=this.color;
	 public double CalculateArea(this.pie*(this.radius*this.radius));
	 public double CalculatePerimeter(2*this.pie*this.radius);
	 public void Display(){
	 System.out.println("This is a Circle:"+ " ": +this.color);
	 }
	 class Square extends Rectangle{
	 double Side;
	 super(color)=this.color;
	 public double CalculateArea(this.side*this.side);
	 public double CalculatePerimeter(4*this.side);
	 public void Display(){
	 System.out.println("This is a Square:"+ " ": +this.color);
	 }
	 public static void main(String[] args){
	 
	 }
	}
}