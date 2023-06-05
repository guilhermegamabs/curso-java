package lambdas.interfaces.desafio;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		
		
		Function<Produto, Double> precoReal = prod -> prod.preco * (1 - prod.desconto);
		UnaryOperator<Double> imposto = valor -> valor >= 2500 ? valor * 1.085 : valor;
		UnaryOperator<Double> frete = valor -> valor >= 3000 ? valor + 100 : valor + 50;
		UnaryOperator<Double> arredondar = valor -> Double.parseDouble(String.format(Locale.ENGLISH, "%.2f", valor));
		Function<Double, String> formatar = valor -> ("R$" + valor).replace(".", ",");

		Produto p = new Produto("Camiseta", 99.99, 0.1);

		String precoFinal = precoReal
				.andThen(imposto)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		
		System.out.println("O preço final é: " + precoFinal);
	}
}
