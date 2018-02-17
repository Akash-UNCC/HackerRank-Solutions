package com;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

    Difference(int elements[]){
        this.elements = elements;
    }    
    void computeDifference(){
    ArrayList<Integer> list = new ArrayList<Integer>();     
        for(int i=0;i<elements.length;i++){
            list.add(elements[i]);
     }
    Collections.sort(list);
    maximumDifference =list.get(list.size()-1)- list.get(0);

    }
    
} // End of Difference class

public class Day14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}