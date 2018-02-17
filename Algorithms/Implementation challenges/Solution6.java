package hacher_rank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution6 {

    static int migratoryBirds(int n, int[] ar) {
        
        TreeMap<Integer,Integer> map = new TreeMap();
        
        for(int i=0 ;i< ar.length ; i++){
            
           if(map.containsKey(ar[i])){
        	  map.put(ar[i], (int)map.get(ar[i])+1);
        	 }else{
        		 map.put(ar[i],1);
        	 }
            }
        
        System.out.println(map);
           

          ArrayList l1 = new ArrayList();		   
          for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        	  l1.add(entry.getValue());
          }
          
          Collections.sort(l1);
          Collections.reverse(l1);
          int out = 0;
          for(int i =1; i<6; i++){
            if(map.get(i)==l1.get(0)){
            	out = i;
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
