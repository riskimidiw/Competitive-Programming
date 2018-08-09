// Status : Accepted

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            if(i%10 == 0) continue;
            else if(i == 42) {
                System.out.println("ERROR");
                break;
            }
            else System.out.println(i);
        }
    }
}