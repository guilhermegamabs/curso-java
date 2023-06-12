package tratamentoDeErros;

public class Basico {
	public static void main(String[] args) {
		Aluno a = null;
		
		try {
			imprimirAluno(a);			
		}catch(Exception err) {
			System.out.println("Houve um erro ao imprimir o nome do aluno: " + err);
		}
		
		try {
			System.out.println(7 / 0 );			
		}catch(Exception err) {
			// err.printStackTrace();
			System.out.println("Houve um erro ao fazer a conta: " + err);
		}
		
		System.out.println("\nChegou no fim do programa");
	
	}
	
	public static void imprimirAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
