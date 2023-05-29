package arraysECollections.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stackk {
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("Camões");
		livros.push("A Espada do Destino");
		livros.push("Brás Cubas");
		
		System.out.println(livros.peek());
		System.out.println(livros.poll());
		System.out.println(livros.peek());
	}
}
