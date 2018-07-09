// Status : Accepted

import java.util.*;

public class Main {

    static String isPrime(int n) {
        if(n == 1) return "BUKAN";
        for(int i=2; i*i<=n; i++) {
            if(n%i == 0) return "BUKAN";
        }
        return "YA";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;

        n = sc.nextInt();
        for(int i=0; i<n; i++) {
            m = sc.nextInt();
            System.out.println(isPrime(m));
        }
    }
}