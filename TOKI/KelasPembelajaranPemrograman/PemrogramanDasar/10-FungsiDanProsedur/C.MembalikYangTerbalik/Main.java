// Status : Accepted

import java.util.*;

public class Main {

    public static int getReverseValue(String[] arr) {
        String value = "";
        for(int i=arr.length-1; i>=0; i--) {
            value += arr[i];
        }
        return Integer.parseInt(value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.next().split("");
        String[] b = sc.next().split("");

        int value = getReverseValue(a) + getReverseValue(b);
        String[] arrVal = Integer.toString(value).split("");
        System.out.println(getReverseValue(arrVal));
    }
}