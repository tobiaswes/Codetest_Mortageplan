import codetest.MortgageCalculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MortgageCalculatorTest {

    @Test
    public void testMortgageCalculator(){

        MortgageCalculator mortgageCalculator = new MortgageCalculator();

        String monthlyPayments = mortgageCalculator.calcMonthlyPayment(1000, 5, 2);

        assertEquals("43,87", monthlyPayments);

    }
}
