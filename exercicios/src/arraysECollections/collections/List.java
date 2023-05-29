package arraysECollections.collections;

import java.util.ArrayList;

public class List {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Pedro"));
		lista.add(new Usuario("João"));
		lista.add(new Usuario("Matheus"));
		
		System.out.println(lista.get(3));
		lista.remove(1);
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}

	}
}
