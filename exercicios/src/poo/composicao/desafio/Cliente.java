package poo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	String nome;
	List<Compra> compras = new ArrayList<>();
	
	Cliente(String nome) {
		this.nome = nome;
	}
	
	double valorTotal() {
		double total = 0;
		
		for(Compra c: compras) {
			total += c.valorTotal();
		}
		
		return total;
	}
}
