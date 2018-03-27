// Problem : https://www.hackerrank.com/challenges/sock-merchant/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
        // Complete this function
        int[] data = new int[101];
        int count = 0;
        
        for(int i=0; i<n; i++) {
            data[ar[i]]++;
        }
        for(int i=0; i<=100; i++) {
            if(data[i] != 0) {
                count += data[i]/2;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
