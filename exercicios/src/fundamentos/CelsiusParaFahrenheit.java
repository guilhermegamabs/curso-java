package desafios;

import java.util.Scanner;

public class CelsiusParaFahrenheit {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma temperatura em celsius: ");
		double celsius = entrada.nextDouble();
		
		double conta = celsius * 1.8 + 32;
		
		System.out.println("Valor em celsius: " + conta);
		
		entrada.close();
	}
}
