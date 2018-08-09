// Status : Accepted

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        System.out.print((int)Math.floor(n) + " ");
        System.out.println((int)Math.ceil(n));
    }
}