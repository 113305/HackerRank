import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        double positive = 0.0;
        double negative = 0.0;
        double zero = 0.0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]>0){
                positive++;
            }
            else if(arr[arr_i]<0){
                negative++;
            }
            else
                zero++;
        }
        double positiveResult = positive/n;
        double negativeResult = negative/n;
        double zeroResult = zero/n;
        System.out.printf("%.6f \n", positiveResult);
        System.out.printf("%.6f \n", negativeResult);
        System.out.printf("%.6f \n", zeroResult);
    }
}
