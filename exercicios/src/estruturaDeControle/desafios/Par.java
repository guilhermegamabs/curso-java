package estruturaDeControle.desafios;

import java.util.Scanner;

public class Par {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número entre 0 e 10");
		double valor = entrada.nextDouble();
		
		if(valor >= 0 && valor <= 10) {
			if(valor % 2 == 0) {
				System.out.println("É PAR");
			} else {
				System.out.println("NÃO É PAR");
			}
		}
		
		
		
		entrada.close();
	}
}
