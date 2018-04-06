// Problem : https://www.hackerrank.com/challenges/30-binary-numbers/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static String toBinary(long n) {
        String binary = "";
        if(n > 0) {
            binary = "" +  toBinary(n/2) +  n%2;
        } 
        return binary;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long binary = sc.nextLong();
        boolean zeroNum = false;
        
        String sBinary = toBinary(binary);
        int i=0, x = 0, max = 0;
        while(i < sBinary.length()) {
            if(sBinary.charAt(i) == '0') {
                x = 0;
            }else {
                x++;
            }
            max = Math.max(x, max);
            i++;
        }
        System.out.println(max);
    }
}