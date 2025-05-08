// NumberProcessorTest.java
import org.junit.Test;
import static org.junit.Assert.*;

public class NumberProcessorTest {

    @Test
    public void testSumEvenAndOdd() {
        int[] input = {2, 3, 4, 5, 6}; // 3 số chẵn (2,4,6) và 2 số lẻ (3,5)
        int[] result = NumberProcessor.process(input);
        assertEquals(12, result[0]); // Tổng số chẵn
        assertEquals(8, result[1]);  // Tổng số lẻ
    }

    @Test
    public void testAllEven() {
        int[] input = {2, 4, 6, 8, 10};
        int[] result = NumberProcessor.process(input);
        assertEquals(30, result[0]);
        assertEquals(0, result[1]);
    }

    @Test
    public void testAllOdd() {
        int[] input = {1, 3, 5, 7, 9};
        int[] result = NumberProcessor.process(input);
        assertEquals(0, result[0]);
        assertEquals(25, result[1]);
    }
}
