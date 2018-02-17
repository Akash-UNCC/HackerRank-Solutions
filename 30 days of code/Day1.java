package com;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1 {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int i1 = scan.nextInt();
        //String s1 = scan.next();
        double d1 = scan.nextDouble();
        String s1 = scan.next();
        s1=s1+scan.nextLine();
        System.out.println(i+i1);
        System.out.println(d+d1);
        System.out.println(s+""+s1);
      /* Read and save an integer, double, and String to your variables.*/
      // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

      /* Print the sum of both integer variables on a new line. */

      /* Print the sum of the double variables on a new line. */
		
      /* Concatenate and print the String variables on a new line; 
      	the 's' variable above should be printed first. */
        scan.close();
    }
}