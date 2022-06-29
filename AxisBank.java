package week3.day1.assignments;

public class AxisBank extends BankInfo{
	
	public void deposit()
	{
		System.out.println("Axis bank - deposit");
	}
	
	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		obj.deposit(); //calling the method with child class instance 		
		obj.fixed();
		obj.saving();
		
	}

}

