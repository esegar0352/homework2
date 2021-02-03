public class Main {

    public static void main(String[] args) {
        Triangle triangle2 = new Triangle(new Point(1, 1), new Point(0, 1), new Point(1, 4));
        Quadrangle quadrangle = new Quadrangle(new Point(0, 0), new Point(0, 1), new Point(1, 1), new Point(1, 0));
        Circle circle = new Circle(new Point(0, 0), new Point(0, 1));
        Triangle triangle1 = new Triangle(new Point(0, 0), new Point(0, 1), new Point(1, 0));
        Board board = new Board();
        board.putShape(triangle2);
        board.putShape(quadrangle);
        board.putShape(circle);
        board.putShape(triangle1);
        board.getArea();
        board.deleteShape(triangle2);
        board.getArea();
        board.deleteShape(quadrangle);
        board.deleteShape(circle);
        board.deleteShape(triangle1);
        board.getArea();

    }


}
