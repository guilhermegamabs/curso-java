package estruturaDeControle.desafios;

import java.util.Scanner;

public class NumeroPositivo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int somaTotal = 0;
		
		while(numero >= 0) {
			System.out.println("Digite um número inteiro para somar(número negativo para SAIR): ");
			numero = entrada.nextInt();
			somaTotal += numero;
			
			if(numero >= 0) {
				System.out.println("Soma total até o momento: " + somaTotal);
			}
		}
		
		System.out.println("Obrigado!");
		
		entrada.close();
	}
}
