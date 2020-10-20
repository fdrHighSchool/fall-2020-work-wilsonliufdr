public class shapes{
  public static void main(String[] args){
    System.out.println(square(2));
    System.out.println(triangle(3,4));
    System.out.println(cube(5));
  }
  public static double square(double side){
    return (side * side);
  }
  public static double triangle(double base, double height){
    return (base * height * 1/2);
  }
  public static double cube(double side){
    return (6 * side * side);
  }
}
