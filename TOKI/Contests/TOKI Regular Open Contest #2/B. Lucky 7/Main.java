import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int angkaDua;
        if(n%2 == 0) {
            angkaDua = (n-2)/2;
            System.out.println(angkaDua+2);
            System.out.print(1 + " " + 1 + " ");
            for(int i=0; i<angkaDua; i++) {
                System.out.print(2);
                if(i!=angkaDua-1){
                    System.out.print(" ");
                }
            }
        }else {
            angkaDua = (n-1)/2;
            System.out.println(angkaDua+1);
            System.out.print(1 + " ");
            for(int i=0; i<angkaDua; i++) {
                System.out.print(2);
                if(i!=angkaDua-1){
                    System.out.print(" ");
                }
            }
        }
    }
}