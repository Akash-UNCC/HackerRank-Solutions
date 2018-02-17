package hacher_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution20 {

    static int flatlandSpaceStations(int n, int[] c) {
        int dist = 0; 
        ArrayList  l= new ArrayList();
        for(int i=0;i<n;i++){
            int near =Integer.MAX_VALUE;
            
            for(int j=0;j<c.length;j++){
               dist = i-c[j];
               if(dist>=0){
 
               }else{
                 dist = -1*dist;  
               }
               
               
          if(near>dist){
                near = dist;  
               }
            }

             
            l.add(near);
            
            
            
        }
        
        Collections.sort(l);
        return (int)l.get(l.size()-1);
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] c = new int[m];
        for(int c_i = 0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }
        int result = flatlandSpaceStations(n, c);
        System.out.println(result);
        in.close();
    }
}
