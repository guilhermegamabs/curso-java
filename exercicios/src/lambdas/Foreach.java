package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Gui", "Lia");
		
		System.out.println("Forma tradicional: ");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println();
		System.out.println("Lambda #01...");
		
		aprovados.forEach((nome) -> {
			System.out.println(nome);
		});
		
		System.out.println();
		System.out.println("Method Reference...");
		
		aprovados.forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("Lambda #02...");
		
		aprovados.forEach((nome) -> {
			meuImprimir(nome);
		});
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome é " + nome);
	}
}
