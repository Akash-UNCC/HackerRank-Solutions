package com;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day6 {

    static void method(String s){
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                sb1.append(s.charAt(i));
            }else{
                sb2.append(s.charAt(i));
            }
        }
        
        System.out.println(sb1.toString()+" "+sb2.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
          String s= sc.next();
          method(s);  
        }
    }
}