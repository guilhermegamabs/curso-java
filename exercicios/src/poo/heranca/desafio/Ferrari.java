package poo.heranca.desafio;

public class Ferrari extends Carro{
	
	Ferrari() {
		super(250);
	}
	
	boolean acelerar() {
		boolean acelerar1 = super.acelerar();
		boolean acelerar2 = super.acelerar();
		boolean acelerar3 = super.acelerar();

		return acelerar1 || acelerar2 || acelerar3;
	}
}
