package com;

import java.io.*;
import java.util.*;


public class Day7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] brr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
            brr[n-i-1]=arr[i];
        }
        
        for(int i=0; i < n; i++){
            System.out.print(brr[i]+" ");
        }
        
        
        in.close();
    }
}