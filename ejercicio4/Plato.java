package ejercicio4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Plato {
	
	public static enum Tipo{CARNE, PESCADO, OTRO};
	private final String nombre;
	private final boolean vegano;
	private final int calorias;
	private final Tipo tipo;
		
	public Plato (String nombre, boolean vegano, int calorias , Plato.Tipo t){
		this.nombre= nombre;
		this.vegano= vegano;
		this.calorias= calorias;
		this.tipo= t;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean esVegano() {
		return vegano;
	}

	public int getCalorias() {
		return calorias;
	}

	public Tipo getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
	public static void main(String[] args) {
		List<Plato> menu = Arrays.asList(
				new Plato("cerdo", false, 800, Plato.Tipo.CARNE),
				new Plato("cordero", false, 700, Plato.Tipo.CARNE),
				new Plato("pollo", false, 400, Plato.Tipo.CARNE),
				new Plato("patatas fritas", true, 530, Plato.Tipo.CARNE),
				new Plato("arroz", true, 350, Plato.Tipo.OTRO),
				new Plato("fruta de temporada", true, 120, Plato.Tipo.OTRO),
				new Plato("pizza", true, 550, Plato.Tipo.OTRO),
				new Plato("trucha", false, 300, Plato.Tipo.PESCADO),
				new Plato("salmón", false, 450, Plato.Tipo.PESCADO)
				);
		
		List<Plato> platos = menu.stream()
				.collect(Collectors.toList());
		
		int cantidad = platos.stream()
				.map(p -> 1)
				.reduce(0, (total, elementos) -> total + elementos );
				
		System.out.println(cantidad);		
				
				
	}
}

