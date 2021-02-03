public class Main {

    public static void main(String[] args) {
        Shape triangle = new Triangle(new Point(1,1), new Point(0,1), new Point(1,4));
        Triangle triangle2 = new Triangle(new Point(1,1), new Point(0,1), new Point(1,4));
        Quadrangle quadrangle = new Quadrangle(new Point(1,1), new Point(0,1), new Point(1,4), new Point(0,4));
        Circle circle = new Circle(new Point(1,1), new Point(0,1));
    }

    //Board board = new Board().putShape();

}
