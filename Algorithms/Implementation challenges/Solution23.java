package hacher_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution23 {

	
	static int gemstones(String[] arr) {
		String s;
		String clean = arr[0];
		ArrayList<Character> l = new ArrayList();
		TreeSet t = new TreeSet();
  for(int c= 0;c<clean.length();c++){
	     t.add(clean.charAt(c));  
  }
        l.addAll(t);
        
     
		int count = 0;
		int out = 0;
		for (int i = 0; i < l.size(); i++) {
			Character ch = l.get(i);
			count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].contains(ch.toString())) {
					count++;
				}
				if (count == arr.length) {
					out++;
				}
			}
		}
		return out;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] arr = new String[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.next();
		}
		int result = gemstones(arr);
		System.out.println(result);
	}
}
