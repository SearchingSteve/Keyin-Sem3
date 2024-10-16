package Lab1;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompting the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Prompting the user to enter an operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        // Using switch to perform the desired operation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("The result is: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("The result is: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("The result is: " + result);
                break;
            case '/':
                // Checking for division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The result is: " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;
            default:
                // Handling invalid operators
                System.out.println("Error! Invalid operator.");
                break;
        }

        // Closing the scanner
        scanner.close();
    }
}

