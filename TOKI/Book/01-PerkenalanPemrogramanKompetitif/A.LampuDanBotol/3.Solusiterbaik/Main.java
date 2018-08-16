import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();

        long s = Math.round(Math.sqrt(n));

        if(s*s != n) {
            System.out.println("lampu mati");
        }else {
            System.out.println("lampu menyala");
        }
    }
}