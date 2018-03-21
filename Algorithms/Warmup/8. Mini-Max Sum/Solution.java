import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static void miniMaxSum(int[] arr) {
        // Complete this function
        int x = 0; long minSum, maxSum;
        long[] sum = new long[arr.length];
        
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                if(j == x) {
                    continue;
                }else {
                    sum[i] += arr[j];    
                }
            }
            x++;
        }
        
        maxSum = sum[0]; minSum = sum[0];
        for(int i=0; i<sum.length; i++) {
            if(sum[i] > maxSum) {
                maxSum = sum[i];
            }
            if(sum[i]<minSum) {
                minSum = sum[i];
            }
        }
        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
