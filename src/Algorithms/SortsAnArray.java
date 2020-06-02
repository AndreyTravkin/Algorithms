package Algorithms;

import java.util.Arrays;

public class SortsAnArray {


    // arr = [5, 3, 10, 18, 4]

    public int[] sortsAnArray(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length; j++){
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = arr[i];
                }
            }
        }


        return arr;
    }






}
