// Status : Accepted

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");

        for(int i=0; i<s.length; i++) {
            if(s[i].charAt(0) > 96) s[i] = s[i].toUpperCase();
            else s[i] = s[i].toLowerCase();
        }

        for(int i=0; i<s.length; i++) {
            System.out.print(s[i]);
        }
        System.out.println();
    }
}