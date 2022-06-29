package week3.day1.assignments;

public class Desktop extends Computer {
	public void deskTopSize()
	{
		System.out.println("14 inches screen");
	}
	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.computerModel();
		obj.deskTopSize();
	}

}
