import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        timeConversion(time);
        System.out.print(timeConversion(time));
    }

    public static String timeConversion(String time){
        String hour = time.substring(0,2);
        int h = Integer.parseInt(hour);

        if(time.charAt(8)=='P'){
            if(h<12){
                h += 12;
            }
            String conversionHour = String.valueOf(h);
            time = time.replaceFirst(hour, conversionHour);
        }

        else{
            if(h==12){
                time = time.replaceFirst(hour, "00");
            }
        }

        time = time.substring(0,8);
        return time;
    }
}
