import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        sc.close();

        long num = n;
        int divisorCount = 1;
        for(long i = 2; i*i <= num; i++) {
            int factorCount = 0;
            while(num % i == 0) {
                factorCount++;
                num /= i;
            }

            divisorCount *= (1 + factorCount);
        }
        if (num > 1) { // Sisa faktor
            divisorCount *= 2;
        }

        if(divisorCount % 2 == 0) {
            System.out.println("lampu mati");
        }else {
            System.out.println("lampu menyala");
        }
    }
}