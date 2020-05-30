package Tests;

import Algorithms.AllNumsUpToN;
import org.junit.jupiter.api.Test;


public class AllNumsUpToNTest {

    AllNumsUpToN nums = new AllNumsUpToN();

    @Test
    public void allNumsUpToNTest() {
        int num = 15;

        nums.iterateUptoTheNum(num);

    }
}
