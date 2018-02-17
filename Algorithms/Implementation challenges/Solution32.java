package hacher_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution32 {

    static int findDigits(int n) {
        int count=0;
        int d=0;
        d=n%10;
        int n1 =n;
        while(n>0){
        try{	
        if(n1%d==0){
          count++;  
        }
        }catch(Exception e){
        	
        }
        n= n/10;
        d= n%10;    
    }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int result = findDigits(n);
            System.out.println(result);
        }
        in.close();
    }
}
