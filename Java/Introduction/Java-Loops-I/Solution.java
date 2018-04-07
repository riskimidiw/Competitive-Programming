// Problem : https://www.hackerrank.com/challenges/java-loops-i

import java.io.*;
import java.util.*;

public class Solution {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int N = sc.nextInt();
        for(int i=1; i<=10; i++) {
            System.out.println(N + " x " + i + " = " + (N*i));
        }
    }
}