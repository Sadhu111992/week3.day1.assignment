package week3.day1.assignments;

public class Automation extends MultipleLanguage implements Language,TestTool {


		public void Java() {
			System.out.println("Java method got implemented");
			
		}

		public void Selenium() {
			// TODO Auto-generated method stub
			System.out.println("Selenium method got implemented");
		}

		@Override
		public void Ruby() {
			// TODO Auto-generated method stub
			System.out.println("Ruby method got implemented");
		}
		
		public static void main(String[] args) {
			Automation obj = new Automation();
			obj.Java();
			obj.Selenium();
			obj.Ruby();
			obj.python();

		}

	}
