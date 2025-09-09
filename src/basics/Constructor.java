package basics;
/*
 * -> A constructor is a block of codes similar to the method. 
 *    It is called when an instance(object) of the class is created.
 * 
 * () = paranthathis
 */

public class Constructor {
public int i;
	public static void main(String[] args) {

		Constructor cp = new Constructor();
		System.out.println(cp.i);
	}

	public Constructor() {

i = 20;
System.out.println("constructor is called");
	}
	public Constructor(int a) { 
	i = a; 	
		 
	}
}