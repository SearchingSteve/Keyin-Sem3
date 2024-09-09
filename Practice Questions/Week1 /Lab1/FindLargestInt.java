package Lab1;
import java.util.Scanner;

public class FindLargestInt{
    public static void main(String[] args){
        int largestInt;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter five integer:");

        int num1 = scanner.nextInt();
        largestInt = num1;
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();

        if (num2 > largestInt) {
            largestInt = num2;
        }
        if (num3 > largestInt) {
            largestInt = num3;
        }
        if (num4 > largestInt) {
            largestInt = num4;
        }
        if (num5 > largestInt) {
            largestInt = num5;
        }
        System.out.println("The largestInt integer is " + largestInt);

        scanner.close();


    }
}