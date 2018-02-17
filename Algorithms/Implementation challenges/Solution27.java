package hacher_rank;

import java.io.*;

import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution27 {

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        int[] a = {1,-2,4,-5,1};
	    	int sum =0;
	        int count =0;
	        for(int i = 0;i<a.length;i++){
	            for(int j=i;j<a.length;j++){
	                sum =0;
	                for(int k=i;k<=j;k++){
	                    sum = sum + a[k];
	                }
	                if(sum<0){
	                    count++;
	                }
	            }
	        }
	        System.out.println(count);
	        
	    }
	}