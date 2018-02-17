package hacher_rank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

	
    static int getTotalX(int[] a, int[] b) {
    	
        // int []a = {16,32,96};
        //int  []b = {2,4};
    	ArrayList<Integer> l1 = new ArrayList<Integer>();
    	ArrayList<Integer> l2 = new ArrayList<Integer>();
    	
    	for(int a1 : a){
    	//System.out.println(a1);
    		l1.add(a1);
    	}
    	Collections.sort(l1);
    	
    	int lim = (int)l1.get(0);
    	int count;
    	for(int i=1;i <= lim;i++){
    		count =0;
    		for(int j=0; j< l1.size();j++){
    			if(l1.get(j)%i==0){
    				count++;
    			 }
    		}
    		if(count==l1.size()){
    			l2.add(i);
    		}
    	}
    	
    	
    	
    	TreeSet t = new TreeSet();
    	t.addAll(l2);
    	//System.out.println(t);
    	l1.clear();
    	l1.addAll(t);
    	
    	System.out.println(" l1 = "+ l1 );
    	
    	
    	ArrayList finlist = new ArrayList();
    	
    	for(int i=0;i<l1.size();i++){
    		//System.out.println(l1.get(i));
    		int count1 =0;
    		for(int j=0 ;j< b.length;j++){
    			//System.out.println(b[j]);
    			if(l1.get(i)%b[j]==0){
    				count1++;
    			}
    		}if(count1==b.length){
    			finlist.add(l1.get(i));
    			//System.out.println("finlist--"+finlist);
    		}
    		
    	}
    	
    	//System.out.println("finlist = "+finlist);
    	return finlist.size();
    	//}
    	
    	
    	
    	
    	
    	
    	
    	
    	//System.out.println(l2);
    	
    //	System.out.println(l1);
 
    	
    	
    	
		//return 0;
        // Complete this function
        
         
    	
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a,b);
        System.out.println(total);
      //  in.close();
    }
}