import java.util.*;

public class Main {

    public static String getPopulatedArray(String[] s, int except) {
        String x = "";
        for(int i=0; i<s.length; i++) {
            if(i == except) continue;
            x += s[i];
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] wordOne = sc.next().split("");
        String[] wordTwo = sc.next().split("");
        Boolean b = false;

        for(int j=0; j<wordOne.length; j++) {
            String s1 = getPopulatedArray(wordOne, j);
            String s2 = getPopulatedArray(wordTwo, -1);
            if(s1.equals(s2)) b = true;
        }

        if(b) System.out.println("Tentu saja bisa!");
        else System.out.println("Wah, tidak bisa :(");
    }
}