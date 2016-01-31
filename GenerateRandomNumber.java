package session3;

public class GenerateRandomNumber {

	public static long genRandomNum(long n) {
		//Generate a random number between 0 and n
		long randomNum = 0;
		
		randomNum = Math.round(Math.random() * n);
		
		return randomNum;
	}
	public static void main(String[] args) {
		//Call genRandomNum
		System.out.println("Random Number between 0 and " + args[0] + " is " + genRandomNum(Long.parseLong(args[0])));
		
		/* Output
		 * When n = 17
		 * Random Number between 0 and 17 is 9
		 * When n = 1000
		 * Random Number between 0 and 1000 is 806
		 */
	}

}
