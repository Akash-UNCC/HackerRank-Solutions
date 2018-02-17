package hacher_rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution12 {

    static int designerPdfViewer(int[] h, String word) {
        LinkedHashMap<Character,Integer> map = new  LinkedHashMap<Character,Integer>();
        for(int i=0 ;i<h.length;i++){
        	
        	char  ch = (char) (97+i);
        	map.put(ch, h[i]);
        	
        }
    	int max=0;
        for(int i=0;i<word.length();i++){
        	
        	//map.get(word.charAt(i));
        	if(map.get(word.charAt(i))>max){
        	   max =map.get(word.charAt(i));
        	}
        }
    	
    	return max*word.length();
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i = 0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int result = designerPdfViewer(h, word);
        System.out.println(result);
        in.close();
    }
}
