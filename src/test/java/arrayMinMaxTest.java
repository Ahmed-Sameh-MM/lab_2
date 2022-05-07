import org.junit.Test;
import static org.junit.Assert.*;

public class arrayMinMaxTest {

    ArrayMinMax arrayMinMax = new ArrayMinMax();

    int[] minMaxElements(int arr[]) {
        int minElement = arr[0], maxElement = arr[0];

        for(int i = 1; i < arr.length; i++) {
            minElement = Integer.min(minElement, arr[i]);
            maxElement = Integer.max(maxElement, arr[i]);
        }

        return new int[] {minElement, maxElement};
    }

    @Test
    public void test() {
        int values[] = {10, 5, 7};
        assertArrayEquals(minMaxElements(values), arrayMinMax.minMax(values));

        values = new int[] {-2, -1, -7};
        assertArrayEquals(minMaxElements(values), arrayMinMax.minMax(values));

        values = new int[] {6, -7, 11};
        assertArrayEquals(minMaxElements(values), arrayMinMax.minMax(values));

        values = new int[] {0, 0, 0};
        assertArrayEquals(minMaxElements(values), arrayMinMax.minMax(values));

        values = new int[] {-11, 5, 30};
        assertArrayEquals(minMaxElements(values), arrayMinMax.minMax(values));

        values = new int[] {90, 15, 23};
        assertArrayEquals(minMaxElements(values), arrayMinMax.minMax(values));

        values = new int[] {18, 93, -12};
        assertArrayEquals(minMaxElements(values), arrayMinMax.minMax(values));

        values = new int[] {91, 0, -9};
        assertArrayEquals(minMaxElements(values), arrayMinMax.minMax(values));

        values = new int[] {80, 39, -2};
        assertArrayEquals(minMaxElements(values), arrayMinMax.minMax(values));

        values = new int[] {-18, 30, -20};
        assertArrayEquals(minMaxElements(values), arrayMinMax.minMax(values));
    }
}
