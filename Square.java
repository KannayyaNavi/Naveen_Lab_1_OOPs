public class Square extends Rectangle{
    public Square(String color,int side){
        super(color,side,side);
    }
    public void display(){
        System.out.println("this is a" +super.color + " " + "square");
    }
}
