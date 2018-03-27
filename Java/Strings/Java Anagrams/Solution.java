// Problem : https://www.hackerrank.com/challenges/java-anagrams

import java.io.*;
import java.util.*;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int[] charA = new int[26];
        int[] charB = new int[26];

        String A = a.toLowerCase();
        String B = b.toLowerCase();
        for(int i=0; i<A.length(); i++) {
            charA[A.charAt(i)-97]++;
        }
        for(int i=0; i<B.length(); i++) {
            charB[B.charAt(i)-97]++;
        }
        for(int i=0; i<26; i++) {
            if(charA[i] != charB[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
