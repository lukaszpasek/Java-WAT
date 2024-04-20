package PointLines;

public class Tests {
    public static void main(String[] args){
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 1);
        Line l = new Line(p1, p2);
        System.out.println("line: " + l);

        Vector v = new Vector(2, 4);
        l.move(v);
        System.out.println("after move: " + l);

        l.flip();
        System.out.println("after flip: " + l);
    }
}
