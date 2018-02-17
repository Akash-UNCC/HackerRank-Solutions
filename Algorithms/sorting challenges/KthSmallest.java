import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class KthSmallest {



	    
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
		
	    private static int quickSort(int[] arr,int low,int high,int k) {
			       if(k>0 && k<=high-low+1){ 
	    	       int pi = partion(arr,low,high);
	    	       if(k-1==pi-low){
	    	       return arr[k-1];  
	    	       }
	    	       if(k-1<pi-low){
	    	       return quickSort(arr,low,pi-1,k);  
	    	       }
	    	       return quickSort(arr, pi+1, high, k-pi+low-1);
	    	       
	    	       
	    	       
	    	       
			       }
				return Integer.MAX_VALUE;
		}
		         


		static int smallestKthNumber(int[] arr,int k) {
	    	return quickSort(arr,0,arr.length-1,k);
	}



		public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int[] arr = new int[n];
	        for(int arr_i = 0; arr_i < n; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }
	        int result = smallestKthNumber(arr,k);
	       
	        System.out.println(result);


	        in.close();
	    }
	}

	
