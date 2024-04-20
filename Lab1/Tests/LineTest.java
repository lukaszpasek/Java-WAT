import FactorialCheck.Factorial;
import PointLines.Line;
import PointLines.Point;
import PointLines.Vector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LineTest {
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void cant_create_line_as_point() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Same points");
        Line l = new Line(new Point(2, 3), new Point(2, 3));
    }

    @Test
    public void check_move_line() {
        Line l = new Line(new Point(2, 3), new Point(4, 5));
        l.move(new Vector(1,1));

        Assert.assertEquals(l, new Line(new Point(3, 4), new Point(5, 6)));
        Assert.assertEquals(l, new Line(new Point(5, 6), new Point(3, 4)));
    }

    @Test
    public void check_flip_line() {
        Line l = new Line(new Point(2, 3), new Point(4, 5));
        l.flip();

        Assert.assertEquals(l, new Line(new Point(-2, -3), new Point(-4, -5)));
        Assert.assertEquals(l, new Line(new Point(-4, -5), new Point(-2, -3)));
    }
}