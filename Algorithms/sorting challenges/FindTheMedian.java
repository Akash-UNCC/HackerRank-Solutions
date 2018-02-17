import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindTheMedian {

	public static int partion(int[] arr,int low,int high) {
		
		int pivot = arr[high];
		int i=low-1;
		for (int j=low;j<high;j++) { 

		if(pivot<arr[j]){
			
		}else{
			i++;
			int temp = arr[j];
			arr[j]= arr[i];
			arr[i]= temp;
			
		}

		}
		i++;   	    
		int temp=arr[i];
		arr[i]=pivot;
		arr[high]=temp;
		return i;
		
	}
	
    private static void quickSort(int[] arr,int low,int high) {
		       if(low<high){
    	       int pi = partion(arr,low,high);
    	       quickSort(arr,low,pi-1);
    	       quickSort(arr, pi+1, high);
		       }
	}
	
	
	
    static int findMedian(int[] arr) {
    	
    	quickSort(arr,0,arr.length-1);
        return arr[((arr.length+1)/2)-1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = findMedian(arr);
        System.out.println(result);
        in.close();
    }
}
