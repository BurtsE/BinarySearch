import org.example.IntComparator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;




public class ArraysTests {
    @Test
    void First() {
        byte[] arr = new byte[] {1, 4, 6, 7, 8, 9, 10, 11, 12, 13};
        byte res = (byte) Arrays.binarySearch(arr, (byte)6);
        assertEquals(2, res);
        res = (byte) Arrays.binarySearch(arr, (byte)15);
        assertEquals(-11, res);
        res = (byte) Arrays.binarySearch(arr, (byte)5);
        assertEquals(-3, res);
    }
    @Test
    void Last() {
        Integer[] arr = new Integer[] {1, 4, 6, 7, 8, 9, 10, 11, 12, 13};
        int res = (byte) Arrays.binarySearch(arr, 5, 6, 7, new IntComparator());
        assertEquals(-6, res);

    }
}
