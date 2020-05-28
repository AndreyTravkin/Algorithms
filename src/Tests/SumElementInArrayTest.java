package Tests;
import Algorithms.SumElementInArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SumElementInArrayTest {


    @Test
    void testSumElements() {
        SumElementInArray sumElementInArray = new SumElementInArray();
        int array[] = {1, 5, -5, 100, 18};
        int expectedResult = 119;
        int actualResult =  sumElementInArray.sumElements(array);
        Assertions.assertEquals(expectedResult, actualResult);
    }

}
