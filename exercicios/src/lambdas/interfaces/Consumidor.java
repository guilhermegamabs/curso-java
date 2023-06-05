package lambdas.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Caneca", 19.99, 0.1);
		imprimir.accept(p1);
		
		System.out.println();
		
		Produto p2 = new Produto("Camiseta", 89.99, 0.10);
		Produto p3 = new Produto("Mouse", 129.99, 0.15);
		Produto p4 = new Produto("Monitor", 1399.99, 0.20);
		Produto p5 = new Produto("Tênis", 249.99, 0.10);

		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimir);
		
		System.out.println();
		
		produtos.forEach(System.out::println);
	}
}
