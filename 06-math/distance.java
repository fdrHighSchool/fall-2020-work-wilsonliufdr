import java.util.*;
public class distance{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter x1");
    double x1 = input.nextInt();

    System.out.println("Enter x2");
    double x2 = input.nextInt();

    System.out.println("Enter y1");
    double y1 = input.nextInt();

    System.out.println("Enter y2");
    double y2 = input.nextInt();

    double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    System.out.print(distance);
  }
}
