package hacher_rank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution38 {

    static int minimumDistances(int[] a) {
        int distance = Integer.MAX_VALUE;
        int d = 0;
        boolean flag = false;
        for(int i =0;i<a.length;i++){
             for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                  d = j-i;
                  flag = true;
                  break;
                }  
                }
            
            if(d<distance&&flag==true){
              distance = d;
            }
        }
        if(flag == true){
          return distance;  
        }else{
            return -1;
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = minimumDistances(a);
        System.out.println(result);
        in.close();
    }
}
