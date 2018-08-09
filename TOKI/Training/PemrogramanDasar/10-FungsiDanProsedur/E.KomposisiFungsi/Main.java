// Status : Accepted

import java.util.*;

public class Main {
    static int a, b, k, x;

    public static int fun(int x) {
        return Math.abs(a*x + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val;

        a = sc.nextInt();
        b = sc.nextInt();
        k = sc.nextInt();
        x = sc.nextInt();
        val = fun(x);
        
        for(int i=1; i<k; i++) {
            val = fun(val);
        }
        System.out.println(val);
    }
}