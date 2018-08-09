// Status : Accepted

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[m][p];
        int[][] result = new int[n][p];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<m; i++) {
            for(int j=0; j<p; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<p; j++) {
                int sum = 0;
                for(int k=0; k<m; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                result[i][j] = sum;
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<p; j++) {
                System.out.print(result[i][j]);
                if(j != p-1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}