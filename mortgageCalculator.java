import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {

        float principal = (float) saveInput("Principal: ", 1000, 1000000);
        float annualInterest = (float) saveInput("Annual Interest: ", 0, 30);
        byte timePeriod = (byte) saveInput("Period (year) Interest: ", 0, 30);

        double mortgage = calculateMortgage(principal, annualInterest, timePeriod);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }

    public static double saveInput(String msg, int min, int max) {
        double value;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print(msg);
            value = scan.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a number between" + min + " and " + max);
        }
        scan.close();
        return value;
    }

    public static double calculateMortgage(
            float principal,
            float annualInterest,
            int timePeriod) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        float monthlyInterestRate = annualInterest / (MONTHS_IN_YEAR * PERCENT);
        int numberOfPayments = timePeriod * MONTHS_IN_YEAR;

        double mortgage = ((principal * monthlyInterestRate) * (Math.pow((1 + monthlyInterestRate), numberOfPayments)
                / ((Math.pow((1 + monthlyInterestRate), numberOfPayments) - 1))));
        return mortgage;
    }
}
