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

        String regular2 = "apache";
        String expectedResult2 = "ehcapa";

        String actualResult = reverse.reverseString(regular);
        Assertions.assertEquals(expectedResult, actualResult);


        String actualResult2 = reverse.reverseString2(regular2);
        Assertions.assertEquals(expectedResult2, actualResult2);
    }



}
