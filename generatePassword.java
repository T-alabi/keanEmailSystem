

public class generatePassword {
	
	public int returnGeneratePassword () { // this method generates a random number between 100,000 and 999,999
		double pass = 100000 + ( Math.random()	* 900000); // to do this, we add the min number, then subtract the min from the max
		return (int) pass;// so in this case its 999,999 - 100,000 = 899,999. we add 1 because we want 899,999 to be a password 
	}					  // option
}
