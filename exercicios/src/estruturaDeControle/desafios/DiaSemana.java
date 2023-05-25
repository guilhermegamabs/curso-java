package estruturaDeControle.desafios;

import java.util.Scanner;

public class DiaSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um dia da semana: ");
		
		String dia = entrada.next();
		
		if(dia.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		} else if(dia.equalsIgnoreCase("segunda")) {
			System.out.println(2);
		} else if(dia.equalsIgnoreCase("terca")) {
			System.out.println(3);
		} else if(dia.equalsIgnoreCase("quarta")) {
			System.out.println(4);
		} else if(dia.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		} else if(dia.equalsIgnoreCase("sexta")) {
			System.out.println(6);
		} else if(dia.equalsIgnoreCase("sabado")) {
			System.out.println(7);
		} 
		
		System.out.println("Obrigado por usar o programa!");
		
		entrada.close();
	}
}
