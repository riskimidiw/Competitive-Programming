// Problem : https://www.hackerrank.com/contests/projecteuler/challenges/euler001/problem

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n, t;
        t = sc.nextLong();
        for(long i=0; i<t; i++) {
            n = sc.nextLong();
            long n1 = (n-1)/3;
            long sum1 = 3 * (n1 * n1 + n1) / 2;

            long n2 = (n-1)/5;
            long sum2 = 5 * (n2 * n2 + n2) / 2;

            long n3 = (n-1)/15;
            long sum3 = 15 * (n3 * n3 + n3) / 2;
            
            System.out.println(sum1 + sum2 - sum3);
        }
    }
}