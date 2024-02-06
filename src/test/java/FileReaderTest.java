import codetest.Customer;
import codetest.FileReader;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class FileReaderTest {

    @Test
    public void testFileReader(){
        FileReader fileReader = new FileReader();

        List<Customer> customers = fileReader.read("prospects.txt");

        assertNotNull(customers);
        assertEquals(4, customers.size());

        assertEquals("Juha", customers.get(0).getName());
        assertEquals(1000, customers.get(0).getTotalLoan(), 0.001);
        assertEquals(5, customers.get(0).getInterest(), 0.001);
        assertEquals(2, customers.get(0).getYears(), 0.001);
        assertEquals("Clarencé Andersson", customers.get(3).getName());

        assertNotEquals("Claes Månsson", customers.get(0).getName());
        assertNotEquals(1300.55, customers.get(0).getTotalLoan(), 0.001);
        assertNotEquals(8.67, customers.get(0).getInterest(), 0.001);
        assertEquals(2, customers.get(2).getYears(), 0.001);
    }
    @Test
    public void testFileNotFound() {
        // Arrange
        FileReader fileReader = new FileReader();

        // Act
        List<Customer> customers = fileReader.read("test.txt");

        // Assert
        assertNotNull(customers);
        assertEquals(0, customers.size());
    }
}
