package com;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day16 {
 
	private static void convertor(String s) {
	    int i=0;
		try{
		i = Integer.parseInt(s);
        System.out.println(i);
	    }catch(NumberFormatException nfe){
	    System.out.println("Bad String");
	    }
	}
	
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String S = in.next();
        convertor(S);
    }


}