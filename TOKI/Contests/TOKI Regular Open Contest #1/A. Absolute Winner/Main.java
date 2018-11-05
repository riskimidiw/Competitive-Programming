import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[3];
        boolean isPossible = false;

        x[0] = sc.nextInt();
        x[1] = sc.nextInt();
        x[2] = sc.nextInt();

        int match = (x[0] + x[1] + x[2]) / 7;
        for(int tmp: x) {
            if(tmp/match == 4) {
                isPossible = true;
                break;
            }
        }
        if(isPossible) System.out.println("YA");
        else System.out.println("TIDAK");
    }
}
