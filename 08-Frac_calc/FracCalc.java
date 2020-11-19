import java.util.*;
public class FracCalc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a fraction equation or \"Q\" to quit");
        String text = scanner.nextLine();
        while (!text.equalsIgnoreCase("Q")) { //while loop/code ends if user types "Q"
            System.out.println(produceAnswer(text));
            System.out.println("Enter a fraction equation or \"Q\" to quit");
            text = scanner.nextLine();
        } //while loop/code continues until the user types "Q".
    }

    public static String produceAnswer(String input) {
        String operand1 = input.substring(0, input.indexOf(" ")); //locate the first fraction
        String operator = input.substring(input.indexOf(" ") + 1, input.indexOf(' ') + 2); //locate the operation
        String operand2 = input.substring(input.indexOf(" ") + 3); //locate the second fraction

        String operand1Whole = findWhole(operand1); //find fraction 1 whole
        String operand1Numerator = findNumerator(operand1); //find fraction 1 numerator
        String operand1Denominator = findDenominator(operand1); //find fraction 1 denominator
        String operand2Whole = findWhole(operand2); //find fraction 2 whole
        String operand2Numerator = findNumerator(operand2); //find fraction 2 numerator
        String operand2Denominator = findDenominator(operand2); //find fraction 2 denominator

        int op1w = Integer.parseInt(operand1Whole); //convert string into int
        int op1n = Integer.parseInt(operand1Numerator);
        int op1d = Integer.parseInt(operand1Denominator);
        int op2w = Integer.parseInt(operand2Whole);
        int op2n = Integer.parseInt(operand2Numerator);
        int op2d = Integer.parseInt(operand2Denominator);

        op1n = (op1w * op1d) + op1n; //convert into improper fraction
        op2n = (op2w * op2d) + op2n;

        if (operator.equals("+")) {
            String solution = addition(op1n, op1d, op2n, op2d);
            return (solution);
        } //if operator is + it will add the fractions
        if (operator.equals("-")) {
            String solution = subtraction(op1n, op1d, op2n, op2d);
            return (solution);
        } //if operator is = it will subtract the fractions
        if (operator.equals("*")) {
            String solution = multiplication(op1n, op1d, op2n, op2d);
            return (solution);
        } //if operator is * it will multiply the fractions
        if (operator.equals("/")) {
            String solution = division(op1n, op1d, op2n, op2d);
            return (solution);
        } //if operator is / it will divide the fractions
        return operand2; //program is asking for a return statement so I added this, code still work fine. But doesn't without it?
    }

    public static String findWhole(String fraction) {
        if (fraction.contains("_")) {
            return fraction.substring(0, fraction.indexOf("_"));
        } //if fraction contains a "_" then it's a mixed fraction. It will return the whole from 0 to "_"
        else if (fraction.contains("/")) {
            return "0";
        } //if fraction contains a "/" instead then it's a fraction. It will return a "0" because there is no whole number
        else return fraction;
    } //if fraction does not contain a "_" or "/" then it's a whole number. It will return the whole itself

    public static String findNumerator(String fraction) {
        if (fraction.contains("_")) {
            return fraction.substring(fraction.indexOf("_") + 1, fraction.indexOf("/"));
        } //if fraction contains a "_" then it's a mixed fraction. It will return the numerator from "_" + 1 to "/"
        else if (fraction.contains("/")) {
            return fraction.substring(0, fraction.indexOf("/"));
        } //if fraction contains a "/" instead then it's a fraction. It will return the numerator from 0 to "/" because there is no whole
        else {
            return "0";
        } //if fraction does not contain a "_" and "/", it will return 0 because there is no numerator.
    }

    public static String findDenominator(String fraction) {
        if (fraction.contains("/")) {
            return fraction.substring(fraction.indexOf("/") + 1);
        } //if fraction contains a "/" instead then it's a fraction. It will return the denominator from "/" + 1
        else {
            return "1";
        } //if fraction does not contain a "/", it will return 1 because there is no denominator
    }
    public static String addition(int op1n, int op1d, int op2n, int op2d) {
        int N = (op1n * op2d) + (op2n * op1d);
        int D = op1d * op2d;
        String solution = N + "/" + D;
        return solution;
    } //method for adding

    public static String subtraction(int op1n, int op1d, int op2n, int op2d) {
        int N = (op1n * op2d) - (op2n * op1d);
        int D = op1d * op2d;
        String solution = N + "/" + D;
        return solution;
    } //method for subtracting

    public static String multiplication(int op1n, int op1d, int op2n, int op2d) {
        int N = op1n * op2n;
        int D = op1d * op2d;
        String solution = N + "/" + D;
        return solution;
    } //method for multiplying

    public static String division(int op1n, int op1d, int op2n, int op2d) {
        int N = op1n / op2n;
        int D = op1d / op2d;
        String solution = N + "/" + D;
        return solution;
    } //method for dividing
}
