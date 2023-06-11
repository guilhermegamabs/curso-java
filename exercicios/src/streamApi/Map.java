package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "Audi " , "Ferrari");
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		UnaryOperator<String> grito = n -> n + "!!!! ";

		System.out.println();
		
		System.out.println("\nUsando composição: \n");
		marcas.stream()
			.map(maiuscula)
			.map(primeiraLetra)
			.map(grito)
			.forEach(print);
		
		System.out.println();
		System.out.println();
		
		for(String marca: marcas) {
			System.out.println(marca);
		}
	}
	
}
