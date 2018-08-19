import java.util.*;

public class Main {

    static int[][] c;

    static void precomputeCombination(int n) {
        c = new int[n+1][n+1];
        for(int i=0; i<=n; i++) {
            c[i][0] = 1;
            for(int j=1; j<=i-1; j++) {
                c[i][j] = c[i-1][j-1] + c[i-1][j];
            }
            c[i][i] = 1;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        precomputeCombination(n);
        for(int i=0; i<=n; i++) {
            for(int j=0; j<=n; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}