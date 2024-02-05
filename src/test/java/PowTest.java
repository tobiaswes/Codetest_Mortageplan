import codetest.Pow;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PowTest {

    @Test
    public void testPowPositiveExponent(){

        double result = Pow.powerFunction(2,4);

        assertEquals(16, result, 0.001);
        assertNotEquals(8, result);

    }
    @Test
    public void testPowZeroBase(){

        double result = Pow.powerFunction(0,5);

        assertEquals(0, result, 0.001);
        assertNotEquals(5, result);
        assertNotEquals(1, result);
    }
    @Test
    public void testPowZeroExponent(){

        double result = Pow.powerFunction(7,0);

        assertEquals(1, result, 0.001);
        assertNotEquals(0, result);
        assertNotEquals(7, result);
    }
}
