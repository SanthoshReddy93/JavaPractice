package basics;

public class Methods {


	/*
	 * Method :- A method is a block of code or collections of statements 
	 * grouped together to perform a certain task or operation and return 
	 *  the result to the caller if applicable.
	 * 
	 * 
	 *  AccessModifier + Static/NonStatic + returnType + MethodName (Parameters)Throws ExceptionList{ist
	 * 
	 * {
	 * 
	 * Method body
	 * 
	 * return type value;
	 * 
	 * }
	 * 
	 */

	static int currentBalance = 1000;

	public static void bank() {

	}
	
	public static void greetingCustomer() {
		System.out.println("Hello ,WelCome Santhosh");
	}

	public void deposit(int amount) {
		currentBalance = currentBalance + amount; 
		System.out.println("Amount deposited successfully");
	}
	
	public static void withdrawl(int amount) {
		currentBalance = currentBalance - amount;
		System.out.println("Amount withdrawl Successfully"); 
	}
	
	public  int getCurrentBalance() {
		return currentBalance;
		}
	
	public static void main(String[] args) {
		Methods method = new Methods();
		greetingCustomer();
		
		System.out.println("current balance is"+" "+method.getCurrentBalance());
		method.deposit(500); 
		System.out.println("current balance is"+" "+method.getCurrentBalance());
		
		withdrawl(1500);
		System.out.println("current balance is"+" "+method.getCurrentBalance());
		
		
	}

}
