import java.util.*;
public class temp{

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Hello user!");
    System.out.print("Please enter a degree in celsius");
    double celsius = input.nextInt();
    double fahrenheit;
    fahrenheit = (celsius * 1.8 + 32);
    System.out.print("The degree in fahrenheit is " + fahrenheit + "fahrenheit");
  }
}
