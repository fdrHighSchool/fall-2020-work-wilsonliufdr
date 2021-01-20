import java.util.*;

public class shopDriver {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("What would you like to buy\n1.Rock\n2.Rubbish");
    int res = scanner.nextInt();

    if(res == 1){
      shop shop1 = new shop("Rubbish", 0.1, 2);
      System.out.println(shop1);

    }
    else if(res == 2){
      shop shop2 = new shop("Rock", 0.9, 3);
      System.out.println(shop2);
    }
    else{
      System.out.println("Error: Enter a number that's either 1 or 2");
    }
  }
}
