package hacher_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution30 {

    static int pickingNumbers(int[] a) {
        int d=0;
        int count;
        int out=0;
        ArrayList l= new ArrayList();
        for(int i=0;i<a.length;i++){
            count =0;
            for(int j=0;j<a.length;j++){
               d =  a[i]-a[j];
              if(d>-2&&d<2){
                  count++;
              }  
            }
             l.add(count);
            
        }
        Collections.sort(l);
        return (int)l.get(l.size()-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = pickingNumbers(a);
        System.out.println(result);
        in.close();
    }
}
