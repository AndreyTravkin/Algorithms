package Algorithms;

import org.junit.platform.commons.util.StringUtils;

public class ReversedSentence {

    public String reverse(String sentence) {
        String[] arr = sentence.split(" ");
        String reversed = "";
        for(int i = arr.length - 1; i >= 0 ; i--)
        {
            reversed += arr[i] + " ";
        }

        System.out.println(reversed);
        return reversed.trim();
    }


}
