import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            String x1;
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                if(x == 0) {
                    x1 = "000";
                }else if(x < 100) {
                    x1 = "0" + x;
                }else {
                    x1 = "" + x;
                }
                System.out.printf("%-15s%-15s\n", s1, x1);
            }
            System.out.println("================================");

    }
}
