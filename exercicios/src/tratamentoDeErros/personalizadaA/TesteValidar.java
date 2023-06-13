package tratamentoDeErros.personalizadaA;

import tratamentoDeErros.Aluno;

public class TesteValidar {
	public static void main(String[] args) {
		
		try {
			Aluno a1 = new Aluno("Gui", -7);
			Validar.usuario(a1);
		} catch(StringVaziaException err) {
			System.out.println(err.getMessage());
		} catch(NumeroNegativoException err) {
			System.out.println(err.getMessage());
		}
		
				
		System.out.println("Fim");
	}
}
