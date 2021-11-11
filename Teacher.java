package t1Project;

 import java.util.Scanner;

public class Teacher {
	private int[] studentID = new int[10]; //array for the student's ID numbers		
	private int[] attendance = new int[10]; //array for the student's attendance
	public int[] grades = new int[10]; //array for the student's grades
	private int IDnumber, action, answer; // declare other variables
	Scanner reader = new Scanner(System.in);
	
	public Teacher()
	{
		this.IDnumber = 0; //constructor
	}
	public void ActionTeacher() //method for the actions of what the teacher can do
	{
		System.out.println("Please enter the corresponding number to the action you would like to take:\n"
				+ "0 = take attendance,\n"
				+ "1 = assign grades");
		this.action = reader.nextInt();
		if (this.action == 0) //if statement for when the user wants to take attendance
		{
			while (this.answer == 0) //while loop for taking attendance when attendance is wanted 
			{
				attendance(); //calls attendance method
				System.out.println("Would you like to take attendance for another student? (0 = yes, 1 = no)"); 
				this.answer = reader.nextInt(); //sets this.answer to 0 or 1 so it can go through the loop again or not
				if (this.answer == 1) //if statement for after attendance isn't wanted anymore
				{
					System.out.println("Would you like to take another action? (0 = yes, 1 = no)");
					this.action = reader.nextInt(); //sets this.action to 0 or 1 so it can establish if the user wants to take another action
					this.answer = 0; //reset this.answer
					if (this.action > 1) //if statement when this.action is not 0 or 1, error occurs
					{
						Incorrect();
						ActionTeacher();
					}
					if (this.action == 0) //if statement for when this.action is 0, to call ActionTeacher method again to restart entire method
					{
						ActionTeacher();
					}	
					if (this.action == 1) //if statement to end entire program
					{	
						return;
					}
					
				}
			}				

		}
		if (this.action == 1) //if statement for when the user wants to assign grades
		{
			while (this.answer == 0 ) //while loop for when additional grades are wanted to be added
			{
				AssignGrades(); //call method AssignGrades
				System.out.println("Would you like to assign a grade for another student? (0 = yes, 1 = no)");
				this.answer = reader.nextInt(); //sets this.answer to 0 or 1, so to loop or go onto the next loop
				if (this.answer == 1) //if for when the user doesn't want to assign more grades and take another action
				{
					System.out.println("Would you like to take another action? (0 = yes, 1 = no)");
					this.action = reader.nextInt(); //sets this.action to 0 or 1 to be used to establish if the user wants to take another action
					this.answer = 0; //reset this.answer
					if (this.action > 1) //if statement for when this.action is not 0 or 1, error occurs
					{
						Incorrect();
						ActionTeacher();
					}
					if (this.action == 0) //if statement for if the user wants to take another action
					{
						ActionTeacher(); //call ActionTeacher method again
					}	
					if (this.action == 1) //if statement that ends entire program
					{
						return;
					}
					
				}
				
			}	
		}
		if (this.action != 1 || this.action !=0) //if statement for when not taking either actions
		{
			Incorrect();
			ActionTeacher();
		}
	}
	public void attendance() //attendance method
	{
		System.out.println("Please enter the student ID of the corresponding student you would like to update attendance for:");
		this.IDnumber = reader.nextInt(); //sets the ID number wanted
		if (this.IDnumber > 9) //error statement for if invalid ID entered
		{
			Incorrect();
			attendance();
		}
		else {
			System.out.println("Is student " + this.IDnumber + " present, absent, or tardy (enter 0 for present, 1 for absent, and 2 for tardy)");
			this.attendance[IDnumber] = reader.nextInt(); //sets parallel array for the selected ID number slot to be present, absent, or tardy
			if (this.attendance[IDnumber] == 0) //if statement for output
			{
				System.out.println("Student " + this.IDnumber + " has been updated to present.");
			}
			if (this.attendance[IDnumber] == 1)//if statement for output
			{
				System.out.println("Student " + this.IDnumber + " has been updated to absent.");
			}
			if (this.attendance[IDnumber] == 2)//if statement for output
			{
				System.out.println("Student " + this.IDnumber + " has been updated to tardy.");
			}
			if (this.attendance[IDnumber] > 2) //if for when 0-2 isn't entered, makes user renter
			{
				Incorrect();
				attendance();
			}
		}
	}
	public void AssignGrades() //AssignGrades method
	{
		System.out.println("Please enter the student ID of the corresponding student you would like to update grades for:");
		this.IDnumber = reader.nextInt(); //sets the ID number wanted
		if (this.IDnumber > 9) //error statement for if invalid ID entered
		{
			Incorrect();
			AssignGrades();
		}
		else
		{
			System.out.println("What grade did student " + this.IDnumber + " earn this term? (A = 1, B = 2, C = 3, D = 4, F = 5)");
			this.grades[this.IDnumber] = reader.nextInt(); //sets parallel array for the selected ID number to determine the grade
			
			if (this.grades[IDnumber] == 1) //if statement for output
			{
				System.out.println("Student " + this.IDnumber + "'s grade has been updated to an A.");
			}
			if (this.grades[IDnumber] == 2) //if statement for output
			{
				System.out.println("Student " + this.IDnumber + "'s grade has been updated to a B.");
			}
			if (this.grades[IDnumber] == 3) //if statement for output
			{
				System.out.println("Student " + this.IDnumber + "'s grade has been updated to a C.");
			}
			if (this.grades[IDnumber] == 4) //if statement for output
			{
				System.out.println("Student " + this.IDnumber + "'s grade has been updated to a D.");
			}
			if (this.grades[IDnumber] == 5) //if statement for output
			{
				System.out.println("Student " + this.IDnumber + "'s grade has been updated to a F.");
			}
			if (this.grades[IDnumber] > 5) //else for when 1-4 isn't enter, requires user to renter
			{
				Incorrect(); //call incorrect method
				AssignGrades(); //call method to renter
			}
		}
		
	}
	public void Incorrect()
	{
		System.out.println("Sorry, this number does not correspond to an action. Please reenter.");
	}

}

