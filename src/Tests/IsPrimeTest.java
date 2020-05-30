package Tests;

import Algorithms.ISDivisible;
import Algorithms.IsPrime;
import org.junit.jupiter.api.Test;

public class IsPrimeTest {
    IsPrime prime = new IsPrime();

    @Test
    public void isPrimeTest(){
        int primeNum = 11;
        int notPrime = 10;

        prime.prime(primeNum);
        System.out.println(prime.prime(primeNum));
        prime.prime(notPrime);
        System.out.println(prime.prime(notPrime));
    }
}
