package lambdas;

public class CalculoTeste1 {
	public static void main(String[] args) {
		Calculo soma = new Soma();
		Calculo mul = new Multiplicar();
		
		System.out.println(soma.executar(1, 2));
		System.out.println(mul.executar(1, 2));

	}
}
