
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountingSort1 {

    static int[] countingSort(int[] arr) {
    LinkedHashMap<Integer,Integer> map = new LinkedHashMap();	
    for(int i=0;i<arr.length;i++){
    	if(map.containsKey(arr[i])){
    		map.put(arr[i], map.get(arr[i])+1);
    	}else{
    		map.put(arr[i], 1);
    	}
    }
    int[] out = new int[100];
    for(int i=0;i<100;i++){
    	if(map.containsKey(i)){
    		out[i]=map.get(i);
    	}else{
    		out[i] =0;
    	}
    }
    	
		return out;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = countingSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
