package basics;

import accessModifiers.Student;

/**
 * 1.public :- access with in the class and package, out side the package
 * 
 * 2.private :- class cannot be a private and variable,constructor and methods be a private
 *            access with in the same class
 *            
 * 3.protected :- access with in the class and package and if inheritance is implemented other package is accessible 
 *               subclasses also accessible
 *               
 * 4.default(no modifier)(package-private) :-access with in the class and package
 * 
 */
public class AccessModifiers {
	public static void main(String[] args) {
		Student s = new Student();

		System.out.println(s.rollNo);
		s.printRollNumber();

	}	
}
