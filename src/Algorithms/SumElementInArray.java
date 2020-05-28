package Algorithms;

public class SumElementInArray {

    // you're given an array of integers. Please return sum of all elements


    public int sumElements(int arr[]) {
            int sum = 0;

            for(int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }

        return sum;
    }



}
