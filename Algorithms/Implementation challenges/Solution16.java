package hacher_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution16 {

    static int lonelyinteger(int[] a) {
       
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
         
        for(int a1 : a){
          
        if(map.containsKey(a1)){    
         
        	map.put(a1, (int)map.get(a1)+1);
        	}else{
        	map.put(a1, 1);	
        	}
        }
        

       for(Map.Entry<Integer, Integer> entry : map.entrySet()){
         if(entry.getValue()==1){
        	 return (int)entry.getKey();
        	// break;
         }
       
        }
       return 0;
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = lonelyinteger(a);
        System.out.println(result);
    }
}

