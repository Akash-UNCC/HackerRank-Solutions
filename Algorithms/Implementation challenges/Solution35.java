package hacher_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution35 {

    static int equalizeArray(int[] arr) {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
    	for(int i=0;i<arr.length;i++){
    		if(map.containsKey(arr[i])){
    			map.put(arr[i],map.get(arr[i])+1);
    		}else{
    			map.put(arr[i], 1);
    		}
    	}
    	System.out.println(map);
    	
    	ArrayList l = new ArrayList();
        Object[] freq = map.values().toArray();
        for(int i =0;i<freq.length;i++){
        	l.add(freq[i]);
        }
        Collections.sort(l);
        System.out.println(l);
        return arr.length- (int)l.get(l.size()-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = equalizeArray(arr);
        System.out.println(result);
        in.close();
    }
}
