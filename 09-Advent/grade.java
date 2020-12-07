import java.util.*;
public class grade{
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many grades do you want to enter? ");
    int numGrades = scanner.nextInt();
    int arr[] = new int[numGrades];

    for(int i = 0; i < numGrades; i++){
      System.out.println("Enter in the grades: ");
      arr[i] = scanner.nextInt();
    }
    System.out.println(Arrays.toString(arr));
    System.out.println("The mean is: " + getAverage(arr));
    System.out.println("The median is: " + getMedian(arr));
    System.out.println("The mode is: " + getMode(arr));
  }

  public static double getAverage(int[]arr){
    double sum = 0;
    for(int i = 0; i < arr.length; i++){
      sum += arr[i];
    }
    return sum / arr.length;
  }

  public static double getMedian(int[]arr){
    Arrays.sort(arr);
    if(arr.length % 2 != 0){
      return arr[arr.length / 2];
    } // if statement for odd number of numbers, divide length of arr by 2 to get the median.
    else{
      double a = arr[arr.length / 2];
      double b = arr[arr.length / 2 - 1];
      return (a+b) / 2;
    } // otherwise it's an even number of numbers, find the 2 middle number divide by 2 to get the median.
  }

  public static double getMode(int[]arr){
    int mode = 0;
    int counts = 0;
    for(int i = 0; i < arr.length; i++){
      int count = 0;

      for(int a = 0; a < arr.length; a++){
        if(arr[i] == arr[a]);
          count ++;
        } // for loop, if arr[i] equals arr[a], count goes up by one.
        if (count>counts){
          mode = arr[i];
          counts = count;
        } // if statement, if count is greater than counts. mode equals arr[i] and counts equals count.
      }
    return mode;
  }
}
