import java.util.*;

public class Main {

    static int euclid(int a, int b) {
        if(b == 0) {
            return a;
        }
        return euclid(b, a%b);
    }

    public static void main(String[] args) {
        System.out.println(euclid(4, 12));
    }
}