// Problem : https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] breakingRecords(int[] score) {
        // Complete this function
        int[] point = new int[2];
        int high = score[0], low = score[0];
        int hightPoint = 0, lowPoint = 0;
        for(int i=0; i<score.length; i++) {
            if(i == 0) {
                continue;
            }else if(score[i] > high) {
                high = score[i];
                hightPoint++;
            }else if(score[i] < low) {
                low = score[i];
                lowPoint++;
            }
        }
        point[0] = hightPoint;
        point[1] = lowPoint;
        return point;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i = 0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
