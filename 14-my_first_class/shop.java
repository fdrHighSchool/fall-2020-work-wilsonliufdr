import java.util.*;

public class shop {
  private String name;
  private int amount;
  private double cost;
  private double total;

  public shop(String n, int a, double c){
    this.name = n;
    this.amount = a;
    this.cost = c;
  }

  public String getName(){
    return this.name;
  }

  public int getAmount(){
    return this.amount;
  }

  public double getCost(){
    return this.cost;
  }

  public double getTotal(){
    this.total = this.cost * this.amount;
    return this.total;
  }
  public String toString(){
    return "item: " + this.name + ", Amount: " + this.amount + ", Cost: $" + this.cost + ", Total: $" + getTotal();
  }
}
