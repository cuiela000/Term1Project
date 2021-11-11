package t1Project;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		Teacher butt = new Teacher(); //create instance of teacher class
		Student butt1 = new Student(); //create instance of student class
		butt1.setTeacher(butt); //call method to transfer instance to student class
		
		int action, role;
		do{
			System.out.println("Enter the number of your role:\n" //prompt to choose role
				+ "1) Teacher \n"
				+ "2) Student");
			int choice=reader.nextInt();
			
			switch(choice) {
			case(1): butt.ActionTeacher(); //chose teacher
			break;
			case(2): do { //chose student
				butt1.ActionStudent();
				System.out.println("Would you like to take another action? Enter 1 if yes, 0 if no.");
				action=reader.nextInt();
			}while(action==1); //call student method again if user wants to take another action
			}
			System.out.println("Would you like to sign in as a different role? Enter 1 if yes, 0 if no.");
			role=reader.nextInt();
		}while(role==1); //loop back to role select if user wants to use a different role
		
		

	}

}
