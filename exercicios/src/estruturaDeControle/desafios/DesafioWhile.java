package estruturaDeControle.desafios;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		// Digitar uma nota
		// Armazenar numa variável total
		// Caso entre mais nota acrescente no total
		// Quantas notas válidas foram escritas
		// Sair quando digitar -1
		
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("Digite uma nota: ");
			 nota = entrada.nextDouble();
			 
			 if(nota >= 0 && nota <= 10) {
				 total = total + nota;	 
			 } else if(nota != -1) {
				 System.out.println("Nota inválida");
			 }
		}
		
		 
		System.out.println("O total foi: " + total);
		
		entrada.close();
	}
}
