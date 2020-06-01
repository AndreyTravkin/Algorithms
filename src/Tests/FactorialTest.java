package Tests;

import Algorithms.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    Factorial factorial = new Factorial();

    @Test
    public void getFactorialofNumTest(){
        int num = 4;

        int expectedResult = 24;
        int actualResult = factorial.getFactorialofNum(num);
        Assertions.assertEquals(expectedResult, actualResult);
    }

}
