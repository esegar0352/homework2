public class Triangle extends Shape {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    @Override
    public double getPerimetr() {
        return Point.distnceCallculation(a, b) + Point.distnceCallculation(b, c) + Point.distnceCallculation(c, a);
    }

    @Override
    public double getArea() {
        double pp = this.getPerimetr()/2.00;
        return Math.sqrt(pp*(pp - Point.distnceCallculation(a,b))
                *(pp - Point.distnceCallculation(b,c))
                *(pp - Point.distnceCallculation(c,a)));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
