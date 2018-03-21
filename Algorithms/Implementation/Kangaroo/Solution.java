import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
        int time = 1;
        // dumb way
        for(int i=0; i<Math.pow(10, 5); i++) {
            if((x1 + v1 * time) == (x2 + v2 * time)) {
                return "YES";
            }
            if(x2 > x1 && v2 > v1) {
                return "NO";
            }
            time++;
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
