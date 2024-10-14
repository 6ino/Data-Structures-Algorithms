import edu.alvernia.cs220.util.MathUtilities;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilitiesTest {

    @Test
    void testSummation() {
        assertEquals(50, MathUtilities.summation(new int[]{5, 10, 15, 20}));
        assertEquals(70, MathUtilities.summation(new int[]{25, 10, 15, 20}));
        assertEquals(87, MathUtilities.summation(new int[]{1, 2, 3, 5, 8, 13, 21, 34}));
    }

    @Test
    void testProduct() {
        assertEquals(15000, MathUtilities.product(new int[]{5, 10, 15, 20}));
        assertEquals(75000, MathUtilities.product(new int[]{25, 10, 15, 20}));
        assertEquals(65520, MathUtilities.product(new int[]{1, 2, 3, 5, 8, 13, 21}));
    }

    @Test
    void testIsEven() {
        assertTrue(MathUtilities.isEven(4));
        assertTrue(MathUtilities.isEven(10));
        assertFalse(MathUtilities.isEven(13));
        assertFalse(MathUtilities.isEven(5));
        assertTrue(MathUtilities.isEven(512));
        assertFalse(MathUtilities.isEven(513));
    }

    @Test
    void testIsOdd() {
        assertFalse(MathUtilities.isOdd(4));
        assertFalse(MathUtilities.isOdd(10));
        assertTrue(MathUtilities.isOdd(13));
        assertTrue(MathUtilities.isOdd(5));
        assertFalse(MathUtilities.isOdd(512));
        assertTrue(MathUtilities.isOdd(513));
    }

    @Test
    public void testAverage() {
        float[] numbers = {1, 2, 3, 4, 5};
        assertEquals(3, MathUtilities.average(numbers), 0.001);
        numbers = new float[]{20, 20, 20, 20, 20};
        assertEquals(20, MathUtilities.average(numbers), 0.001);
        numbers = new float[]{78.4f, 56.3f, 99.1f, 44.2f};
        assertEquals(69.5, MathUtilities.average(numbers), 0.001);
    }

    @Test
    public void testAbsoluteValue() {
        assertEquals(5, MathUtilities.absoluteValue(5));
        assertEquals(5, MathUtilities.absoluteValue(-5));
        assertEquals(1343, MathUtilities.absoluteValue(-1343));
        assertEquals(1343, MathUtilities.absoluteValue(1343));
    }

}
