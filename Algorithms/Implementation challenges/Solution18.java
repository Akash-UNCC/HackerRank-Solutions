package hacher_rank;

import java.util.Scanner;

public class Solution18 {

    static long flippingBits(long  N) {
        
    	  System.out.println(N);
           long  flip =~N; 
          System.out.println(flip);
    	 
          
          
    	  return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = 1;
        for(int a0 = 0; a0 < T; a0++){
            long N = in.nextLong();
            long result = flippingBits(N);
            System.out.println(result);
        }
        in.close();
    }
}
