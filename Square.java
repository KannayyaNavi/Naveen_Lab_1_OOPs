public class Square extends Rectangle{
    public Square(String color,int side){
        super(color,side,side);
    }
    public double calculateArea() {
        System.out.println("Calculate area in square is called");
        return this.length * this.width;
    }

}
