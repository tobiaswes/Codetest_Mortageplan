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

        assertEquals("Juha", customers.get(0).name());
        assertEquals(1000, customers.get(0).totalLoan(), 0.001);
        assertEquals(5, customers.get(0).interest(), 0.001);
        assertEquals(2, customers.get(0).years(), 0.001);

        assertNotEquals("Claes Månsson", customers.get(0).name());
        assertNotEquals(1300.55, customers.get(0).totalLoan(), 0.001);
        assertNotEquals(8.67, customers.get(0).interest(), 0.001);
        assertEquals(2, customers.get(2).years(), 0.001);
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
