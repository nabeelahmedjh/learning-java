package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // program which calculates mortgage payment
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        // taking user inputs
        Scanner scan = new Scanner(System.in);

        float principal;
        do {
            System.out.print("Principal: ");
            principal = scan.nextFloat();
            if (!(principal >= 1000 && principal <= 1000000))
                System.out.println("Enter a number between 1,000 and  1,000,000.");
        } while (!(principal >= 1000 && principal <= 1000000));

        float annualInterest;
        do {
            System.out.print("Annual Interest: ");
            annualInterest = scan.nextFloat();
            if (!(annualInterest > 0 && annualInterest <= 30))
                System.out.println("Enter a value greater than 0 and less than or equal to 30");
        } while (!(annualInterest > 0.0 && annualInterest <= 30));

        byte timePeriod;
        do {
            System.out.print("Period (Years) Interest: ");
            timePeriod = scan.nextByte();
            if (!(timePeriod > 0 && timePeriod <= 30))
                System.out.println("Enter a value between 1 and 30");
        } while (!(timePeriod > 0 && timePeriod <= 30));

        float monthlyInterestRate = annualInterest / (MONTHS_IN_YEAR * PERCENT);
        int numberOfPayments = timePeriod * MONTHS_IN_YEAR;

        // formula for calculating mortgage payment
        float mortgage = (float) Math.pow((1 + monthlyInterestRate), numberOfPayments);
        mortgage /= (Math.pow((1 + monthlyInterestRate), numberOfPayments) - 1);
        mortgage *= principal * monthlyInterestRate;

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
