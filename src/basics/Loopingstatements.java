package basics;
/*
 * Looping statements are the statements that execute one or more statement
 * repeatedly several number of times.
 * 
 * types:-
 *  
 * 1. while :-
 *  while (condition){
 *  statements
 *  }
 *  
 * 2.do-while :-
 *  do {
 *  statements
 *  }while(condition); 
 *  
 *  3.for
 *  for(initialisation;condition;updation){
 *  statement
 *  }
 *  
 *  
 *  4.for each/extended for loop
 *  
 */
public class Loopingstatements {

	public static void main(String[] args) {
		int i =0;
		while (i<5) {
			System.out.println(i);
			i++;
			
		}
		
		do {
			System.out.println(i);
			i++;
		}
		while(i<0);
		
	//}
	//for(int value :arr) {      //foreach loop
		//System.out.println(value);
	}
	
	}
