package hacher_rank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution8 {

    static int sockMerchant(int n, int[] ar) {
       
    
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
        
        for(int i = 0; i< ar.length; i++ ){
            if(map.containsKey(ar[i])){
            	map.put(ar[i],(int)map.get(ar[i])+1);
            }else{
            	map.put(ar[i],1);
            }
        }
        int out =0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        	
        	out = out + entry.getValue()/2;
        	
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
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
