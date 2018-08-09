// Status : Accepted

import java.util.*;

public class Main {
    
    static boolean isPalindrome(String s) {
        if(s.length() <= 1) return true;
        else if(s.charAt(0) != s.charAt(s.length()-1)) {
            return false;
        }
        s = s.substring(1, s.length()-1);
        return isPalindrome(s);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        if(isPalindrome(s)) System.out.println("YA");
        else System.out.println("BUKAN");
    }
}