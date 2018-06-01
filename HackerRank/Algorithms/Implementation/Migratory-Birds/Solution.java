// Problem : https://www.hackerrank.com/challenges/migratory-birds/problem

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[] arr = new int[5];
        int n = scanner.nextInt();
        
        for(int i=0; i<n; i++) {
            arr[scanner.nextInt()-1]++;
        }
        
        int max = arr[0];
        int maxIndex = 0;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                maxIndex = i+1;
            }
        }
        System.out.println(maxIndex);
    }
}