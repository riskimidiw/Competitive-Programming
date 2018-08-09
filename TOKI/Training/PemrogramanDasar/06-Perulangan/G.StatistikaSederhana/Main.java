// Status : Accepted

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int n = sc.nextInt();
        int max = n;
        int min = n;

        for(int i=1; i<length; i++) {
            n = sc.nextInt();
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        System.out.println(max + " " + min);
    }
}