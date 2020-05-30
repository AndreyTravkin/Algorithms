package Tests;

import Algorithms.ISDivisible;
import org.junit.jupiter.api.Test;


public class IsDivisibleTest {
    ISDivisible divisible = new ISDivisible();


    @Test
    public void isDivisibleTest() {
        int num = 12;

       divisible.isDivisible(num);
       divisible.isDivisibleSecond(num);

    }

}
