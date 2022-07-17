import com.shapenaveen.gl.Shape;

public class Rectangle extends Shape {
    int length, width;
    public Rectangle(String color,int length,int width){
        super(color);
        this.length=length;
        this.width=width;
    }
    public double calculateArea(){
        return this.length*this.width;
    }
    public double calculatePerimeter(){
        return 2*(this.length+this.width);
    }
    public void display(){
        System.out.println("this is a" +super.color + " " + "rectangle");
    }
}
