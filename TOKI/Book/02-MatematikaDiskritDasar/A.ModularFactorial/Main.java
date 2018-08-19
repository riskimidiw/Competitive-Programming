import java.util.*;

public class Main {

    static int modularFactorial(int n, int k) {
        int result = 1;
        for(int i=1; i<=n; i++) {
            result = (result * i) % k;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = modularFactorial(5, 6);
        System.out.println(result);
    }
}