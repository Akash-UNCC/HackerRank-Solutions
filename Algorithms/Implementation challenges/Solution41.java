package hacher_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution41 {

    static int[] serviceLane(int n, int[][] cases, int[] width) {
    	
    	int k=0;
    	//TreeSet<Integer> t = new TreeSet();
    	ArrayList<Integer> l= new ArrayList();
    	for(int i=0;i<cases.length;i++){
    		TreeSet<Integer> t = new TreeSet();
    		    int in = cases[i][0];
    			int out= cases[i][1];
    			for(int y=in;y<=out;y++){
    				t.add(width[y]);
    			}
    		l.add(t.first());
    	}
    	int[] output = new int[l.size()]; 
    	for(int g=0;g<l.size();g++){
    		output[g]=l.get(g);
    	}
		return output;
        
         
    	
    	   
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] width = new int[n];
        for(int width_i = 0; width_i < n; width_i++){
            width[width_i] = in.nextInt();
        }
        int[][] cases = new int[t][2];
        for(int cases_i = 0; cases_i < t; cases_i++){
            for(int cases_j = 0; cases_j < 2; cases_j++){
                cases[cases_i][cases_j] = in.nextInt();
            }
        }
        int[] result = serviceLane(n, cases, width);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
