import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        sc.close();

        int divisorCount = 0;
        for(long i = 1; i <= n; i++) {
            if(n%i == 0) {
                divisorCount++;
            }
        }

        if(divisorCount % 2 == 0) {
            System.out.println("lampu mati");
        }else {
            System.out.println("lampu menyala");
        }
    }
}