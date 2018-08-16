import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();

        int divisorCount = 0;
        for(long i=0; i<n; i++) {
            if(n%1 == 0) {
                divisorCount++;
            }
        }

        if(divisorCount%2 == 0) {
            System.out.println("lampu mati");
        }else {
            System.out.println("lampu menyala");
        }
    }
}