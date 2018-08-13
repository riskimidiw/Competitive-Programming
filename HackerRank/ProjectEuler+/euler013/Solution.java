// Problem : https://www.hackerrank.com/contests/projecteuler/challenges/euler013/problem

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger b;
        int n = sc.nextInt();

        b = new BigInteger(sc.next());
        for(int i=1; i<n; i++) {
            String number = sc.next();
            b = b.add(new BigInteger(number));
        }

        String s = b.toString();
        s = s.substring(0, 10);
        System.out.println(s);
    }
}