// Status : Accepted

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrik = new int[3][3];
        
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                matrik[i][j] = sc.nextInt();
            }    
        }
        
        System.out.println(matrik[0][0] + " " + matrik[1][0] + " " + matrik[2][0]);
        System.out.println(matrik[0][1] + " " + matrik[1][1] + " " + matrik[2][1]);
        System.out.println(matrik[0][2] + " " + matrik[1][2] + " " + matrik[2][2]);
    }
}