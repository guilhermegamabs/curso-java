package desafios;

import java.util.Scanner;

public class FahrenheitParaCelsius {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite em graus Fahrenheit: ");
		double f = entrada.nextDouble();
		
		double conta = (f - 32);
		double conta2 = conta / 1.8;
		
		System.out.print("Valor em Farenheit: " + conta2);
		
		entrada.close();
	}
}
