package poo.polimorfismo;

public class Ingredientes {
	private double peso;

	public Ingredientes(double peso) {
		setPeso(peso);
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;
		}
		
	}
}
