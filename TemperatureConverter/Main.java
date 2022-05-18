package TemperatureConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-----TEMPERATURE-CONVERTER-----");
        System.out.println("Enter the value of temperature measured");
        System.out.println("System then will ask to enter the scale symbol in which the temperature is measured");
        System.out.println("i.e. \n'c' for celsius\n'f' for fahrenheit\n'k' for kelvin");

        while (true) {
            Temperature t = new Temperature();
            t.setTemperatureValue();
            t.displayConversions();
            System.out.println("Press any key to close or Press (y/Y) to continue: ");
            char again = scan.next().charAt(0);
            if (!(again == 'y'  || again == 'Y'))
                break;

        }


    }


}
