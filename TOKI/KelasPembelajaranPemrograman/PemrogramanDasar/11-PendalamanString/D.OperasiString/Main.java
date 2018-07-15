// Status : Accepted

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = new String[4];
        int fIndex, lIndex;

        for(int i=0; i<s.length; i++) {
            s[i] = sc.next();
        }

        s[0] = s[0].replaceFirst(s[1], "");
        fIndex = s[0].indexOf(s[2]);
        lIndex = fIndex + s[2].length();
        s[0] = s[0].substring(0, lIndex) + s[3] + s[0].substring(lIndex);
        System.out.println(s[0]);
    }
}