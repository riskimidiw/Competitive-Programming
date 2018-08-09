// Status : Accepted

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[1000];
        int value = 0, max = 0;

        for(int i=0; i<n; i++) {
           int x = sc.nextInt();
           arr[x-1]++;
           if(arr[x-1] > max) {
               max = arr[x-1];
               value = x;
           }else if(arr[x-1] == max) {
               if(x > value) {
                   max = arr[x-1];
                   value = x;
               }
           }
        }
        System.out.println(value);
    }
}