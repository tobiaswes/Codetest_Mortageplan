import codetest.Round;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RoundTest {
    @Test
    public void testRoundUp(){

        Round round = new Round();

        double roundResult = round.roundFunction(100.355);

        assertEquals(100.36,roundResult, 0.001);
    }
    @Test
    public void testRoundDown() {
        Round round = new Round();

        double roundResultDown = round.roundFunction(100.351);

        // Assert that rounding down gives the expected result
        assertEquals(100.35, roundResultDown, 0.001);
    }
}
