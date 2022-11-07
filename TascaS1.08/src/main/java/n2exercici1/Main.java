package n2exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * - Exercici 1
			Crea una llista de cadenes amb noms propis. Escriu un mètode que retorna una llista 
			de totes les cadenes que comencen amb la lletra 'A' (majúscula) i  tenen exactament 
			3 lletres. Imprimeix el resultat. 
		 */
		
		List<String> noms = Arrays.asList("Ana","Alex","Fernando","Silvia","Begoña","Ada", "Zoe");
		List<String> nomsA = new ArrayList<>();
		
		nomsA = noms
				.stream()
				.filter(e -> e.length() == 3)
				.filter(e -> e.charAt(0) == 'A')
				.collect(Collectors.toList());
        
		for (String s: nomsA) {
        	System.out.println(s);
        }
		
	}

}
