package hacher_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution31 {

    static int jumpingOnClouds(int[] c, int k) {
        int count=0;
        int e =100;
        int[] c1 = new int[c.length+1];
        for(int i =0;i<c.length;i++){
        	c1[i]=c[i];
        }
        c1[c.length]=c[0];
        

        for(int i=k;i<c1.length;i+=k){
            if(c1[i]==0){
               e= e-1;
            }else{
               e= e-1-2; 
            }
            }
        
        return e;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for(int c_i = 0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c, k);
        System.out.println(result);
        in.close();
    }
}
