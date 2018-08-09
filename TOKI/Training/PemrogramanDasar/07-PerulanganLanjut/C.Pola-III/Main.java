// Status : Accepted

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                if(count > 9) count = 0;
                System.out.print(count++);
            }
            System.out.println();
        }
    }
}