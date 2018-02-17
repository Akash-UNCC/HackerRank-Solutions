
package hacher_rank; 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution50 {

    static int pairs(int k, int[] arr) {
        LinkedHashMap map = new LinkedHashMap();
    	for(int i=0;i<arr.length;i++){
    		map.put(arr[i],1);
    	}
        
        int pair =0; 
        for(int i=0;i<arr.length;i++){
    	int target = arr[i]+k;
        if(map.containsKey(target)) {
            pair++;
        }   
    	}
            
	return pair;
    		    		
    	}
	
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = pairs(k, arr);
        System.out.println(result);
        in.close();
    }
}
