import java.util.*;
public class bill{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Bill-Splitter");
		System.out.print("Enter the total, pre-tax: ");
		double total = input.nextInt();

		System.out.print("Enter tax: ");
		double tax = input.nextInt();

		System.out.print("Enter tip: ");
		double tip = input.nextInt();

		System.out.print("How many people? ");
		int numPeople = input.nextInt();

		double ttt = (total + tax + tip);
		double perPerson = ttt / numPeople;

		System.out.println("Each person must pay $" + perPerson);
	}
}
