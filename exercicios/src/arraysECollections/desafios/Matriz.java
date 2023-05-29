package arraysECollections.desafios;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos alunos tem a sala?");
		int qtdAlunos = entrada.nextInt();
		
		System.out.println("Quantos notas por aluno?");
		int qtdNotasPorAluno = entrada.nextInt();
		
		double[][] mediaTurma = new double[qtdAlunos][qtdNotasPorAluno];
		
		double total = 0;
		for(int a = 0; a < mediaTurma.length; a++) {
			for(int n = 0; n < mediaTurma[a].length; n++) {
				System.out.printf("Digite a nota %d do aluno %d: ", n + 1, a + 1);
				mediaTurma[a][n] = entrada.nextDouble();
				total += mediaTurma[a][n];
			}
		}
		
		double media = total / (qtdAlunos * qtdNotasPorAluno);
		System.out.println("Média da turma é: " + media);
		
		entrada.close();
	}
}
