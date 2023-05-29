package arraysECollections.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapp {
	public static void main(String[] args) {
		Map<Integer, String> users = new HashMap<Integer, String>();

		users.put(1, "Carlos");
		users.put(1, "Pedro");
		users.put(2, "Rafaela");

		System.out.println(users.size());
		System.out.println(users.isEmpty());
		
		System.out.println();
		
		System.out.println(users.keySet());
		System.out.println(users.values());
		System.out.println(users.entrySet());
		System.out.println(users.containsKey(2));
		System.out.println(users.containsValue("Pedro"));
		
		System.out.println();
		
		System.out.println(users.get(2));
		
		System.out.println();
		
		for(int chave: users.keySet()) {
			System.out.println(chave);
		}
		
		System.out.println();
		
		for(String valor: users.values()) {
			System.out.println(valor);
		}
		
		System.out.println();
		
		for (Entry<Integer, String> registro: users.entrySet()) {
			System.out.print(registro.getKey() + " ===> ");
			System.out.println(registro.getValue());
		}

	}
}
