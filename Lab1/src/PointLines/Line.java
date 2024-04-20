package PointLines;

public class Line {

    private Point _p1;
    private Point _p2;

    public Line(Point p1, Point p2){

        if(p1.equals(p2)){
            throw new IllegalArgumentException("Same points");
        }

        _p1 = p1;
        _p2 = p2;
    }

    public void move(Vector v){
        _p1.move(v);
        _p2.move(v);
    }

    public void flip(){
        _p1.flip();
        _p2.flip();
    }

    @Override
    public String toString() {
        Point p1 = _p1.get_x() < _p2.get_x() ? _p1 : _p1.get_y() < _p2.get_y() ? _p1 : _p2;
        Point p2 = p1 == _p1 ? _p2 : _p1;
        return "[" + p1 + "," + p2 + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line that = (Line) o;
        return (_p1.equals(that._p1) && _p2.equals(that._p2)) || (_p1.equals(that._p2) && _p2.equals(that._p1));
    }
}
