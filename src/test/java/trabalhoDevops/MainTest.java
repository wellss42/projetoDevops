package trabalhoDevops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testAdd() {
        Main calculator = new Main();
        int result = calculator.add(3, 5);
        assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
    	Main calculator = new Main();
        int result = calculator.subtract(10, 4);
        assertEquals(6, result);
    }
}
