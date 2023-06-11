package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DesafioFilter {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Guilherme", false);
		Cliente c2 = new Cliente("Pedro", true);
		Cliente c3 = new Cliente("Ana", true);
		Cliente c4 = new Cliente("Carlos", false);
		Cliente c5 = new Cliente("Bia", true);
		Cliente c6 = new Cliente("Gustavo", false);
		Cliente c7 = new Cliente("Julia", true);

		List<Cliente> clientes = Arrays.asList(c1, c2, c3, c4, c5, c6, c7);
		Predicate<Cliente> isEmployed = c -> c.isEmployed == true;
		Predicate<Cliente> isNotEmployed = c -> c.isEmployed == false;

		clientes.stream()
			.filter(isEmployed)
			.filter(isNotEmployed)
			.map(c -> "O cliente " + c.nome + " está empregado!")
			.forEach(System.out::println);
	}
}
