package n2exercici4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * - Exercici 4
    	Crea una llista que contingui algunes cadenes de text i nombres.
		Ordena-les per:
        	* Alfabèticament pel primer caràcter. (Nota: charAt(0) retorna el codi numèric del primer  caràcter) 
        	* Les cadenes que contenen una "e" primer, la resta de cadenes després. Posa el codi directament a la lambda.  
        	* Modifica tots els elements de la llista que tenen una ‘a’. Modifica la ‘a’ per un ‘4’.
        	* Mostra només els elements que són numèrics. (Encara que estiguin guardats com Strings).   
		 */

		
		List<String> llista = Arrays.asList("Ana", "febrer", "35", "13", "Fernando","Arturo","sabata","91");
		
		
		
		System.out.println("LLISTA ABANS D'ORDENAR");
		llista.stream().forEach(e -> System.out.print(e + "  "));
		
		//Ordre alfabètic
		llista.sort((n1,n2) -> n1.compareTo(n2) );
		
		
		System.out.println("\n\nLLISTA ORDENADA ALFABÈTICAMENT");
		llista.stream().forEach(e -> System.out.print(e + "  "));
		
		
		//Primer cadenes amb una e
		List <String> llista2 = new ArrayList<>();
		List <String> llista3 = new ArrayList<>();
		
		//2 llistes, una amb els que contenen e i altra amb els que no
		llista2 = llista
				.stream()
				.filter(e -> e.contains("e"))
				.collect(Collectors.toList());
		
		llista3 = llista
				.stream()
				.filter(e -> !e.contains("e"))
				.collect(Collectors.toList());
		
		//Afegim a llista2 els elements de llista3				
		llista2.addAll(llista3);
		
		System.out.println("\n\nLLISTA AMB ELS QUE CONTENEN 'E' PRIMER");
		llista2.stream().forEach(e -> System.out.print(e + "  "));
		
		System.out.println("\n\nLLISTA MODIFICANT LA 'a' per un 4");
		
		//Modificar la "a" per un 4
		llista2
			.stream()
			.map(e -> e.replace('a', '4'))
			.forEach(e -> System.out.print(e + "  "));
		
		System.out.println("\n\nLLISTA MOSTRANT ELS ELEMENTS NUMÉRICS");
		
		//Mostrar els elements numérics
		llista2
			.stream()
			.filter(e -> e.chars().allMatch(Character::isDigit))
			.forEach(e -> System.out.print(e + "  "));
		
	}

}
