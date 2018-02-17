package com;

import java.io.*;
import java.util.*;

public class Day10 {

    public static void main(String[] args) {
     
    	Scanner scanner = new Scanner(System.in);
    	int n = scanner.nextInt();
    	ArrayList<Integer> l = new ArrayList<Integer>();
    	int rem =0;
    	while(n!=0){
    		rem = n%2;
    		l.add(rem);
    		n=n/2;
    	}
        //System.out.println(l);
    	Collections.reverse(l);
    	TreeSet counter = new TreeSet();
    	int count =0;
    	for(int i=0;i<l.size();i++){
    		if(l.get(i)==1){
    			count++;
    		}else{
    			counter.add(count);
    			count = 0;
    		}
    	counter.add(count);
    	}
    	
    	System.out.println(counter.last());
    }
}