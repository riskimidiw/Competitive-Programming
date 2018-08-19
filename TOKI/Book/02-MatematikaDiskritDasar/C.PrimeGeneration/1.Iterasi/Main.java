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

    static List<Integer> simplePrimegeneration(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=2; i<=n; i++) {
            if(isPrimeSqrt(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = simplePrimegeneration(10);
        for(int tmp : list) {
            System.out.println(tmp);
        }
    }
}