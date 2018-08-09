// Status : Accepted

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[1000000][1];

        int i=2;
        while(i<=num) {
            if(num%i == 0) {
                num /= i;
                arr[i][0]++;
            }else {
                i++;
            }
        }
        int last = i;
        for(i=0; i<1000000; i++) {
            if(arr[i][0] != 0) {
                if(arr[i][0]>1) System.out.print(i + "^" + arr[i][0]);
                else System.out.print(i);
                if(last != i) System.out.print(" x ");
            }
        }
        System.out.println();
    }
}