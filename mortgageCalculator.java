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
        System.out.print("Principal: ");
        float principal = scan.nextFloat();
        System.out.print("Annual Interest: ");
        float annualInterest = scan.nextFloat();
        System.out.print("Period (years): ");
        byte timePeriod = scan.nextByte();

        float monthlyInterestRate = annualInterest/(MONTHS_IN_YEAR * PERCENT);
        int numberOfPayments = timePeriod*MONTHS_IN_YEAR;

        // formula for calculating mortgage payment
        float mortgage = (float)Math.pow((1 + monthlyInterestRate), numberOfPayments);
        mortgage /= (Math.pow((1 + monthlyInterestRate), numberOfPayments) - 1);
        mortgage *= principal*monthlyInterestRate;

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
