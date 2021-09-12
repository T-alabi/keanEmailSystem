
import java.util.Scanner; 

public class EmailRegSystem {
	
	public static void main(String[] args) { // this is the main method that calls all of our written methods, and allows 
		 									// for user input, as well as prints the result of our code
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first name: ");
		String fname = scan.nextLine();
		
		System.out.println("Enter last name: ");
		String lname = scan.nextLine();

		
		generateEmail a = new generateEmail();
		String userA = a.returnGenerateEmail(fname,lname,2);
		
		generatePassword a1 = new generatePassword();
		int password = a1.returnGeneratePassword();
		
		System.out.println( fname + " " + lname);
		System.out.println("Kean email: " + userA);
		System.out.println("Password: " + password);
	}
	


}







