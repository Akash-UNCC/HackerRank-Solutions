import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSortPart1 {

    
	
	static void insertionSort1(int n, int[] arr) {
      int i = n-2;
      int key = arr[n-1];
      while(i>=0 && key<arr[i]){
    	  arr[i+1]=arr[i];
    	  i--;
      for(int p=0;p<arr.length;p++){
    	  System.out.print(arr[p]+" ");
    	 
      }
      System.out.println();
      }
    	arr[i+1]=key;
        for(int p=0;p<arr.length;p++){
      	  System.out.print(arr[p]+" ");
      	 
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
