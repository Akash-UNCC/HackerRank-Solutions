package hacher_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution39 {

    static long repeatedString(String s, long n) {
        long count =0;
        for(int k=0;k<s.length();k++){
            if(s.charAt(k)=='a'){
                count++;
        }
        }
        long times = n/s.length();
        long rem =   n%s.length();
        count = count*times;
        for(int h=0;h<rem;h++){
            if(s.charAt(h)=='a'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long result = repeatedString(s, n);
        System.out.println(result);
        in.close();
    }
}
