package poo.composicao;

public class CarroTeste {
	public static void main(String[] args) {
		Carro c = new Carro();
		
		c.ligar();
		System.out.println(c.estaLigado());
		
		c.acelerar();
		System.out.println(c.motor.giros());
	}
}
