package hacher_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution42 {

	static int beautifulTriplets(int d, int[] arr) {
		int a = 0;
		int b = 0;
		int count = 0;
		boolean one= false;
		boolean two= false;
		for (int i = 0; i < arr.length; i++) {
			int first = arr[i] + d;
			int sec = arr[i] + 2 * d;
			//System.out.println("fir " +first+" , "+"sec "+sec);
			 one =false;
			 two =false;
			for (int j = i + 1; j < arr.length; j++) {
				
				if (arr[j] == first) {
					a = j;
					one = true;
				}
				if (arr[j] == sec) {
					b = j;
					two = true;
				}
			}
			if (a < b && one && two) {
				//System.out.println(arr[i] + ", " + arr[a]+ " , "+arr[b]);
				count++;
			}

		}
	
	return count;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		int result = beautifulTriplets(d, arr);
		System.out.println(result);
		in.close();
	}
}

/*
 * 7 3 1 2 4 5 7 8 10
 */