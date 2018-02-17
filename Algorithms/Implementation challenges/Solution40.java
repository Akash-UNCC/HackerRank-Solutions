package hacher_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution40 {

    static int[] cutTheSticks(int[] arr) {
    	ArrayList<Integer> out = new ArrayList();
    	ArrayList<Integer> l1= new ArrayList();
    	for(int i=0;i<arr.length;i++){
    		l1.add(arr[i]);	
    	}
    	Collections.sort(l1);
    	int min =l1.get(0);
    	//System.out.println(min);
    	
    	//System.out.println("=========");
    	for(int p=0;p<arr.length;p++){ 	
    	ArrayList<Integer> l2 = new ArrayList();
    	int count =0;
    	for(int i =0;i<l1.size();i++){
    		int r = l1.get(i)-min;
    		if(r>=0){
    		count++;	
    	    l2.add(l1.get(i)-min);
    		}else{
    		l2.add(0);	
    		}
    	}
    	l1=l2;
    	Collections.sort(l2);
    	for(int h=0;h<l2.size();h++){
    		if(l2.get(h)!=0){
    		min =l2.get(h);
    		//System.out.println("min= "+min);
    		break;
    		}
    	}
    	
    	//System.out.println("count "+count);
    	if(count!=0){
    	out.add(count);
    	}
    	//System.out.println("l2="+l2 );
    }
    	//System.out.println(out);
    	int[] output = new int[out.size()];
    	for(int i=0;i<out.size();i++){
    		output[i]=out.get(i);
    	}
		return output;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = cutTheSticks(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
  

        in.close();
    }
}
