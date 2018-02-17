package hacher_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution43 {

    static int fairRations(int[] B){
       
      
        return 2;
        }

        //throw new ArithmeticException();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] B = new int[N];
        for(int B_i = 0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
        }
        int result = fairRations(B);
        System.out.println(result);
        in.close();
    }
}
