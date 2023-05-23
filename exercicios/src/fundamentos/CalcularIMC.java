package desafios;

import java.util.Scanner;

public class CalcularIMC {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		
		System.out.println("Digite seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.println("Digite sua altura em metros: ");
		double altura = entrada.nextDouble();
		altura = Math.pow(altura, 2);
		
		double imc = peso / altura;
		
		System.out.println("Seu IMC é: " + imc);
		
		entrada.close();
		
	}
}
