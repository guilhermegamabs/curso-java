package poo.encapsulamento;

public class Pessoa {
	private int idade;
	private String nome;

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "Meu nome é " + getNome() + " e tenho " + getIdade() + " anos!";
		
	}
}
