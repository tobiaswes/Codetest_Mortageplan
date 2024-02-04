import codetest.Pow;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PowTest {

    @Test
    public void testPowPositiveExponent(){

        Pow pow = new Pow();

        double result = pow.powerFunction(2,4);

        assertEquals(16, result, 0.001);
        assertNotEquals(8, result);

    }
    @Test
    public void testPowZeroBase(){

        Pow pow = new Pow();

        double result = pow.powerFunction(0,5);

        assertEquals(0, result, 0.001);
        assertNotEquals(5, result);
        assertNotEquals(1, result);
    }
    @Test
    public void testPowZeroExponent(){

        Pow pow = new Pow();

        double result = pow.powerFunction(7,0);

        assertEquals(1, result, 0.001);
        assertNotEquals(0, result);
        assertNotEquals(7, result);
    }
}
