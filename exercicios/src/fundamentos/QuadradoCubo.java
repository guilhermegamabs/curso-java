package desafios;

import java.util.Scanner;

public class QuadradoCubo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		double valor = entrada.nextDouble();
		
		double quadrado = Math.pow(valor, 2);
		double cubo = Math.pow(valor, 3);
		
		System.out.println("Valor ao quadrado " + quadrado + " e valor ao cubo " + cubo);
		
		entrada.close();
	}
}
