
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		Teacher butt = new Teacher();
		Student butt1 = new Student();
		int choice1;
		do{
			System.out.println("Enter the number of your role:\n"
				+ "1) Teacher \n"
				+ "2) Student");
			int choice=reader.nextInt();
			
			switch(choice) {
			case(1): butt.ActionTeacher();
			break;
			case(2): do {
				butt1.ActionStudent();
				System.out.println("Would you like to take another action? Enter 1 if yes, 0 if no.");
				int action=reader.nextInt();
			}while(choice==1);
			}
			System.out.println("Would you like to sign in as a different role? Enter 1 if yes, 0 if no.");
			choice1=reader.nextInt();
		}while(choice1==1);
		
		

	}

}
