package classe.desafios;

public class Jantar {
	public static void main(String[] args) {
		Comida c1 = new Comida("Arroz", 0.234);
		Comida c2 = new Comida("Feijão", 0.390);
		
		Pessoa p = new Pessoa("João", 79.80);
		p.comer(c1);
		
		System.out.println(p.apresentar());
	}
}
