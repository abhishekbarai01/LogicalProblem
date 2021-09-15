package logicalProblemsDay6;

import java.util.Scanner;

public class Temperature_Conversion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("temperature in Celsius C : ");
		double Celsius = scan.nextDouble();

		System.out.print("temperature in fahrenheit F : ");
		double Fahrenheit = scan.nextDouble ();

		double CelsiustoFahrenheit = (Celsius * 9/5) + 32;
		System.out.println("Celsius to Fahrenheit:" + CelsiustoFahrenheit);

		double FahrenheittoCelsius = (Fahrenheit - 32) * 5/9;
		System.out.println("Fahrenheit to Celsius:" + FahrenheittoCelsius);
	}
}


