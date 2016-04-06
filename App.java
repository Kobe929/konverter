package konverter;

import java.util.Scanner;

public class App extends Methods {

	public static void main(String[] args) {

		System.out.println("Izaberite:");
		System.out.println("1: Funte u kilogrami.");
		System.out.println("2: Kilogrami u funte.");
		System.out.println("3: centimetri u inche.");
		System.out.println("4: Inchi u centimetre.");
		System.out.println("5: Celsius u fahrenheit.");
		System.out.println("6: Fahrenheit u celsius.");

		Scanner input = new Scanner(System.in);
		int numbah = input.nextInt();

		System.out.println("Unesite kolièinu:");
		int izracunat = input.nextInt();
		input.close();
		
		switch (numbah) {
		case (1):
			funteKilogrami(izracunat);
			break;
		case (2):
			kilogramiFunte(izracunat);
			break;
		case (3):
			centimetarInch(5);
			break;
		case (4):
			inchCentimetar(5);
			break;
		case (5):
			celsiusFarenheit(5);
			break;
		case (6):
			farenheitCelsius(5);
			break;
		}

	}

}
