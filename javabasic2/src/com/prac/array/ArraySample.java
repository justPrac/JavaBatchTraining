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
	  
	  Scanner sc = new Scanner(System.in);
	  int cnt[] = new int[52];	
	  System.out.println("Enter the string ");
	  String str = sc.nextLine();
	  char ch[] = str.toCharArray();
	  
	  for(int i = 0; i < ch.length; i++) 
	  {
		  int position = 0;
		  if(ch[i] >= 65 && ch[i] <= 91)
			  position = ch[i]-65;
		  else if(ch[i] >= 98 && ch[i] <= 124)
			  position = ch[i]-98+26;
		  else
			  continue;
		  
		  cnt[position] = ++cnt[position];
	  }
	  
	  for(int i = 0; i < cnt.length; i++) 
	  {
		  char temp = ' ';
		  if(cnt[i]>0)
		  {
			  if(i <= 26)
				  temp = (char) (i + 65);
			  else
				  temp = (char) (i + 98-26);
			  
		     System.out.println( temp + " = " + cnt[i]);	 
		  } 
	  }
	  sc.close();
	}

}
