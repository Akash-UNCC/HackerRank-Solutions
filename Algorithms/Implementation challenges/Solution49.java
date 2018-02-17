package hacher_rank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution49 {

    static int[] missingNumbers(int[] arr, int[] brr) {
      		
    			
    	LinkedHashMap<Integer,Integer> map1 = new LinkedHashMap<Integer,Integer>();
    	LinkedHashMap<Integer,Integer> map2 = new LinkedHashMap<Integer,Integer>();
    	for(int i =0;i<arr.length;i++){
    		if(map1.containsKey(arr[i])){
    			map1.put(arr[i],map1.get(arr[i])+1);
    	}else{
    		map1.put(arr[i],1);
    	}
    	}
    	
    	
    	for(int i =0;i<brr.length;i++){
    		if(map2.containsKey(brr[i])){
    			map2.put(brr[i],map2.get(brr[i])+1);
    	}else{
    		map2.put(brr[i],1);
    	}
    	}
    	//System.out.println(map1);
    	//System.out.println(map2);
    	ArrayList list = new ArrayList();
    	int diff= 0;
    	for(Map.Entry<Integer,Integer> entry : map2.entrySet()){
    		     if(map1.containsKey(entry.getKey())){
    		    	 diff= map1.get(entry.getKey())-entry.getValue();
    		    	 if(diff!=0){
    		    	  list.add(entry.getKey());
    		    	 }
    		     }else{
    		    	  list.add(entry.getKey());
    		     }
    	}
    	Collections.sort(list);
    	int[] out = new int[list.size()];
    	for(int i=0;i<list.size();i++){
    		out[i]=(int) list.get(i); 
    	}
    	return out;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] brr = new int[m];
        for(int brr_i = 0; brr_i < m; brr_i++){
            brr[brr_i] = in.nextInt();
        }
        int[] result = missingNumbers(arr, brr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
