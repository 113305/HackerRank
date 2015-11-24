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
        int result1 = 0;
        long result2 = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(-Math.pow(2,31)<arr[arr_i]&&arr[arr_i]<Math.pow(2,31)-1){
                result2 += arr[arr_i];
            }
            else
                result1 += arr[arr_i];
        }
        long result3 = result1 + result2;
        System.out.print(result3);

    }
}
