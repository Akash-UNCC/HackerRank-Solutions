package hacher_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution19 {

    static int introTutorial(int V, int[] arr) {
        
    	System.out.println("");
        int n = arr.length/2;
        int len = arr.length;
        
        while(V!=arr[n]){
            if(V<arr[n]){
               len = n;
               n = n/2;
            }else{
                n = (len + n)/2;
            }
        } 
        
        return n;

        
        
        
        
        
        
    }

    public static void main(String[] args) {

        int V=10;
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int result = introTutorial(V, arr);
        System.out.println(result);
       // in.close();
    }
}

