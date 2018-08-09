// Status : Accepted

import java.util.*;

public class Main {
    static int a, b;
    
    static int komposisi(int x, int k) {
        int result = (int)Math.abs(a*x + b);
        if(k == 1) {
            return result;
        }
        return komposisi(result, k-1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        
        System.out.println(komposisi(x, k));
    }
}