import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigDecimal sum = BigDecimal.valueOf(0);
        for(int i=0; i<4; i++) {
            sum = sum.add(new BigDecimal(sc.next()));
        }
        String s = String.format("Rp %.2f", sum.divide(BigDecimal.valueOf(4)));
        System.out.println(s.replace('.', ','));
    }
}