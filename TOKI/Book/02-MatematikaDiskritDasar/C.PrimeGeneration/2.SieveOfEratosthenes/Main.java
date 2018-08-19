import java.util.*;

public class Main {

    static List<Integer> sieveOfEratosthenes(int n) {
        List<Integer> list = new ArrayList<>();
        boolean[] eliminated = new boolean[n+1];

        for(int i=2; i<=n ; i++) {
            if (!eliminated[i]) {
                list.add(i);
                int j = i * i;
                while (j <= n) {
                    eliminated[j] = true;
                    j += i;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = sieveOfEratosthenes(10);
        for(int tmp : list) {
            System.out.println(tmp);
        }
    }
}