// Problem : https://www.hackerrank.com/challenges/30-review-loop/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        n = sc.nextInt(); sc.nextLine();
        for(int i=0; i<n; i++) {
            String s = sc.nextLine();
            for(int j=0; j<s.length(); j++) {
                if(j%2 == 0) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.print(" ");
            for(int j=0; j<s.length(); j++) {
                if(j%2 == 1) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println("");
        }
        
    }
}