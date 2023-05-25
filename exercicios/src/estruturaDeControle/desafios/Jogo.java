package estruturaDeControle.desafios;

import java.util.Scanner;

public class Jogo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número entre 0 e 100: ");
		int numero = entrada.nextInt();
		int tentativas = 10;
		int numeroCerto = 23;
		
		
		while(tentativas != 0 ) {
			if(numero > numeroCerto) {
				tentativas--;
				System.out.println("O número inserido é maior que o número certo!!");
				System.out.println("Número de tentativas: " + tentativas);
				System.out.println("Digite um novo número: ");
				numero = entrada.nextInt();
			} else {
				tentativas--;
				System.out.println("O número inserido é menor que o número certo!!");
				System.out.println("Número de tentativas: " + tentativas);
				System.out.println("Digite um novo número: ");
				numero = entrada.nextInt();
			}
			
			if(numero == numeroCerto) {
				System.out.println("Você acertou o número!!");
				break;
			}
		}
		
		if(tentativas == 0) {
			System.out.println("Acabou suas chances ;D");
		}
		
		entrada.close();
	}
}
