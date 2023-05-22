package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(4));
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s.startsWith("B"));
		System.out.println(s.length());
		System.out.println(s.endsWith("e"));
		System.out.println(s.equals("Boa Tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Guilherme";
		var sobrenome = "Gama";
		var idade = 18;
		var salario = 1234.231;
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.",
				nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.",
				nome, sobrenome, idade, salario);
		System.out.println(frase);

	}
}
