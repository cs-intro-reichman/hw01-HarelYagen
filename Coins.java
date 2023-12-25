/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		int quarter = 25;
		int total = Integer.parseInt(args[0]);
		int leftcents = total % quarter;
		int numqaurter = (total/quarter);
		System.out.println("Use " + numqaurter + " quarters and " + leftcents + " cents");
	}
}