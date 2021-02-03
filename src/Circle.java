public class Circle extends Shape {
    private Point o;
    private Point a;

    public Circle() {
    }

    public Circle(Point o, Point a) {
        this.o = o;
        this.a = a;
    }

    public Point getO() {
        return o;
    }

    public void setO(Point o) {
        this.o = o;
    }

    public Point getR() {
        return a;
    }

    public void setR(Point a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Circle{" + "o=" + o + ", a=" + a + '}';
    }

    @Override
    public double getPerimetr() {
        return 2 * Math.PI * Point.distnceCallculation(o,a);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow( Point.distnceCallculation(o,a), 2);
    }
}