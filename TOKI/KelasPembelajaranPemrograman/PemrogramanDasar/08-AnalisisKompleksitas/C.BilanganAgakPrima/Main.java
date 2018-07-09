// Status : Accepted

import java.util.*;

public class Main {

    static String isLikePrime(int n) {
        int jmlFaktor = 2;
        for(int i=2; i*i<=n; i++) {
            if(n%i == 0) jmlFaktor++;
            if(jmlFaktor > 3) return "BUKAN";
        }
        return "YA";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;

        n = sc.nextInt();
        for(int i=0; i<n; i++) {
            m = sc.nextInt();
            System.out.println(isLikePrime(m));
        }
    }
}