package n1exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * - Exercici 2
			Has de fer el mateix que en el punt anterior, però ara, el mètode ha de retornar 
			una llista amb els Strings que a més de contenir la lletra ‘o’ també tenen més de 5 lletres. 
			Imprimeix el resultat.
		 */
		
		List<String> llista = Arrays.asList("gener", "febrer", "març", "abril", "octubre","novembre", "hola");
		List<String> llista2 = new ArrayList<>();
               
        llista2 = llista
        		.stream()
        		.filter(e-> e.indexOf('o') != -1)
        		.filter(e -> e.length() > 5)
        		.collect(Collectors.toList());
        
        
        for (String s: llista2) {
        	System.out.println(s);
        }
		
	}

}
