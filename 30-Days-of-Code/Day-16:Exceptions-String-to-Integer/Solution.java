// Problem : https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        
        try {
            String S = in.next();
            number = Integer.parseInt(S);
            System.out.println(number);
        }catch(Exception e) {
            System.out.println("Bad String");
        }
        
    }
}