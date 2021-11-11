package t1Project;

import java.util.Scanner;

public class Student {

	private int id;
	Teacher mc;
	Scanner reader=new Scanner(System.in);
	
	public void setTeacher(Teacher butt) { //transfers instance of butt to this class
		mc=butt;
	}
	
	public void ActionStudent() { //calls method that user wishes to go to
		System.out.println("Please enter the corresponding number to the action you would like to take:\n" //prompt
				+ "0 = Schedule a class,\n"
				+ "1 = Check grades");
		int choice;
		choice=reader.nextInt();
		switch(choice) {
			case(0): schedule(); //call schedule method
			break;
			case(1): CheckGrades(); //call check grades method
			break;
			default: Incorrect(); //call error method
			break;
			} 
	}
	
	public void schedule() { //allows student to schedule a class
		System.out.println("Please enter your student ID number.");
		id=reader.nextInt();
		
		System.out.println("Enter the number out of the menu of the class that you woud like to take:\n" //prompt
				+ "1) Math \n"
				+ "2) Science \n"
				+ "3) History \n"
				+ "4) English \n"
				+ "5) Gym");
		int choice=reader.nextInt();
		
		System.out.println("Enter what block you would like to take that class (1-4).");
		int block=reader.nextInt();
		if ((block<1)||(block>4)) { //error
			Incorrect();
		}
		
		switch(choice) { //prints out message based on class and block entered
		case(1): System.out.print("Math has been successfully added as your block "+block+" class.");
		break;
		case(2): System.out.print("Science has been successfully added as your block "+block+" class.");
		break;
		case(3): System.out.print("History has been successfully added as your block "+block+" class.");
		break;
		case(4): System.out.print("English has been successfully added as your block "+block+" class.");
		break;
		case(5): System.out.print("Gym has been successfully added as your block "+block+" class.");
		break;
		default: Incorrect();
		break;
		}
		
	}

	public void CheckGrades() { //prints out grade for student
		System.out.println("Please enter your student ID number.");
		id=reader.nextInt();
		if (id>9) { //error
			Incorrect();
		}
		switch(mc.grades[id]) { //uses value entered in the butt instance
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
		
	public void Incorrect() { //error message
		System.out.println("Sorry, this number does not correspond to an action. Please reenter.");
	}
}
