package ua.stqa.pft.sandbox;

public class Point {

    double xa;
    double ya;
    double xb;
    double yb;

    public Point(double xa, double ya, double xb, double yb) {
        this.xa = xa;
        this.ya = ya;
        this.xb = xb;
        this.yb = yb;
    }

    public double point() {
        return Math.sqrt((Math.pow((xb - xa), 2)) + (Math.pow((yb - ya), 2)));
    }
}
