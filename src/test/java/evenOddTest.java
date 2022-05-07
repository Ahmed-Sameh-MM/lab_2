import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class evenOddTest {

    EvenOdd evenOdd = new EvenOdd();

    Map<Integer, String> testCases = new HashMap<Integer, String>();

    @Test
    public void test() {
        testCases.put(2, "Even");
        testCases.put(10, "Even");
        testCases.put(18, "Even");
        testCases.put(5, "Odd");
        testCases.put(100, "Even");
        testCases.put(93, "Odd");
        testCases.put(71, "Odd");
        testCases.put(60, "Even");
        testCases.put(9, "Odd");
        testCases.put(21, "Odd");

        for(Map.Entry m:testCases.entrySet()) {
            int result = (Integer) m.getKey();
            assertEquals(m.getValue(), evenOdd.isEvenOrIsOdd(result));
        }
    }
}
