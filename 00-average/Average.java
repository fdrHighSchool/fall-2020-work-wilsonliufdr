import java.util.*;
public class Average{
  public static void main(String[] args) {
    System.out.println("Hello user, please enter your grades, I will calculate them and find the average");
    Scanner input = new Scanner(System.in);
    int sum = 0;
    System.out.print("Enter the first score: ");
    sum += input.nextInt();
    System.out.print("Enter the second score: ");
    sum += input.nextInt();
    System.out.print("Enter the third score: ");
    sum += input.nextInt();
    System.out.print("Enter the third score: ");
    sum += input.nextInt();
    double average = sum / 4.0;
    System.out.println("Your average is: " + average);
  }
}
