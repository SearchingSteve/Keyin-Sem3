package Lab1;

public class CompountInterestCalc {
    public static void main(String[] args){
        double principal = 1000;
        double rate = 0.05;
        double amount;
        int year = 1;
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        for (year = 1; year <= 10; year++){
            amount = principal * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%,20.2f%n", year, amount);
        }
    }
    
}
