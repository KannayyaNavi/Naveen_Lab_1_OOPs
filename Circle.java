
import com.shapenaveen.gl.Shape;

public class Circle extends Shape {
    int radius;
    final double pi=3.14;
    public Circle(String color, int radius){
        super(color);
        this.radius=radius;
    }
    public double calculateArea(){
        return pi*this.radius*this.radius;
    }
    public double calculatePerimeter(){
        return 2*pi*this.radius;
    }
    public void display(){
        System.out.println("this is a" +super.color + " " + "circle");
    }
}
