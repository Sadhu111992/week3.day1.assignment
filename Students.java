package week3.day1.assignments;

public class Students {
	
	public void getStudentInfo(int ID)
	{
		System.out.println(ID);
	}
	
	public void getStudentInfo(int ID,String name)
	{
		System.out.println(+ID+ name);
	}
	
	public void getStudentInfo(String email,int contactNumber)
	{
		System.out.println(email +contactNumber);
	}
public static void main(String[] args) {
	
	Students obj = new Students();
	obj.getStudentInfo(10001);
	obj.getStudentInfo(10001,"Sadhana");
	obj.getStudentInfo("abc.gmail.com", 123456789);
}

}
