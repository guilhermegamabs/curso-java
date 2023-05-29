package arraysECollections.desafios;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantidade de notas: ");
		int qtdNotas = entrada.nextInt();
		
		double[] notas = new double[qtdNotas];

		for(int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
		}
		
		double total = 0;

		for(double nota: notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		
		System.out.printf("A sua média é: %.2f ", media);
		
		entrada.close();
	}
}
