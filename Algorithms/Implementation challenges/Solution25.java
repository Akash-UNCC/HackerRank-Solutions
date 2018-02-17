package hacher_rank;

import java.io.*;
import java.util.*;

public class Solution25 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int div = x/y;
        System.out.println(div);
        }catch(InputMismatchException me){
        System.out.println("java.util.InputMismatchException");
        }catch(ArithmeticException ae){
        System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}