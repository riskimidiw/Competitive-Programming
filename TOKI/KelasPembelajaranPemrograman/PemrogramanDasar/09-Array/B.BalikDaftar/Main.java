// Status : Accepted

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int count = 0;

        while(sc.hasNextInt()) {
            arr[count] = sc.nextInt();
            count++;
        }
        for(int i=count-1; i>=0; i--) {
            System.out.println(arr[i]);
        }
    }
}