package ejercicio2;

import java.util.stream.Stream;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		//PARTE A
		Stream<String> a = Stream.of("uno", "dos", "tres", "cuatro", "dos");
		a.forEach(n -> System.out.println(n));
		//PARTE B
		Stream<String> b = Stream.of("uno", "dos", "tres", "cuatro", "dos");
		b.sorted().forEach(n -> System.out.println(n));
		//PARTE C
		Stream<String> c = Stream.of("uno", "dos", "tres", "cuatro", "dos");
		c.map(String::toUpperCase).forEach(System.out::println);
		//PARTE D
		Stream<String> d = Stream.of("uno", "dos", "tres", "cuatro", "dos");
		d.filter(n -> n.startsWith("t")).forEach(System.out::println);
		//PARTE E
		Stream<String> e = Stream.of("uno", "dos", "tres", "cuatro", "dos");
		e.distinct().forEach(System.out::println);
		
	}
}