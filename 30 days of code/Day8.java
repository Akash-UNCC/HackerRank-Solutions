package com;

import java.util.*;
import java.io.*;

public class Day8{
	
  public static void main(String []argh){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      LinkedHashMap map = new LinkedHashMap();
      for(int i = 0; i < n; i++){
          String name = in.next();
          int phone = in.nextInt();
           map.put(name, phone);
      }
      //System.out.println(map);
      while(in.hasNext()){
          String s = in.next();
          if(map.containsKey(s)){
          System.out.println(s+"="+map.get(s));
          }else{
        	  System.out.println("Not found");  
          }
      }
      //System.out.println(s);
      in.close();
  }
}
