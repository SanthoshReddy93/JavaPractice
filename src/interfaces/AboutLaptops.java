package interfaces;
/**
 * An interface is a blueprint of a class
 * 
 *class is a implementor for interface
 * 
 * Defined or unimplemented methods are known as abstract methods
 * 
 * java 8 version :-
 * 
 * default :- override == 
 * 
 * Static :- it is public 
 */


public interface AboutLaptops {
   
	 public void copy();    //methods
	 
	 public void paste();
	 
	 public void cut();
	 
	 public void keyboard();
	 
	 default void security() {
		 System.out.println("pls implement");
	 }
	 
	 static void audio() {
		 System.out.println("pls Add audio");
	 }
	 
}
