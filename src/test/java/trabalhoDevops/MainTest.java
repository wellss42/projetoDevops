package trabalhoDevops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

	@Test
    public void testAddSimple() {
        Main calculator = new Main();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testAddWithNegatives() {
        Main calculator = new Main();
        int result = calculator.add(-5, 3);
        assertEquals(-2, result);
    }

    @Test
    public void testAddWithZero() {
        Main calculator = new Main();
        int result = calculator.add(0, 7);
        assertEquals(7, result);
    }

    @Test
    public void testAddWithLargeNumbers() {
        Main calculator = new Main();
        int result = calculator.add(1000000, 2000000);
        assertEquals(3000000, result);
    }

    @Test
    public void testSubtractSimple() {
        Main calculator = new Main();
        int result = calculator.subtract(10, 5);
        assertEquals(5, result);
    }

    @Test
    public void testSubtractWithNegatives() {
        Main calculator = new Main();
        int result = calculator.subtract(-8, -3);
        assertEquals(-5, result);
    }

    @Test
    public void testSubtractWithZero() {
        Main calculator = new Main();
        int result = calculator.subtract(0, 7);
        assertEquals(-7, result);
    }

    @Test
    public void testSubtractWithLargeNumbers() {
        Main calculator = new Main();
        int result = calculator.subtract(1000000, 200000);
        assertEquals(800000, result);
    }

//    @Test
//    public void testSubtractResultingInNegative() {
//        Main calculator = new Main();
//        int result = calculator.subtract(5, 10);
//        assertEquals(-5, result);
//    }
//
//    @Test
//    public void testSubtractResultingInZero() {
//        Main calculator = new Main();
//        int result = calculator.subtract(7, 7);
//        assertEquals(0, result);
//    }
}
