// Status : Accepted

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {
            int number = sc.nextInt();
            int pow = (int)(Math.log(number) / Math.log(2));

            if(Math.pow(2, pow) == number) System.out.println("ya");
            else System.out.println("bukan");
        }
    }
}