// Problem : https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int div;
        
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            div = x / y;
            System.out.println(div);
        }catch(InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}