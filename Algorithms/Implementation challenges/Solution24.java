package hacher_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution24 {

    static int alternatingCharacters(String s){
    boolean flag = true;
    int del =0;
    while(flag){
    for(int i=0;i<s.length()-1;i++){
               flag = false;
    	if(s.charAt(i)==s.charAt(i+1)){
    		   flag = true;
    		   del++;
    		for(int j=i+1;j<s.length()-1;j++){
    			s.replace(s.charAt(j), s.charAt(j+1));
    		}
    		s= s.substring(0, s.length()-2);
    	}
    }
    }
    
    return del;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
    }
}