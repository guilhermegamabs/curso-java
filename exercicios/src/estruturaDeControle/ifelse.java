package estruturaDeControle;

import javax.swing.JOptionPane;

public class ifelse {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Informe o seu número");
		
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("Número é par");
		} else {
			System.out.println("Número é ímpar");
		}
	}
}
