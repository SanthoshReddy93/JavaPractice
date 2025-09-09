package basics;
/*
 * object is an instance of a class
 * 
 * 
 * 
 * 
 */
public class Object {
	int i;
	int j;
	public Object() {
		i = 10;
		j =10;
	}

	public Object(int i,int j) {
		this.i=i;
		this.j=j;	
	}

	public Object(int k) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Object t1 = new Object();
		Object t2 = new Object(10);
		Object t3 = new Object(20);

		//  System.out.println(t1.hashCode());
		//	System.out.println(t2.hashCode());
		//System.out.println(t3.hashCode());

		System.out.println(t1.add());
		System.out.println(t2.add());
		System.out.println(t3.add());
		System.out.println(t3.i);
		System.out.println(t3.j);
	}

	private char[] add() {
		
		return null;
	}

}
