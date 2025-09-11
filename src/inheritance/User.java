package inheritance;

public class User {

	public static void main(String[] args) {
		
		Guest1 guest =new Guest1();
		guest.read();
		
		
		Admin3 admin = new Admin3();
		admin.write();
		admin.manage();
		admin.read();
	}

}
