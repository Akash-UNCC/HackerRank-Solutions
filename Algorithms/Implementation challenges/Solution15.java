package hacher_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution15 {

    static int viralAdvertising(int n) {
        ArrayList<Integer> l1 = new ArrayList();
        int out =0;
        int sum =2;
        if(n==0){
          return 0;  
        }else if(n==1){
          return 2;  
        }else{
        for(int i=1;i<n;i++){
            
         sum = (sum * 3)/2  ;
         l1.add(sum) ;  
        
    }
    }
    for(Integer s : l1){    
     out= out+(int)s;
    }
    return out+2;    
    }   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = viralAdvertising(n);
        System.out.println(result);
        in.close();
    }
}