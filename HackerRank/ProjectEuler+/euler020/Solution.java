// Problem : https://www.hackerrank.com/contests/projecteuler/challenges/euler020/problem

import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    static BigInteger factorial(long n) {
        if(n <= 1) {
            return BigInteger.valueOf(1);
        }

        return BigInteger.valueOf(n).multiply(factorial(n-1));
    }

    static BigInteger sum(String s) {
        BigInteger b = BigInteger.valueOf(0);
        for(int i=0; i<s.length(); i++) {
            b = b.add(new BigInteger(s.charAt(i)+""));
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            long l = sc.nextLong();
            String s = factorial(l).toString();
            s = s.replaceAll("0", "");
            System.out.println(sum(s));
        }
    }
}