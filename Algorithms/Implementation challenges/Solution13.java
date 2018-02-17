package hacher_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution13 {
   
    static int utopianTree(int n) {
     int height = 1;
     while(n>0){
         height = height*2;
     
      n--;
      if(n==0){
          break;
      }
         height = height + 1  ;
             n--;
     }
        return height;
       
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int result = utopianTree(n);
            System.out.println(result);
        }
        in.close();
    }
}
