package hacher_rank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution10 {

    static String[] catAndMouse(int x, int y, int z) {
        
        String[] out = new String[1];
        
        int c1=0;
        int c2=0;
        
        if(z>x){
            c1 = z-x;
        }else{
            c1 = x-z;
        }
        
        if(z>y){
            c2 = z-y;
        }else{
            c2 = y-z;
        }
        
        if(c1==c2){
            out[0]= "Mouse C";
        }else if(c1<c2){
            out[0]= "Cat A";
        }else{
            out[0]= "Cat B";
        }
         return out;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            String[] result = catAndMouse(x, y, z);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
            }
            System.out.println("");


        }
        in.close();
    }
}