package hacher_rank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution7 {

    static int migratoryBirds(int n, int[] ar) {
       int[] counter = new int[5];  
       for(int i=0; i< ar.length;i++){
           if(ar[i]==1){
              counter[0]++;
           }else if(ar[i]==2){
               counter[1]++;
           }else if(ar[i]==3){
               counter[2]++;
           }else if(ar[i]==4){
               counter[3]++; 
           }else{
               counter[4]++;
           }
       }
         ArrayList l = new ArrayList();
         for(int c : counter){
    	 l.add(c);
         }
         Collections.sort(l);
         Collections.reverse(l);
         int val=(int)l.get(0);
         int out =0;
         for(int i=0;i< counter.length;i++){
        	 if(val==counter[i]){
        		 out = i+1;
        		 break;
             }
         }
         

          return out;  
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
