package Temperatura;

import Relogio.Relogio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Temperatura temperatura1 = new Temperatura();

        double temperaturaCelsius = 25.0;
        double temperaturaFahrenheit = 77.0;

        temperatura1.celsiusParaFahrenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + " Celsius é igual a " + temperatura1 + " Fahrenheit");

        temperatura1.fahrenheitParaCelsius(temperaturaFahrenheit);
        System.out.println(temperaturaFahrenheit + " Fahrenheit é igual a " + temperatura1 + " Celsius");
    }
}
