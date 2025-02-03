import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    @Test
    public void testGratuityandTotal() {
        App test = new App();
        double gratuity = test.calculateGratuity(50.0, 10.0);
        double total = test.calculateTotal(50.0, gratuity);
        assertEquals(5.0, gratuity, 0);
        assertEquals(55.0, total, 0);

        gratuity = test.calculateGratuity(100.0, 20.0);
        total = test.calculateTotal(100.0, gratuity);
        assertEquals(20.0, gratuity, 0);
        assertEquals(120.0, total, 0);

        gratuity = test.calculateGratuity(25.0, 15.0);
        total = test.calculateTotal(25.0, gratuity);
        assertEquals(3.75, gratuity, 0);
        assertEquals(28.75, total, 0);

        gratuity = test.calculateGratuity(80.0, 12.5);
        total = test.calculateTotal(80.0, gratuity);
        assertEquals(10.0, gratuity, 0);
        assertEquals(90.0, total, 0);
    }


}
