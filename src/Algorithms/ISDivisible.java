package Algorithms;

public class ISDivisible {

    public void isDivisible(int num) {
        if(num % 3 == 0 && num % 4 == 0) {
            System.out.println("Divisible by 3 and 4");
        } else if(num % 3 == 0) {
            System.out.println("Divisible by 3");
        } else if(num % 4 == 0) {
            System.out.println("Divisible by 4");
        } else {
            System.out.println("Not divisible by 3 and 4");
        }
    }


    public void isDivisibleSecond(int num) {
        if(num % 5 == 0 && num % 3 == 0) {
            System.out.println("Divisible by 5 and 3");
        } else if(num % 5 == 0) {
            System.out.println("Divisible by 5");
        } else if(num % 3 == 0) {
            System.out.println("Divisible by 3");
        } else {
            System.out.println("Not divisible by 5 and 3");
        }
    }
}
