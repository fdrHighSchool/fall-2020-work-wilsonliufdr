import java.util.Scanner;

public class distance{
  public static void main(String[] args) {
    //get two points from the user (x, y)
    //ex: (3, 5)...stored as a String
    Scanner s = new Scanner(System.in);

    System.out.print("Enter point 1: ");
    String point1 = s.nextLine();

    System.out.print("Enter point 2: ");
    String point2 = s.nextLine();



    int x1 = getX(point1);
    int x2 = getX(point2);
    int y1 = getY(point1);
    int y2 = getY(point2);

    System.out.println("The euclidean distance is:  " + euclideanDistance(x1,y1,x2,y2));
    System.out.println("The taxicab distance is: " + taxicabDistance(x1,y1,x2,y2));


  }

  public static double euclideanDistance(double x1, double y1, double x2, double y2){
    double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    return distance;
  }//end cartesianDistance


  /*
   * N: taxicabDistance
   * P:
   * I:
   * R:
   */
  public static double taxicabDistance(double x1, double y1, double x2, double y2) {
    double distance = Math.abs(x2 - x1) + Math.abs(y2 - y1);
    return distance;
  }//end cartesianDistance


  public static int getX(String point){
    //locate the comma
    int comma = point.indexOf(",");

    //we know the x-value in the String starts at index 1
    //we now know where the comma is
    //so, the x-value is from index 1 to the location of the comma
    String x = point.substring(1, comma);
    //System.out.println(x);

    return Integer.parseInt(x);
  }//end getX method
  public static int getY(String point) {

    int comma = point.indexOf(",");

    String y = point.substring(comma + 2 , point.length()-1);
    return Integer.parseInt(y);
  }

}//end class
