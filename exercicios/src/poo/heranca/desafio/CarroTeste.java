package poo.heranca.desafio;

public class CarroTeste {
	public static void main(String[] args) {
		Carro carro = new Carro(80);
		Civic civic = new Civic();
		Ferrari ferrari = new Ferrari();
		
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();

		civic.acelerar();
		civic.acelerar();
		civic.acelerar();

		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();

		System.out.println(carro.velocidadeAtual);
		System.out.println(civic.velocidadeAtual);
		System.out.println(ferrari.velocidadeAtual);
		
		System.out.println();
		System.out.println("Freiando...");
		System.out.println();
		
		carro.frear();
		carro.frear();

		civic.frear();
		civic.frear();
		
		ferrari.frear();
		ferrari.frear();
		
		System.out.println("Carro " + carro.velocidadeAtual);
		System.out.println("Civic " + civic.velocidadeAtual);
		System.out.println("Ferrari " + ferrari.velocidadeAtual);

	}
}
