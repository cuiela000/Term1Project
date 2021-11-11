import java.util.Scanner;

public class Student {

	private int id;
	Teacher mc=new Teacher();
	Scanner reader=new Scanner(System.in);
	
	public void ActionStudent() {
		System.out.println("Please enter the corresponding number to the action you would like to take:\n"
				+ "0 = Schedule a class,\n"
				+ "1 = Check grades");
		int choice;
		choice=reader.nextInt();
		switch(choice) {
			case(0): schedule();
			break;
			case(1): CheckGrades();
			break;
			default: Incorrect();
			break;
			} //use loop in main, prompt, if enter 1 then call actionstudent again

	}
	
	public void schedule() {
		System.out.println("Please enter your student ID number.");
		id=reader.nextInt();
		
		System.out.println("Enter the number out of the menu of the class that you woud like to take:\n"
				+ "1) Math \n"
				+ "2) Science \n"
				+ "3) History \n"
				+ "4) English \n"
				+ "5) Gym");
		int choice=reader.nextInt();
		
		System.out.println("Enter what block you would like to take that class (1-4).");
		int block=reader.nextInt();
		if ((block<1)||(block>4)) {
			Incorrect();
		}
		
		switch(choice) {
		case(1): System.out.print("Math");
		break;
		case(2): System.out.print("Science");
		break;
		case(3): System.out.print("History");
		break;
		case(4): System.out.print("English");
		break;
		case(5): System.out.print("Gym");
		break;
		default: Incorrect();
		break;
		}
		System.out.println(" has been successfully added as your block "+block+" class.");
	}

	public void CheckGrades() {
		System.out.println("Please enter your student ID number.");
		id=reader.nextInt();
		switch(mc.grades[id]) {
			case(1): System.out.println("A.");
			break;
			case(2): System.out.println("B.");
			break;
			case(3): System.out.println("C.");
			break;
			case(4): System.out.println("D.");
			break;
			case(5): System.out.println("F.");
			break;
			case(0): System.out.println("Your teacher has not entered in a grade yet.");
		}
	}
		
	public void Incorrect() {
		System.out.println("Sorry, this number does not correspond to an action. Please reenter.");
	}
}
