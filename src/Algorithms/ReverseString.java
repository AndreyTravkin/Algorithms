package Algorithms;

public class ReverseString {

    public String reverseString(String txt) {

        String reversed = new StringBuffer(txt).reverse().toString();

        return reversed;
    }

    public String reverseString2(String txt) {

        String reversedString = "";

        for (int i = txt.length() - 1; i >= 0; i-- ) {
            reversedString = reversedString + txt.charAt(i);
        }

        return reversedString;
    }

}
