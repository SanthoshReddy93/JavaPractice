package inheritance;

public class Admin3 extends Developer2 {

	
	public 	void manage() {
		System.out.println("Manage code");
	read();	//it will access from same class 
	super.read();//it access from developer(parent class) 
	}
public void read() {
	System.out.println("admin read code");
}
}
