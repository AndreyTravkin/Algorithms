package Tests;

import Algorithms.ReverseString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReserveStringTest {

    @Test
    public void reverseStringTest() {
        ReverseString reverse = new ReverseString();

        String regular = "batya";
        String expectedResult = "aytab";

        String actualResult = reverse.reverseString(regular);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
