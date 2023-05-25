package estruturaDeControle.desafios;

import java.util.Scanner;


public class While {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String fala = "";
		
		while(!fala.equalsIgnoreCase("sair")) {
			System.out.println("Você falou: ");
			fala = entrada.nextLine();
		}
		
		entrada.close();
	}
}
