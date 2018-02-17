package hacher_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution28 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
       int n = sc.nextInt(); 
       String[] a = new String[n]; 
       for(int i= 0;i<n;i++){
          a[i]=sc.nextLine();
       }
       //System.out.println(a.toString());
       int q =sc.nextInt(); 
      // String[] qu = new String[q];
       TreeSet t = new TreeSet();
       for(int i= 0;i<q;i++){
    	   String temp=sc.nextLine();
           t.add(temp);
       } 
       
        
       ArrayList<String> ql = new ArrayList<String>();
       ql.addAll(t);
     
       //System.out.println("t="+t);    
       // System.out.println(ql);   
       ArrayList<Integer> l = new ArrayList<Integer>();
        int count=0;
       for(int i=0;i<ql.size();i++){
           count =0;
           for(int j=0;j<n;j++){
               
               if(ql.get(i).equals(a[j])){
                count++;   
               }
               
           }
          l.add(count); 
       } 
      for(int i= 0;i<l.size();i++){
          System.out.println((int)l.get(i));
      }  
        
    }
}