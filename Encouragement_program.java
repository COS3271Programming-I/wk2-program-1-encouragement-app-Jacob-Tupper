package encouragement_APP;
//Jacob Tupper
//Week 2-Program 1-Encouragement App

//importing a scanner
import java.util.Scanner;

public class Encouragement_program {
	//Defining a new scanner/function
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		//Creating string variables
		String First_Name, Middle_Name, Last_Name;
		
		//Sending messages to user to collect information from user
		System.out.println("Enter First Name: ");
		First_Name = userinput.nextLine();
		
		System.out.println("Enter Middle Name: ");
		Middle_Name = userinput.nextLine();
		
		System.out.println("Enter Last Name: ");
		Last_Name = userinput.nextLine();
		
		//Printing the information from user and using unicode 32 to send a heart
		System.out.println("You got this "+ First_Name +" "+ Middle_Name +" "+ Last_Name + ", I love your hat!\u2665");
	}
}
