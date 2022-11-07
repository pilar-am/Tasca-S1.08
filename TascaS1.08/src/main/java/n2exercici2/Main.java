package n2exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * - Exercici 2
    		Programa un mètode que retorna una cadena separada per comes, 
    		basada en una llista d’Integers. Cada element ha d’anar precedit per lletra “e” 
    		si el nombre és parell, o per la lletra “o” si el nombre és imparell. 
    		Per exemple, si la llista d’entrada és (3, 55, 44), la sortida 
    		ha de ser “o3, o55, e44”. Imprimeix el resultat.
		 */

		List<Integer> nombres = Arrays.asList(3,55,44,80,27);
		List<String> nombres2 = new ArrayList<>();
				
		
		parellImparell(nombres,nombres2);
		
        for (String s: nombres2) {
        	System.out.println(s);
        }
        
	}
	
	static void parellImparell(List<Integer> nombres, List<String> nombres2) {
        for (Integer s: nombres) {
        	if(s%2 == 0) {
        		nombres2.add("e"+s);
        	}else {
        		nombres2.add("o"+s);
        	}
        	
        }
	}

}
