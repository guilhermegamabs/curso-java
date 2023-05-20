package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (F - 32) x 5/9 = C
		double fahrenheit = 45;
		double primeiraParte = fahrenheit - 32;

		double segundaParte = 5 / 9.0;
		double celsius = primeiraParte * segundaParte;

		System.out.println("O resultado é " + celsius + " celsius");
	}
}
