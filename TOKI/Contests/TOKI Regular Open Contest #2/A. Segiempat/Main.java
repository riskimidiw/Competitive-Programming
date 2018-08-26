import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c1 = (n/a) * (m/b);
        int c2 = (n/b) * (m/a);
        System.out.println(Math.max(c2, c1));
    }
}