package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		Stream<String> langs = Stream.of("Java", " Lua", " Js\n");
		langs.forEach(print);
		
		String[] maisLangs = { "Python ", " JavaScript", " C#\n" };
		
		Stream.of(maisLangs).forEach(print);
		
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 2).forEach(print);
		
		List<String> outrasLangs = Arrays.asList(" C ", " PHP");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		// Stream.generate(() -> "a").forEach(print);
	}
}
