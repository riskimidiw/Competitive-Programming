// Problem : https://www.hackerrank.com/challenges/bon-appetit/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        int n, k, charged, sum = 0;
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        int[] food = new int[n];
        k = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            food[i] = sc.nextInt();
            if(i!=k) {
                sum += food[i];     
            }
        }
        charged = sc.nextInt();
        if(sum/2 >= charged) {
            System.out.println("Bon Appetit");
        }else {
            System.out.println(charged - (sum/2));
        }
    }
}
