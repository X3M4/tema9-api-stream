package ejercicio1_final_c;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Espectador {

	private String nombre;
	private String telefono = null;

	private Espectador(String n, String t) {
		nombre = n;
		telefono = t;
	}
	
	public String getTelefono() {
		return this.telefono;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Espectador> lista = new ArrayList<>();
		lista.add(new Espectador("Mar", "9912345678"));
		lista.add(new Espectador("Santi", "9912342222"));
		lista.add(new Espectador("Alvarado", "9912345770"));
		lista.add(new Espectador("Violeta", "9912345678"));
		lista.add(new Espectador("Jaime", "9912345888"));
		lista.add(new Espectador("Paco", "9912345111"));
		lista.add(new Espectador("Ignacio", "11"));
		
		lista.stream()
				//APARTADO 1
				.map(tel -> tel.getTelefono())
				//APARTADO 2
				.filter(a -> a.length() == 10)
				//APARTADO 3
				.distinct()
				//APARTADO 4
				.sorted()
				//APARTADO 5
				.limit(3)
				//APARTADO 6
				.forEach(System.out::println);
				
	}
}
