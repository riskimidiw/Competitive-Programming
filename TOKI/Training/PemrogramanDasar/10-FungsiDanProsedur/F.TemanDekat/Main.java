// Status : Accepted

import java.util.*;

public class Main {
    static int d;

    static int kedekatan(int a[], int[] b) {
        return (int) (Math.pow(Math.abs(a[0] - b[0]), d)
                + Math.pow(Math.abs(a[1] - b[1]), d));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min, max;
        int n = sc.nextInt();
        int[][] murid = new int[n][2];
        d = sc.nextInt();

        for(int i=0; i<n; i++) {
            for(int j=0; j<2; j++) {
                murid[i][j] = sc.nextInt();
            }
        }

        min = max = kedekatan(murid[0], murid[1]);
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                min = Math.min(min, kedekatan(murid[i], murid[j]));
                max = Math.max(max, kedekatan(murid[i], murid[j]));
            }
        }
        System.out.println(min + " " + max);
    }
}