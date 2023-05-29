package arraysECollections.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queuee {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();

		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Pedro");
		fila.offer("Daniel");
		fila.offer("João");

		for (String pessoa : fila) {
			System.out.println(pessoa);
		}
		
		System.out.println();
		
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		System.out.println();
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		System.out.println();

		for (String pessoa : fila) {
			System.out.println(pessoa);
		}

	}
}
