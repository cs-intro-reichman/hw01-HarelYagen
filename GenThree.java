/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) { 
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int randomnumone = (int) ((b - a) * Math.random() + a);
		int randomnumtwo = (int) ((b - a) * Math.random() + a);
		int randomnumthree = (int) ((b - a) * Math.random()  + a);
		int lowestnum = Math.min(randomnumone, randomnumtwo);
	   	lowestnum = Math.min(lowestnum, randomnumthree);
		System.out.println(randomnumone);
		System.out.println(randomnumtwo);
		System.out.println(randomnumthree);
		System.out.println("The minimal generated number was " + lowestnum );
		
	}
}