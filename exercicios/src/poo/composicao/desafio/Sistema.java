package poo.composicao.desafio;

public class Sistema {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Guilherme");
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 1.99, 200);
	}

}
