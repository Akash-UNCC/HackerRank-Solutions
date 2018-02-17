import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSortPart2 {

    
	
	static void insertionSort1(int n, int[] arr) {
      for(int j=1;j<n;j++){
      	  
      int i = j-1;
      int key = arr[j];
      while(i>=0 && key<arr[i]){
    	  arr[i+1]=arr[i];
    	  i--;
          }
    	 arr[i+1]=key;
          for(int c=0;c<n;c++){
       	  System.out.print(arr[c]+" ");
          }
         System.out.println();
        }
      

        }
    	
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort1(n, arr);
        in.close();
    }
}
