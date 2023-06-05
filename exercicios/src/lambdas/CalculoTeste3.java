package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {
		BinaryOperator<Double> calc = (x, y) -> {
			return x + y;
		};
		
		System.out.println(calc.apply(2.0, 4.0));
		
		calc = (x, y) -> x * y;
		System.out.println(calc.apply(2.0, 4.0));
		
		BinaryOperator<Integer> calc1 = (x, y) -> {
			return x + y;
		};
		
		System.out.println(calc1.apply(2, 4));
		
		calc = (x, y) -> x * y;
		System.out.println(calc1.apply(2, 4));
	}
}
