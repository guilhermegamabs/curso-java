package arraysECollections.collections;

import java.util.HashSet;

public class HashCodee {
	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Carlos"));
		usuarios.add(new Usuario("Guilherme"));
		usuarios.add(new Usuario("Ana"));
		
		boolean resultado = usuarios.contains(new Usuario("Guilherme"));
		System.out.println(resultado);
	}
}
