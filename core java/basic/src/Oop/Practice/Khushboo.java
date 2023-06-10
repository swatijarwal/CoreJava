package Oop.Practice;

public class Khushboo implements Neet {
	private String Studentname; ;
	private String student;



	@Override
	public void CoachingName() {
		System.out.println("Akash");
		
	}

	@Override
	public void StudentId() {
		System.out.println(101);
		
	}

	@Override
	public void address() {
		System.out.println("geetaBhawan");
		
	}

	 public void setStudentname(String studentname) {
		Studentname = studentname;
	}
	 public String getStudentname() {
		return Studentname;
	}
	 public void setStudent(String student) {
		this.student = student;
	}
	 public String getStudent() {
		return student;
	}

}
