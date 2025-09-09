package basics;

public class ConditionalStatements2 {

	public static void main(String[] args) {

		int i =22;

		switch(i) {
		case 1:
			System.out.println("this is first statement");
			break;

		case 2:
			System.out.println("this is second statement");
			break;

		case 3:
			System.out.println("this is third statement");
			break;
		default:
			System.err.println("the input is invalid");
			break;		
		}
	}

}
