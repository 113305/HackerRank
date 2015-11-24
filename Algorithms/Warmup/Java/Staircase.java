import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[][] array = new String[n][n];

        signArray(array);
        printArray(array);

    }

    public static void signArray(String array[][]){
        for(int i = 0; i<array.length; i++){
            for(int j =0; j<array[i].length; j++){
                if((i+j)>=(array.length-1))
                    array[i][j]="#";
                else
                    array[i][j]=" ";
            }
        }
    }
    public static void printArray(String array[][]){
        for(int i = 0; i<array.length; i++){
            for(int j =0; j<array[i].length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }


}
