import codetest.Round;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RoundTest {
    @Test
    public void testRoundUp(){

        double roundResult = Round.roundFunction(100.355);

        assertEquals(100.36,roundResult, 0.001);
    }
    @Test
    public void testRoundDown() {

        double roundResultDown = Round.roundFunction(100.351);

        assertEquals(100.35, roundResultDown, 0.001);
    }
}
