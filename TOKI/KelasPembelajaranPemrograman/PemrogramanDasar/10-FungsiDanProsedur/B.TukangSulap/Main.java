// Status : Accepted

import java.util.*;

public class Main {

    static void swap(int[][] arr, int a, int b, int c, int d) {
        int tmp = arr[a][b];
        arr[a][b] = arr[c][d];
        arr[c][d] = tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[2][n];
        int q;

        for(int i=0; i<2; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        q = sc.nextInt();

        for(int i=0; i<q; i++) {
            int a, b, c, d;
            a = sc.next().charAt(0) - 65;
            b = sc.nextInt();
            c = sc.next().charAt(0) - 65;
            d = sc.nextInt();

            swap(arr, a, b-1, c, d-1);
        }

        for(int i=0; i<2; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(arr[i][j]);
                if(j!=n-1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}