public class Quadrangle extends Shape {
    private Point a;
    private Point b;
    private Point c;
    private Point d;


    public Quadrangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Quadrangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }

    @Override
    public double getArea () {
        return Point.distnceCallculation(a,b) +
                Point.distnceCallculation(b,c) +
                Point.distnceCallculation(c,d) +
                Point.distnceCallculation(d,a);
    }

    @Override
    public double getPerimetr() {
        double v = Point.distnceCallculation(a, b) * Point.distnceCallculation (b, c);
        return v;
    }
}
