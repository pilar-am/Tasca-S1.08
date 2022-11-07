package n1exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * - Exercici 1
			A partir d’una llista de Strings, escriu un mètode que retorna una llista de totes les cadenes 
			que contenen la lletra ‘o’. Imprimeix el resultat.

		 */
		
		List<String> llista = Arrays.asList("gener", "febrer", "març", "abril", "octubre","novembre");
		List<String> llista2 = new ArrayList<>();
               
        llista2 = llista
        		.stream()
        		.filter(e-> e.indexOf('o') != -1)
        		.collect(Collectors.toList());
        
        
        for (String s: llista2) {
        	System.out.println(s);
        }
		
	}

}
