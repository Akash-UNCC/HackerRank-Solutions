package hacher_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution36 {

    static int jumpingOnClouds(int[] c) {
        // Complete this function
    	int steps = 0;
    	int i=0;
    	for(i=0;i<c.length-2;i++){
    		if(c[i+2]==0){
    			steps = steps+1;
    			i=i+1;
    		}else{
    			steps = steps+1;
    		}
    	}if(i<c.length-1){
    		steps = steps + 1;
    	}
    	
    	
    	return steps;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] c = new int[n];
        for(int c_i = 0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c);
        System.out.println(result);
        in.close();
    }
}
