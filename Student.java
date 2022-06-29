	package week3.day1.assignments;

public class Student extends Department{
	public void studentName()
	{
		System.out.println("Sadhana");
	}
	public void studentDept()
	{
		System.out.println("Computer Science");
	}
	public void studentID()
		{
			System.out.println("ID is 100520");
		}	

	public static void main(String[] args) {
		Student obj = new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.departmentName();
		obj.studentDept();
		obj.studentName();
		obj.studentID();
	}
}
