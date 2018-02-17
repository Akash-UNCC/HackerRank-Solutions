package hacher_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution29 {

	static String encryption(String s) {
		String out = null;
		String temp;
		int c = (int) Math.ceil(Math.sqrt(s.length()));
		int r = 3;
		// int c=4;
		int i = 0;
		ArrayList<String> l = new ArrayList<String>();
		try {
			for (i = 0; i < s.length(); i += c) {
				l.add(s.substring(i, i + c));
				//System.out.println(temp);
			}
		} catch (Exception e) {
			l.add(s.substring(i, s.length()));
			// System.out.println(temp);
		}

		//System.out.println(l);
		StringBuffer sb = new StringBuffer();
		     
            for(int index=0;index<c;index++){
            	 try{
            	 for (int k = 0; k < l.size(); k++) {
            	 sb.append(l.get(k).charAt(index)); 
                 }
                 sb.append(" ");
            	 }catch(Exception e){
            	 sb.append(" ");
             }
		 

		
	}
            return sb.toString();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = encryption(s);
		System.out.println(result);
		in.close();
	}
}
