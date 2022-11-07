package n1exercici6_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		
		/* - Exercici 6
    	Crea una llista amb nombres i cadenes de text i ordena la llista amb les cadenes 
    	de m�s curta a m�s llarga.
		 */

		ArrayList<String> nombresYStrings = new ArrayList<>();
		
		//Emplenem l'arrayList
		nombresYStrings.add("5");
		nombresYStrings.add("Anticonstitucionalment");
		nombresYStrings.add("Tetraclorobenzodiazepina");
		nombresYStrings.add("3");
		nombresYStrings.add("laboratori");
		nombresYStrings.add("sol");
		
		//El printem abans d'ordenar
		nombresYStrings.stream().forEach(System.out::println);
				
		System.out.println("\nARRAYLIST ORDENAT CADENA DE M�S CURTA A M�S LLARGA");
		nombresYStrings.sort((n1,n2)-> Integer.compare(n1.length(), n2.length()));
		nombresYStrings.stream().forEach(System.out::println);
		

		/*
		 * - Exercici 7
    		Amb la llista de l�exercici anterior, ara ordena-la al rev�s, de cadena m�s llarga a m�s curta.
		 */
		
		System.out.println("\nARRAYLIST ORDENAT CADENA DE M�S LLARGA A M�S CURTA");
		nombresYStrings.sort((n1,n2)-> - Integer.compare(n1.length(), n2.length()));
		nombresYStrings.stream().forEach(System.out::println);
		
		
	}

}
