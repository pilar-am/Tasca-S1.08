package n1exercici3_4;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * - Exercici 3
    		Crea una llista amb els noms dels mesos de l�any. Imprimeix tots els elements de la llista amb una lambda.
		 */

		List<String> llista = Arrays.asList("gener", "febrer", "mar�", "abril", "maig","juny","juliol","agost","setembre","octubre","novembre","desembre");
		
		llista
			.stream()
			.forEach(e -> System.out.println(e));
		
		
		/*
		 * - Exercici 4
    		Fer la mateixa impressi� del punt anterior, per� mitjan�ant method reference. 
		 */
		
		System.out.println("\nImpressi� amb method reference");
		llista.stream().forEach(System.out::println);
		
	}

}
