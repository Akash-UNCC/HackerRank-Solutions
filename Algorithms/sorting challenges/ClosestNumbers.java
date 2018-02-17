import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ClosestNumbers {

    
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
	


	static int[] closestNumbers(int[] arr) {
        
        int min = Integer.MAX_VALUE;
        quickSort(arr,0,arr.length-1);
    	for(int i=0;i<arr.length-1;i++){
            int diff = arr[i+1]-arr[i];
            if(diff<min){
                min = diff;
            }  
          }
    	
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	for(int i=0;i<arr.length-1;i++){
            int diff = arr[i+1]-arr[i];
            if(diff==min){
            list.add(arr[i]);
            list.add(arr[i+1]);
            }  
          }
        
    	int[] output = new int[list.size()];
    	for(int i=0;i<list.size();i++){
    		output[i]=list.get(i);
    	}
    	return output;
}



	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = closestNumbers(arr);
        for (int i = 0; i < result.length; i++) {
           System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
