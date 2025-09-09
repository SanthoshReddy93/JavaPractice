package basics;

import java.util.Scanner;

/*
 * if , ifelse & nestedif , Switch
 * 
 * if(condition){
 *  --statements--
 }
 * else{
 * --statements--
 * }
 * 
 * write one condition under another condition is known as nested if
 * 
 * switch (key){
 *    case value:
 *     --statements--
 *     break;
 *   default:
 *   --statements--
 *     break;
 * 
 */
public class ConditionalStatements {

	public static void main(String[] args) {

		/*	int a = 6;
		if (a%2==0) {
		System.out.println("the given number is even");
		}
		else {
			System.out.println("the given number is odd"); 
	}
		 */

		Scanner scanner = new Scanner (System.in);

		System.out.println("What is your score"); 
		int X = scanner.nextInt();
		if (X > 36) {
			System.out.println("Exam pass");

			if (X  <= 70 &X>=37) {
				System.out.println("You passed in third class");
			}
			if	(X <= 85&X>=71) { 
				System.out.println("You passed in second class");
			}
			if (X <= 100 & X>=85) {
				System.out.println("You passed in first class");
			}
			else {
				System.out.println("Exam fail");
			}
		}}}

/*    if (X <= 70) {
		        System.out.println("You passed in third class");
		    } else if (X <= 85) {
		        System.out.println("You passed in second class");
		    } else if (X <= 100) {
		        System.out.println("You passed in first class");
		    } else {
		        System.out.println("Invalid marks");
		    }
		}}}

 */

