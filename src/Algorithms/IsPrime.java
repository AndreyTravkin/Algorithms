package Algorithms;

public class IsPrime {

    public boolean prime(int num) {
        for (int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
