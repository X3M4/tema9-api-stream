package ejercicio5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PARTE A
		System.out.println("PARTE A");
		List<Integer> l = Arrays.asList(1,2,3,4,5);
		List<Integer> l2 = l.stream()
				.map(d -> (int)Math.pow(d, 2))
				.collect(Collectors.toList());
		for(Integer i: l2) System.out.println(i);
		
		//PARTE B
		System.out.println("PARTE B");
		List<Integer> lb1 = Arrays.asList(1,2,3);
		List<Integer> lb2 = Arrays.asList(3,4);
		List<int[]> lb3 =  lb1.stream()
				.flatMap(a -> lb2.stream()
						.map(b -> new int[] {a,b}))
				.collect(Collectors.toList());
		for(int[] i: lb3) System.out.println(Arrays.toString(i));
		//PARTE C
		System.out.println("PARTE C");
		List<Integer> lc1 = Arrays.asList(1,2,3);
		List<Integer> lc2 = Arrays.asList(3,4);
		List<int[]> lc3 =  lc1.stream()
				.flatMap(a -> lc2.stream()
						.map(b -> new int[] {a,b}))
				.filter(tupla -> (tupla[0] + tupla[1]) % 3 == 0)
				.collect(Collectors.toList());
		for(int[] i: lc3) System.out.println(Arrays.toString(i));
				
	}
}