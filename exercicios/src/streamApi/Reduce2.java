package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Guilherme", 8.7);
		Aluno a2 = new Aluno("Julia", 4.3);
		Aluno a3 = new Aluno("Carlos", 9.3);
		Aluno a4 = new Aluno("Bianca", 6.7);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, Double> nota = a -> a.nota;
		BinaryOperator<Double> somar = (a, b) -> a + b;
		
		alunos.parallelStream()
			.filter(aprovado)
			.map(nota)
			.reduce(somar)
			.ifPresent(System.out::println);
	}
}
