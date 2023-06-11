package streamApi;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Guilherme", 8.7);
		Aluno a2 = new Aluno("Julia", 6.3);
		Aluno a3 = new Aluno("Carlos", 9.3);
		Aluno a4 = new Aluno("Bianca", 8.7);
		Aluno a5 = new Aluno("Julia", 6.3);
		Aluno a6 = new Aluno("Pedro", 4.5);
		Aluno a7 = new Aluno("Andrea", 8.2);
		Aluno a8 = new Aluno("Jose", 7.3);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("distinct...");
		alunos.stream().distinct().forEach(System.out::println);
	
		System.out.println("\nSkip/Limit");
		alunos.stream()
			.distinct()
			.skip(2)
			.limit(2)
			.forEach(System.out::println);

		System.out.println("\ntakeWhile");
		alunos.stream()
			.distinct()
			.takeWhile(a -> a.nota >= 7)
			.forEach(System.out::println);
	}
}
