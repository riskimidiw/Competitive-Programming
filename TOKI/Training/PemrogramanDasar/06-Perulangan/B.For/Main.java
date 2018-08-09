// Status : Accepted

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b;

        int sum = 0;
        for(int i=1; i<=n; i++) {
            b = sc.nextInt();
            sum += b;
        }

        System.out.println(sum);
    }
}