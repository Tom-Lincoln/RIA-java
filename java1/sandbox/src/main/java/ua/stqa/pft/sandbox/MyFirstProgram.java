package ua.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("world");

        Square s = new Square(5);
        System.out.println("Площа квадрату зі стороною " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(5, 4);
        System.out.println("Площа прямокутника зі сторонами " + r.a + " і " + r.b + " = " + r.area());

        Point ab = new Point(-1,3,6,2);
        System.out.println("Вістань між точками X(" + ab.xa + ", " + ab.ya + ") та Y(" + ab.xb + ", " + ab.yb + ") = " + ab.point());
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

}