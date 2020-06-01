package Algorithms;

public class FibonacciNum {


    public int printFibonacciNums(int n) {
        if (n <= 1)
            return n;

       return printFibonacciNums(n - 1) +  printFibonacciNums(n - 2);
    }
}
