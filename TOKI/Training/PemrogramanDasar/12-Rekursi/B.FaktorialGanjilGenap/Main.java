// Status : Accepted

import java.util.*;

public class Main {
    
    static int ganjilGenap(int n) {
        if(n == 1) {
            return 1;
        }else if(n%2 == 0) {
            return n/2 * ganjilGenap(n-1);
        }
        
        return n * ganjilGenap(n-1) ;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(ganjilGenap(n));
    }
}