package Tests;

import Algorithms.FibonacciNum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciNumTest {


    FibonacciNum fibonacci = new FibonacciNum();

    @Test
    public void printFibonacciNumsTest() {
        int num = 1;
        int num2 = 13;

        int expectedResult = 233;
        int actualResult =  fibonacci.printFibonacciNums(num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
