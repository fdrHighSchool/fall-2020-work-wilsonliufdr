import java.util.*;

public class shop {
  private String name;
  private double cost;
  private int amount;
  private double total;

  public shop(String n, double c, int a){
    this.name = n;
    this.cost = c;
    this.amount = a;
  }

  public String getName(){
    return this.name;
  }

  public double getCost(){
    return this.cost;
  }

  public int getAmount(){
    return this.amount;
  }

  public double calculateTotal(){
    this.total = this.amount * this.cost;
    return this.total;
  }

  public String toString(){
    return "item: " + this.name + "\nAmount: " + this.amount + "\nCost per item: " + this.cost + "\nTotal cost: " + calculateTotal();
  }
}
