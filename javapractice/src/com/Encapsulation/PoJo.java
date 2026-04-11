package com.Encapsulation;

public class PoJo {
	private static int StudentId;
	private String StudentName;
	private String StudentBranch;
	private int StudentAge;

//	PoJo(int Studentid,String StudentName, String StudentBranch, int StudentAge) {
//		this.StudentId=StudentId;
//		this.StudentName = StudentName;
//		this.StudentBranch = StudentBranch;
//		this.StudentAge = StudentAge;
//	}
	{
		StudentId++;
	}

	void SetStudentName(String StudentName) {
		this.StudentName = StudentName;

	}

	void SetStudentBranch(String StudentBranch) {
		this.StudentBranch = StudentBranch;

	}

	void SetStudentAge(int StudentAge) {
		this.StudentAge = StudentAge;

	}

	int getStudentId() {
		return StudentId;
	}

	String getStudentName() {
		return StudentName;
	}

	String getStudentBranch() {
		return StudentBranch;
	}

	int getStudentAge() {
		return StudentAge;
	}

	public static void main(String[] args) {
		PoJo t = new PoJo();
		
		t.SetStudentName("Aslesha");
		t.SetStudentBranch("EEE");
		t.SetStudentAge(24);
		System.out.println(t.getStudentId());
		System.out.println(t.getStudentName());
		System.out.println(t.getStudentBranch());
		System.out.println(t.getStudentAge());
		PoJo t1 = new PoJo();
		t1.SetStudentName("Anjani");
		t1.SetStudentBranch("EcE");
		t1.SetStudentAge(22);

		System.out.println(
				t1.StudentId + "\n" + t1.getStudentName() + "\n" + t1.getStudentBranch() + "\n" + t1.getStudentAge());
	}

}
