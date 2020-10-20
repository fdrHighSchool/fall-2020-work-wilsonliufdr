//Kyler and Mehmet Wilson
import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello there! Here's a random amount of coins 'cause you're awesome!");
    System.out.println("HERE'S ONE THOUSAND COINS!");
    int startBal = 1000;
    Scanner user = new Scanner(System.in);

    play();
    shop();
    quit();

    for (int i = 0; i <= 4; i++) {
      System.out.println("EXAMPLE");
      ///5 rounds
      ///we need a command that allows them to quit
    }
    // create a looping structure that allows the user to play
    // A) a fixed number of rounds
    // OR
    // B) until they choose to quit
    // (this is prefereable, but we didn't review this type of loop yet)


    // in the loop, present the user with a menu of options that asks the      user what they want to do:
    // 1. play
    // 2. shop
    // 3. quit
    // (feel free to add more options to this if you're inspired)
    System.out.println("Welcome to the menu! Type 1 to play, type 2 to shop, type 3 to quit.");
    Scanner choice = new Scanner(System.in);
    int choice = input.nextInt();
    if (choice == 1){
      System.out.println("You choose to play");
      play();
    }
    if (choice ==2){
      System.out.println("You choose to shop");
      shop();
    }
    if (choice ==3){
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

    for (int i=0; i<=flicks; i++) {
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
        //add the amount of coins rewarded here
    }
    if (tails == numero){
      System.out.println("Congrats! You won!");
        startBal += 500;
        //add the amount of coins rewarded here
    }
    else {
      System.out.println("You lost!");
    }
    System.out.println(heads + " heads");
    System.out.println(tails + " tails");
  }
  /*
   * Name: play
   * Purpose: simulate a round of the game, award the user a random
              amount of coins for playing
   * Input: ???
   * Return: a random number of coins the user won that round
   */




  public static void shop() {
    System.out.println("We made a shop.");
  }
  /*
   * Name: shop
   * Purpose: allow the player to spend coins
   * Input: amount of coins user currently has
   * Return: how many coins spent/updated balance
   */

  public static void quit() {
    boolean repeat = true;
    while (repeat) {
      System.out.println("Wanna quit, kiddo?");
      if ("yes".equals(user))
        repeat = true; // This would continue the loop
      else
        repeat = false; // This would break the infinite while loop
    }
  }

}//end class
