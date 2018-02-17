package hacher_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution33 {

    static void extraLongFactorials(int n) {
        long fact =1;
        for(int i=n;i>0;i--){
        fact=fact*i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        extraLongFactorials(n);
        in.close();
    }
}
