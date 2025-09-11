package basics;

import java.util.Iterator;

/**
 *  Array is a container which can hold multiple values 
 *  of a single type
 * to store multiple values
 * 
 *Types :- 
 *   1. Single Dimension Array :- only the x axis 
 *   2. Multi Dimension Array  
 *   3.jagged array
 * 
 * 
 *  to define array in two types:- int[] arr = new int[x];/ int[] arr =new {x,y};
 */
public class SingleDimensionalArray {

	public static void main(String[] args) {

		//int [] i;
		int j[] = new int[6];   //object

      j[0] =4;
      j[5] =8;
      j[3] =5;
      

//for(int i=0;i<j.length;i++) {
//	System.out.println(j[i]);
//	int sum = j[0] + j[5] + j[3];
//	System.out.println(sum);
      int i=0;
      while(i<j.length){
    	  System.out.println(j[i]);
    	  i++;
      }
} 
	}



