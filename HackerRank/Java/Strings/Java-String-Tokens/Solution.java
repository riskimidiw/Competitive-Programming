// Problem : https://www.hackerrank.com/challenges/java-string-tokens

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        int count = 0, j=0;
        String[] word = new String[s.length()];
        boolean record = false;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) < 65 || s.charAt(i) > 90 &&
                    s.charAt(i) < 97 || s.charAt(i) > 122) {
                j = 0;
                record = false;
            }else {
                j++;
                if(j == 1) {
                    count++;
                    record = true;
                }
            }
            if(record) {
                word[count-1] += s.charAt(i);
            }
        }
        System.out.println(count);
        for(int i=0; i<count; i++) {
            word[i] = word[i].substring(4, word[i].length());
            System.out.println(word[i]);
        }
        scan.close();
    }
}
