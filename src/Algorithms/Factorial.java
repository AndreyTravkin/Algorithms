package Algorithms;

public class Factorial {



    public int getFactorialofNum(int n) {
        int factorial = 1;

        for(int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }
}
