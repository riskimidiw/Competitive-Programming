import java.util.*;

public class Main {

    static boolean isPrimeSqrt(int n) {
        if(n <= 1) return false;
        int i = 2;

        while(i*i <= n) {
            if(n%i == 0) return false;
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean primeTest = isPrimeSqrt(9);
        System.out.println(primeTest);
    }
}