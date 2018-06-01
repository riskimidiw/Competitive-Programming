// Problem : https://www.hackerrank.com/challenges/apple-and-orange/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        // Complete this function
        int app = 0, or = 0, range = 0;
        for(int i=0; i<apples.length; i++) {
            range = a+apples[i];
            if( range >= s && range <= t  ) {
                app++;
            }
        }
        
        for(int i=0; i<oranges.length; i++) {
            range = b+oranges[i];
            if( range >= s && range <= t  ) {
                or++;
            }
        }
        System.out.println(app);
        System.out.println(or);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }
}
