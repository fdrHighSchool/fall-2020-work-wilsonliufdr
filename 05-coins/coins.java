//Kyler, Mehmet and Wilson
import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello there! Here's a random amount of coins 'cause you're awesome!");
    System.out.println("HERE'S ONE THOUSAND COINS!");
    int startBal = 1000;


    System.out.println("Welcome to the menu!");
    System.out.println("Type 1 to play");
    System.out.println("Type 2 to go to the shop");
    System.out.println("Type 3 to quit");
    Scanner choice = new Scanner(System.in);
    int pill = choice.nextInt();
    if (pill == 1){
      System.out.println("You choose to play");
      play();
    }
    if (pill == 2){
      System.out.println("You choose to shop");
      shop();
    }
    if (pill == 3){
      System.out.println("You choose to quit");
      quit();
    }

    // based on their entry, call the method to perform that behavior
    // at all times, keep updating the user's bank balance


  }//end main method




  public static void play() {
    Random flip = new Random();
    Scanner dough = new Scanner(System.in);
    System.out.println("Type 1 for heads or type 2 for tails.");
    int numero = dough.nextInt();
    dough.close();
    int startBal = 1000;
    int side, heads = 0, tails = 0;

    int flicks = 0; // Input how many flips

    for (int i=0; i <= flicks; i++) {
      side = 1 + flip.nextInt(2);
      if (side == 1) {
        heads += 1;
      }
      else {
        tails += 2;
      }
    }
    if (heads == numero){
      System.out.println("Congrats! You won!");
        startBal += 500;
      System.out.println("Your new balance is: " + startBal);
        //add the amount of coins rewarded here
    }
    else if (tails == numero){
      System.out.println("Congrats! You won!");
        startBal += 500;
      System.out.println("Your new balance is: " + startBal);
        //add the amount of coins rewarded here
    }

    else if (heads != numero){
      System.out.println("You Lost!");
        startBal -= 250;
      System.out.println("Your new balance is: " + startBal);
        //reduce the amount of coins for losing!

    }

    else if (tails != numero) {
      System.out.println("You Lost!");
        startBal -= 250;
      System.out.println("Your new balance is: " + startBal);
        ///reduce the amount of coins for losing!
        return(startBal);
    }





  }


  public static void shop() {
    System.out.println("Funny shop");
  }











  public static void quit() {
    Scanner user = new Scanner(System.in);
    boolean repeat = true;
    while (repeat) {
      System.out.println("Wanna quit, kiddo?");
      if ("yes".equals(user)) {
        repeat = true; // This would continue the loop
      }
      else {
        repeat = false; // This would break the infinite while loop
      }
    }
  }
}//end class
