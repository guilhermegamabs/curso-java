package estruturaDeControle;

import java.util.Scanner;

public class controleIF {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();
		
		if(media >= 7) {
			System.out.println("Você passou!");		
		} else {
			System.out.println("Você não passou!");
		}
		
		entrada.close();
	}
}
