package Lab1;
import java.util.Scanner;

public class AverageSum {

    public static void main (String[] args){
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to be summed or -999 to finish and exit");
        int number = scanner.nextInt();
        sum += number;

        while (number != -999){
            sum += number;
            System.out.print("Enter a number to be summed or -999 to finish and exit");
            number = scanner.nextInt();
            
        }
        System.out.println("The sum of the numbers is " + sum);
        scanner.close();
    }
    
}
