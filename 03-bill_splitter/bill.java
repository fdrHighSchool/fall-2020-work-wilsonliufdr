import java.util.*;
public class bill{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Bill-Splitter");
		System.out.print("Enter the total, pre-tax: ");
		double total = input.nextInt();

		System.out.print("How many people? ");
		int numPeople = input.nextInt();
		double perPerson = total / numPeople;

		System.out.print("How much are you tipping?");
		double tip = input.nextInt();

		System.out.print("How much percent tax are you paying: ");
		double percentTax = input.nextInt();
		double percent = total * (percentTax/100);

		System.out.println("Each person must pay $" + perPerson + " " + "and $" + percent + " " + "tax" + " " + "and $" + tip + " " + "tip.");
}
}
