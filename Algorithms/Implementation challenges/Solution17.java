package hacher_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution17 {

    static int maximizingXor(int l, int r) {
       
         int max = 0;
         //int n = l;
         int xor = 0;
        for(int n = l;n <= r; n++){
          for(int k = n; k<= r; k++){
            //System.out.println("11klcs");
             xor = n^k;
             //System.out.println(xor);
              if(xor>max){
                 max = xor;
              }
              
              
          }  
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int r = in.nextInt();
        int result = maximizingXor(l, r);
        System.out.println(result);
        in.close();
    }
}
