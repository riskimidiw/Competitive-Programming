import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        Map<String, Integer> names = new HashMap<>();
        int n, q;
        
        n = sc.nextInt();
        for(int i=0; i<n; i++) {
            list.add(sc.next());
        }
        Collections.sort(list);
        for(int i=0; i<list.size(); i++) {
            names.put(list.get(i), i+1);
        }
        
        q = sc.nextInt();
        for(int i=0; i<q; i++) {
            String s = sc.next();
            int sum = 0;
            for(int j=0; j<s.length(); j++) {
                sum += (s.charAt(j) - 64);
            }
            sum *= names.get(s);
            System.out.println(sum);
        }
    }
}