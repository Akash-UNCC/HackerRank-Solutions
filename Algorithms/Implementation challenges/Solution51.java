package hacher_rank;



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution51 {

    static String solve(int[] a){
        
    boolean flag = false;
    	int sum = 0;
    	for(int i=0;i<a.length;i++){
    		sum = sum + a[i];
    	}
    int aux_sum = a[0];	
    for(int i=1;i<a.length-1;i++){
    	if(aux_sum==sum-aux_sum-a[i]){
    		flag = true;
    	}
    	aux_sum= aux_sum +a[i];
    }
    	if(flag){
    	return "YES";
    	}else{
    	return "NO";	
    	}
		
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = solve(a);
            System.out.println(result);
        }
    }
}
