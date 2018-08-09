// Status : Accepted

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] c = new char[s.length()];
        int k = sc.nextInt();

        for(int i=0; i<s.length(); i++) {
            c[i] = (char)((s.charAt(i)-97 + k) % 26 + 97);
        }

        for(int i=0; i<s.length(); i++) {
            System.out.print(c[i]);
        }
        System.out.println();
    }
}