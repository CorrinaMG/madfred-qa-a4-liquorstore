// Corrina Merasty-Gallant
// Assignment #4
// September 12/2013
// QUAL1079 course


// The import here below is stating in the code that there will be a dialog box in the program.

import javax.swing.JOptionPane;



public class AgeChecker {

	// Prompts users for their first name, last name and year born
	public static void main(String[] args) {
		String firstName = JOptionPane.showInputDialog(null, "What is your first name?");
		String lastName = JOptionPane.showInputDialog(null, "What is your last name?");
		int yearOfBirth = Integer.parseInt(JOptionPane.showInputDialog(null, "What year were you born?"));
		
		// the below info stores the input from the user as a boolean value and a string from the user.
		boolean oldEnough = verifyLegalAge(yearOfBirth);
		String fullName = concatenateNames(firstName, lastName);
		// The if and else statement determines the message that will be relayed back to the user in a msg dialog box.
		if(oldEnough == true) {
			JOptionPane.showMessageDialog(null, fullName + ", You may proceed with your shopping");
		} else {
			JOptionPane.showMessageDialog(null, fullName + ", You're not old enough, try disney.com instead!");
		}
	}
	
	//This method receives and in parameter for year of birth and returns a boolean value if age is 19 or over.
	public static boolean verifyLegalAge(int yob){
		boolean legalAgeStatus = (2013-yob) >= 19;
		return legalAgeStatus;
	}
	
	//This method receives two string parameters and returns a message with last name and first name joined.
	public static String concatenateNames ( String fn, String ln){
	String fullName =fn + " " + ln;
	return fullName;
	}
}