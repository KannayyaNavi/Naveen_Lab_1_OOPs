
public class Circle implements IShape {
    int radius;
    String color;
    final double pi=3.14;
    public Circle(String color, int radius){
        this.color=color;
        this.radius=radius;
    }
    public double calculateArea(){
        return pi*this.radius*this.radius;
    }
    public double calculatePerimeter(){
        return 2*pi*this.radius;
    }

}
