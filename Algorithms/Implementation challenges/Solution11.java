package hacher_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution11 {

    static int hurdleRace(int k, int[] height) {
        int drink = 0;
        int max = 0;
        ArrayList l = new ArrayList();
        for(int i = 0; i < height.length; i++){
           
            l.add(height[i]);
            
        }
        Collections.sort(l);
        max = (int)l.get(l.size()-1);
        if(max>k){    
        return max-k;
        }else{
        return 0;  
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i = 0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        int result = hurdleRace(k, height);
        System.out.println(result);
        in.close();
    }
}