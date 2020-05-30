package Tests;

import Algorithms.SwapVariables;
import org.junit.jupiter.api.Test;

public class SwapVariablesTest {

    SwapVariables swapVariables = new SwapVariables();


    @Test
    void swapVariables() {

        int first = 5;
        int second = 10;

        swapVariables.sumElements(first, second);

    }
}
