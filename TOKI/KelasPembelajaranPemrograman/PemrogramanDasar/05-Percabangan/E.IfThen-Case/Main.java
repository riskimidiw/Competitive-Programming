// Status : Accepted

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        switch(n.length()) {
            case 1:
                System.out.println("satuan");
                break;
            case 2:
                System.out.println("puluhan");
                break;
            case 3:
                System.out.println("ratusan");
                break;
            case 4:
                System.out.println("ribuan");
                break;
            case 5:
                System.out.println("puluhribuan");
        }
    }
}