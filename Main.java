public class Main {
    public static void main(String[] args) {
        Rectangle R=new Rectangle("green",3,4);
        System.out.println(R.calculateArea());
        System.out.println(R.calculatePerimeter());
        R.renderer.draw();
        R.renderer.draw("This is a rectangle");

        Square S=new Square("orange", 5);
        System.out.println(S.calculateArea());
    }
}