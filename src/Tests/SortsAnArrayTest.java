package Tests;

import Algorithms.SortsAnArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortsAnArrayTest {

    @Test
    public void sortsAnArrayTest() {
        SortsAnArray sort = new SortsAnArray();

        int[] arr = {4, 3, 8, 5, 12, 9};
        int[] expectedResult = {3,4,5,8,9,12};

        int[] actualResult = sort.sortsAnArray(arr);


        System.out.println(Arrays.toString(actualResult));
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }



}
