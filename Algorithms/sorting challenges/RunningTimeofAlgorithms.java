import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RunningTimeofAlgorithms {

    
	
	static int runningTime(int[] arr) { 
        int counter=0;
		for(int j=1;j<arr.length;j++){
      	  
      int i = j-1;
      int key = arr[j];
      while(i>=0 && key<arr[i]){
    	  arr[i+1]=arr[i];
    	  counter++;
    	  i--;
          }
    	 arr[i+1]=key;
 /*         for(int c=0;c<arr.length;c++){
       	  System.out.print(arr[c]+" ");
          }*/
        // System.out.println();
        }
		return counter;
      

        }
    	
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = runningTime(arr);
        System.out.println(result);
        in.close();
    }
}
