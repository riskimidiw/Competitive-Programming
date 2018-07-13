// Status : Accepted

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];

        for(int i=n-1; i>=0; i--) {
            for(int j=0; j<m; j++) {
                arr[j][i] = sc.nextInt();
            }
        }
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(arr[i][j]);
                if(j!= n-1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}