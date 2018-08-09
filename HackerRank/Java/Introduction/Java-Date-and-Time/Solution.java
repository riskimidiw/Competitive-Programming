// Problem : https://www.hackerrank.com/challenges/java-date-and-time/problem

import java.util.Scanner;
import java.util.Calendar;

public class Solution {

    public static String getDay(String d, String m, String y) {
        String[] daysOfWeek = {"SUNDAY", "MONDAY", "TUESDAY",
                "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"
        };
        Calendar c = Calendar.getInstance();
        c.set(Integer.parseInt(y), Integer.parseInt(m)-1, Integer.parseInt(d));
        
        return daysOfWeek[c.get(Calendar.DAY_OF_WEEK)-1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }
}