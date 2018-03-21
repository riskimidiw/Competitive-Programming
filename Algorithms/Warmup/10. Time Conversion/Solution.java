import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        // Complete this function
        String hour, min, sec, time, formattedHour = "";

        hour = "" + s.charAt(0) + s.charAt(1);
        min = "" + s.charAt(3) + s.charAt(4);
        sec = "" + s.charAt(6) + s.charAt(7);
        time = "" + s.charAt(8) + s.charAt(9);

        if(time.equals("PM")) {
            if(s.equals("12:00:00PM")) {
                return "12:00:00";
            }else if(Integer.parseInt(hour) == 12) {
                formattedHour = "12";
            }else {
                hour = "" + (Integer.parseInt(hour) + 12);
                formattedHour = "" + hour;
            }

        }else if(time.equals("AM")) {
            if(s.equals("12:00:00AM")) {
                return "00:00:00";
            }else if(Integer.parseInt(hour) == 12){
                formattedHour = "00";
            }else {
                formattedHour = hour;
            }
        }
        return formattedHour + ":" + min + ":" + sec;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
