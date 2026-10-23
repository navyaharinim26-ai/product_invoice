import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductInvoiceTest {

    @Test
    public void testInvoiceTotal() {
        int expectedTotal = 100;
        int actualTotal = 90;

        assertEquals(expectedTotal, actualTotal,
            "Invoice total does not match!");
    }
}
