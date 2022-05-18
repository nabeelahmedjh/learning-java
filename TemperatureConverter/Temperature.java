package TemperatureConverter;

import java.util.Scanner;

public class Temperature {
    private float celsius, fahrenheit, kelvin;
    private char scale;



    public void setTemperatureValue() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value: ");
        float temperature = scan.nextFloat();

        System.out.print("Enter the symbol of scale in which temperature is measured: ");
        while (true) {
            this.scale = Character.toLowerCase(scan.next().charAt(0));
            if (scale == 'c' || scale == 'C') {
                setCelsius(temperature);
                celsiusToKelvin();
                celsiusToFahrenheit();
                break;
            } else if (scale == 'f' || scale == 'F') {
                setFahrenheit(temperature);
                fahrenheitToKelvin();
                fahrenheitToCelsius();
                break;
            } else if (scale == 'K' || scale == 'k') {
                setKelvin(temperature);
                kelvinToCelsius();
                kelvinToFahrenheit();
                break;
            }
            System.out.print("Enter a valid Symbol: ");

        }
    }

    private void kelvinToFahrenheit() {
        fahrenheit = 1.8F * (kelvin - 273.15F) + 32;
    }


    private void celsiusToFahrenheit() {
        fahrenheit = 1.8F * celsius + 32;
    }

    private void celsiusToKelvin() {
        kelvin = celsius + 273.15F;
    }

    private void fahrenheitToCelsius() {
        celsius = (fahrenheit - 32) * 5/ 9.0F;
    }

    private void fahrenheitToKelvin() {
        kelvin = ((fahrenheit - 32) / 1.8F) + 273.15F;
    }

    private void kelvinToCelsius() {
        celsius = kelvin - 273.15F;
    }


    public float getFahrenheit() {
        if (scale == 'c' && fahrenheit == 0)
            celsiusToFahrenheit();
        else if (scale == 'k' && fahrenheit == 0)
            kelvinToCelsius();

        return fahrenheit;
    }

    private void setFahrenheit(float fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public float getKelvin() {
        if (scale == 'c' && kelvin == 0)
            celsiusToKelvin();
        else if (scale == 'f' && kelvin == 0)
            fahrenheitToKelvin();

        return kelvin;
    }

    private void setKelvin(float kelvin) {
        this.kelvin = kelvin;
    }

    public float getCelsius() {
        if (scale == 'f' && celsius == 0)
            fahrenheitToCelsius();
        else if (scale == 'k' && celsius == 0)
            kelvinToCelsius();

        return celsius;
    }

    private void setCelsius(float celsius) {
        this.celsius = celsius;
    }

    public void displayConversions() {
        System.out.println("Value in Celsius: " + celsius);
        System.out.println("Value in Fahrenheit: " + fahrenheit);
        System.out.println("Value in Kelvin: " + kelvin);
    }
}
