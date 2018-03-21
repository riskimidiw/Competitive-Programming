import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            list.add("" + sc.nextInt());
        }
        int query = sc.nextInt(); 
        String queryName;
        for(int i=0; i<query; i++) {
            int indek;
            sc.nextLine();
            queryName = sc.nextLine();
            if(queryName.equals("Insert")) {
                indek = sc.nextInt();
                list.add(indek, ""+sc.nextInt());
            }
            if(queryName.equals("Delete")) {
                indek = sc.nextInt();
                list.remove(indek);
            }
        }
        
        for(String s : list) {
            System.out.print(s + " ");
        }
    }
}
