package arraysECollections.collections;

import java.util.Set;
import java.util.TreeSet;

public class SetArrumado {
	public static void main(String[] args) {
		// Set<String> lista = new HashSet<String>();
		Set<String> lista = new TreeSet<String>();

		lista.add("Guilherme");
		lista.add("Carlos");
		lista.add("Ana");

		for(String candidato: lista) {
			System.out.println(candidato);
		}
	}
}
