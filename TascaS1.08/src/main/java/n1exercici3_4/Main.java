package n1exercici3_4;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * - Exercici 3
    		Crea una llista amb els noms dels mesos de l’any. Imprimeix tots els elements de la llista amb una lambda.
		 */

		List<String> llista = Arrays.asList("gener", "febrer", "març", "abril", "maig","juny","juliol","agost","setembre","octubre","novembre","desembre");
		
		llista
			.stream()
			.forEach(e -> System.out.println(e));
		
		
		/*
		 * - Exercici 4
    		Fer la mateixa impressió del punt anterior, però mitjançant method reference. 
		 */
		
		System.out.println("\nImpressió amb method reference");
		llista.stream().forEach(System.out::println);
		
	}

}
