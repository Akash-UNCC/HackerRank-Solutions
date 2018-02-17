package com;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day11 {

 	private static int maxhourglass(int[][] arr) {
		int sum = 0;
		int cursor = 0;
		TreeSet<Integer>  max = new TreeSet<Integer>();
		for (int m = 0; m < 4; m++) {
			for (int n = 0; n < 4; n++) {
				cursor = 0;
				sum = 0;
				for (int i = m; i < m + 3; i++) {
					for (int j = n; j < n + 3; j++) {
						cursor++;
						if (cursor == 4 || cursor == 6) {

						} else {
							sum = sum + arr[i][j];
						}

					}
				}
				max.add(sum);
			}
		}

		return max.last();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		int maxsum = maxhourglass(arr);
        System.out.println(maxsum);
	}
}
