package Algorithms;

public class ReverseString {

    public String reverseString(String txt) {

        String reversed = new StringBuffer(txt).reverse().toString();

        return reversed;
    }
}
