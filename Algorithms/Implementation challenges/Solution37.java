package hacher_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution37 {

    static int minimumDistances(int[] a) {
        // Complete this function
    LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
    int d =0;
    for(int i =0;i<a.length;i++){ 
    	if(map.containsKey(a[i])){
    		d =i-map.get(a[i]);
    		if(d<map.get(a[i])){
    		map.put(a[i], d);
    		}
    	}else{
    		map.put(a[i], i);
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
        int result = minimumDistances(a);
        System.out.println(result);
        in.close();
    }
}

