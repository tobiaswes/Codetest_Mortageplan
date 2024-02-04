import codetest.Customer;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CustomerTest {

    @Test
    public void testCustomerRecord(){

        Customer customer = new Customer("Juha",5000, 4.2, 5);

        String name = customer.name();
        double totalLoan = customer.totalLoan();
        double interest = customer.interest();
        int years = customer.years();

        assertEquals("Juha", name);
        assertEquals(5000.0, totalLoan, 0.001);
        assertEquals(4.2, interest, 0.001);
        assertEquals(5,years);

        assertNotEquals("Karvinen",name);
        assertNotEquals(3300, totalLoan);
        assertNotEquals(6,interest);
        assertNotEquals(5.0,years);
    }
}
