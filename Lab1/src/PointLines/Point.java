package PointLines;

public class Point {

    private double _x;
    private double _y;

    public Point(double x, double y){
        _x = x;
        _y = y;
    }

    public double get_x(){
        return _x;
    }

    public double get_y(){
        return _y;
    }

    public void move(Vector v){
        _x += v.get_x();
        _y += v.get_y();
    }

    public void flip(){
        _x *= -1;
        _y *= -1;
    }

    @Override
    public String toString() {
        return "(" + _x + "," + _y + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point that = (Point) o;
        return _x == that._x && _y == that._y;
    }
}
