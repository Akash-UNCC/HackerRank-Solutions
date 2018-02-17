import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class quickSort1partition {

    static int[] quickSort(int[] arr) {
    	
    	int i = 0;
    	int temp =0;
    	int piv = arr[0];
    	for(int j = 1;j<arr.length;j++){
    	 if(piv<arr[j]){
    		 
    	 }else{
    		i++;
    		temp = arr[i];
    		arr[i]=arr[j];
    		arr[j]= temp;
    	 }
    	}
            temp = arr[i];   	
    	    arr[i]=piv;
    	    arr[0]=temp;
		return arr;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = quickSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
