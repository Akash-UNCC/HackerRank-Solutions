package hacher_rank;


import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution22 {

    static String funnyString(String s){
        
      for(int i=0;i<s.length()-1;i++){
    	 int df = s.charAt(i+1)-s.charAt(i);
         if(df<0){
             df = -1*df;
         } 
        
    	 int dr = s.charAt(s.length()-2-i)-s.charAt(s.length()-1-i);
            if(dr<0){
             dr = -1*dr;
         } 
    	 if(df!=dr){
    		 return "Not Funny";
    	 }
      }
        
      return "Funny";
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
}
