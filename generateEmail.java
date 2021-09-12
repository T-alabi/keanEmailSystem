
public class generateEmail {

	
	public String returnGenerateEmail(String fn, String ln ) { // the default method for creating a new user's username. 
		String username = fn.substring(0,1) + ln; 			  // then turns the entire username string to lower case to filter out
		username = username.toLowerCase();					 // any captial letters. Then adds kean.edu ending to the email
		String signiture = "@kean.edu";
		return username + signiture;
	}
	
	public String returnGenerateEmail(String fn, String ln, int num ) {// the overloaded method for creating a new user's username. 
		String username = fn.substring(0,1) + ln; 		// this is used for situations when more than one person has the same 
		username = username.toLowerCase();				// first and last name combination. Because this isn't common
		String signiture = "@kean.edu";					// the option isn't printed to the console (as directed)
		return username + num + signiture;   			// but it can be added as an option when the email is being created with this method
	}
	
}
