// Status : Accepted

import java.util.*;

public class Main {
    
    static void draw(int n) {
        if(n <= 0) {
            return;
        }
        
        draw(n-1);
        for(int i=0; i<n; i++) {
            System.out.print('*');
        }
        System.out.println();
        draw(n-1);
    }
    
    public static void main(String args[] )  {
        Scanner sc = new Scanner(System.in);
        
        draw(sc.nextInt());
    }
}