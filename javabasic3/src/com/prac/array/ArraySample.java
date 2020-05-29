package com.prac.array;

import java.util.Scanner;

public class ArraySample {
	
	public static void main(String []arg){
	 /*
	  * Maanish
	  * M->1
	  * a->2
	  * ....
	  */
		
	  int cnt[] = new int[26];	
	  System.out.println("Enter the string ");
	  Scanner sc = new Scanner(System.in);
	  String str = sc.nextLine();
	  
	  char ch[] = str.toCharArray();
	  
	  for (int i = 0; i < ch.length; i++) {
		 
		  int position = ch[i]-65;
		  cnt[position] = ++cnt[position];
		//System.out.println("charater is " + position);
	}
	  
	  for (int i = 0; i < cnt.length; i++) {
		  
		  if(cnt[i]>0){
			  char temp = (char) (i + 65);
		    System.out.println( temp + " = " + cnt[i]);	 
		  } 
	  }
	}

}
