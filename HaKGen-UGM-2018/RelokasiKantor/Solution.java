// Status : Accepted

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] k = new int[n];
        boolean[] pernah = new boolean[n];
        int[] s = new int[m];
        
        for(int i=0; i<n; i++) {
            k[i] = sc.nextInt();
        }
        
        for(int i=0; i<m; i++) {
            s[i] = sc.nextInt();
        }
        
        for(int i=0; i<m; i++) {
            for(int j=0; j<s[i]; j++) {
                int max = 0;
                int index = 0;
                for(int l=0; l<n; l++) {
                    if(k[l] > max && !pernah[l]) {
                        max = k[l];
                        index = l;
                    }
                }
                pernah[index] = true;
                k[index] = i+1;
            }
        }
        
        for(int i=0; i<k.length; i++) {
             System.out.println(k[i]);
        }
    }
}