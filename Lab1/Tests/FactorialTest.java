import FactorialCheck.Factorial;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FactorialTest {

    @Test
    public void check_0() {
        Assert.assertEquals(1, Factorial.factorial(0));
    }

    @Test
    public void check_1() {
        Assert.assertEquals(1, Factorial.factorial(1));
    }

    @Test
    public void check_5() {
        Assert.assertEquals(120, Factorial.factorial(5));
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void check_negative() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("-4 < 0");
        Factorial.factorial(-4);
    }
}
