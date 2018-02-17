package hacher_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution14 {

    static int beautifulDays(int i, int j, int k) {
        String tempr = null;
       // int rev = 0;
        int diff;
        int count =0;
        for(int n = i; n <= j; n++){
        	
        	int rev = 0;
        	int p=n;
            while(p>0){
            	int r = p%10;
            	rev = rev *10 +r;
            	p = p/10;
            }
        	
            if(rev>n){
            	diff = rev - n;
            }else{
            	diff = n - rev;
            }
            
            if(diff%k==0){
            	count++;
            }
            
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
    }
}
