// Status : Accepted

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        for(int i=1; i<=n; i++) {
            if(i%k == 0) System.out.print("*");
            else System.out.print(i);
            if(i != n) System.out.print(" ");
        }
        System.out.println();
    }
}