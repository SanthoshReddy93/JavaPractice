package encapsulation;

public class Student {
	private int rollNumber;
	private String name;
	private boolean isAttended;

	public Student(int rollNumber) {
		this.rollNumber = rollNumber;

		//String attendance = "present";
	}
	
	public void setStudentAtendance(boolean flag) {
		isAttended = flag;
		System.out.println("Teacher assigned attendance to student");
	}	
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public boolean getStudetAttendace() {
		System.out.println("Teacher accessed student attendance");
		return isAttended;
	}

}
