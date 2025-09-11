package basics;

import java.lang.invoke.VarHandle;
/**
 *Type Inference :- is a concept in which the compiler infers the
 *type of the variable using the value provided. 
 * 
 * -> This type inference is restricted to local variables.
 * -> This feature is introduced in java 10 version
 * 
 *  var keyword restrictions :-
 *  1.var can only be used in the local variables.
 *  2.var can't be used for only declaration purpose,instead
 *    it should be used along with initialization.
 *  3.when used with arrays,should not use the [] brackets
 *  4.var can't be used in In-line array initialiaztion input 
 *    specifying the datatype.
 */
public class LVTypeInference {

	public static void main(String[] args) {
	
		int i =20;
		String s1 = "Arjun";
				boolean b1 = true;
		
		long j =89;
		var sdd = "djjs";
		var hffk = "228888899";
System.out.println(sdd);
	}

}
