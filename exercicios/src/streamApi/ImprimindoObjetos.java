package streamApi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Gui", "Ana", "Bia");
		
		/*
		for(int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		*/
		
		System.out.println("For each...");
		
		for(String nomes: aprovados) {
			System.out.println(nomes);
		}
		
		System.out.println();
		
		System.out.println("Usando Iterator...");
		
		Iterator<String> iterator = aprovados.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println();
		
		System.out.println("Usando Stream...");
		
		Stream<String> stream = aprovados.stream();
		
		stream.forEach(System.out::println);
	}
}
