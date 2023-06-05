package lambdas.interfaces;

import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {
		Function<Integer, String> parOuImpar = num -> num % 2 == 0 ? "Par" : "Ímpar";
		
		System.out.println(parOuImpar.apply(23));
	
		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
		
		String resultadoFinal = parOuImpar.andThen(oResultadoE).apply(32);
		
		System.out.println(resultadoFinal);
	
	}
}
