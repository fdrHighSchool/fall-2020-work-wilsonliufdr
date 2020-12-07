import java.util.*;
public class Dayone2015{

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String puzzle = scanner.nextLine();
    int length = puzzle.length();

    int a = 0;
    int b = 0;

    for(int i = 0; i<puzzle.length(); i++){
      if(puzzle.charAt(i) == '('){
        a++;
      }
        }
        for(int c = 0; c<puzzle.length(); c++){
          if(puzzle.charAt(c) == ')'){
            b++;
      }
    }
    int result = a - b;
    System.out.println(result);
  }
}
