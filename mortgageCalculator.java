import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        // program which calculates mortgage payment

        // taking user inputs
        Scanner scan = new Scanner(System.in);

        float principal;

        while (true) {
            System.out.print("Principal: ");
            principal = scan.nextFloat();
            if (principal >= 1000 && principal <= 1000000)
                break;

            System.out.println("Enter a number between 1,000 and  1,000,000.");
        }

        float annualInterest;

        while (true) {
            System.out.print("Annual Interest: ");
            annualInterest = scan.nextFloat();
            if (annualInterest > 0 && annualInterest <= 30)
                break;

            System.out.println("Enter a value greater than 0 and less than or equal to 30");
        }

        byte timePeriod;

        while (true) {
            System.out.print("Period (year) Interest: ");
            timePeriod = scan.nextByte();
            if (timePeriod > 0 && timePeriod <= 30)
                break;
            System.out.println("Enter a value between 1 and 30");
        }

        scan.close();

        double mortgage = calculateMortgage(principal, annualInterest, timePeriod);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }

    public static double calculateMortgage(
            float principal,
            float annualInterest,
            int timePeriod) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        float monthlyInterestRate = annualInterest / (MONTHS_IN_YEAR * PERCENT);
        int numberOfPayments = timePeriod * MONTHS_IN_YEAR;

        double mortgage = (principal * monthlyInterestRate) * (Math.pow((1 + monthlyInterestRate), numberOfPayments)
                / ((Math.pow((1 + monthlyInterestRate), numberOfPayments) - 1)));
        return mortgage;
    }
}
