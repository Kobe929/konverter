package konverter;

public class Methods {

	public static void kilogramiFunte(double a) {
		//kilogrami u funte
		System.out.println(a + " kilograma je " +(a*2.2046)+ " funti.");
	}

	public static void funteKilogrami(double a) {
		//funte u kulgrame
		System.out.println(a + " funti je " +(a/2.2046)+ " kilograma.");
	}
	public static void centimetarInch(double a) {
		//centimetri u ince
		System.out.println("centimetara "+a+" u incima je "+(a*2.54f));
	}

	public static void inchCentimetar(double a) {
		//centimetri u ince
		System.out.println("inca "+a+" u centimetrima je "+(a/2.54f));
	}

	public static void celsiusFarenheit(double a) {
	}

	public static void farenheitCelsius(double a) {
		System.out.println((a - 32) * 5/9);
	}
}
