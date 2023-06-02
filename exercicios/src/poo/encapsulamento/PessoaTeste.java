package poo.encapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setIdade(18);
		p1.setNome("Guilherme");
		
		System.out.println(p1.toString());
	}
}
