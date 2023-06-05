package lambdas.interfaces;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		
		Predicate<Produto> isExpensive = prod -> 
			(prod.preco * (1 - prod.desconto)) >= 750;
		
		Produto produto = new Produto("Camiseta", 1299.99, 0.15);
		System.out.println(isExpensive.test(produto));
	}
}
