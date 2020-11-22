import java.util.*;
public class shapes{
  public static void main(String[] args){
    System.out.println("The area of the square is:" + " " + areaSquare(2));
    System.out.println("The area of the triangle is:" + " " + areaTriangle(3,2));
    System.out.println("The area of the cube is:" + " " + areaCube(4));
    System.out.println("The area of the rectangle is:" + " " + areaRectangle(5,3));
    System.out.println("The volume of the sphere is:" + " " + volumeSphere(6));
    System.out.println("The volume of the rectangular prism is:" + " " + volumeRectangularprism(42,2));
    System.out.println("The volume of the cube is:" + " " + volumeCube(7));
  }
  public static double areaSquare(double side){
    return (side * side);
  }
  public static double areaTriangle(double base, double height){
    return (base * height * 1/2);
  }
  public static double areaCube(double side){
    return (6 * Math.pow(side,2));
  }
  public static double areaRectangle(double length, double width){
    return (length * width);
  }
  public static double volumeSphere(double radius){
    return (4.0/3.0) * Math.PI * Math.pow(radius,3);
  }
  public static double volumeRectangularprism(double area, double height){
    return (area * height);
  }
  public static double volumeCube(double side){
    return (Math.pow(side,3));
  }
}
