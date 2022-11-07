package n3exercici1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * - Exercici 1
			Crea una classe Alumne amb els atributs: Nom, edat, curs i nota.

			Omple una llista amb 10 alumnes

		    Mostra per pantalla el nom i l’edat de cada alumne/a. 
		    Filtra la llista per tots els alumnes que el seu nom comença per ‘a’. Assigna a aquests alumnes 
		    	a una altra  llista i  mostra per pantalla la nova llista (tot  amb lambdes). 
		    Filtra i mostra per pantalla els alumnes que tenen una nota de 5 o superior. 
		    Filtra i mostra per pantalla els alumnes que tenen un nota de 5 o més, i que no són de PHP.  
		    Mostra tots els alumnes que fan JAVA i són majors d’edat.
		 */

		List<Alumne> alumnes = new ArrayList<>();
		
		//Omplir la llista
		alumnes.add(new Alumne("Miquel", 25, "PHP", 7));
		alumnes.add(new Alumne("Xavier", 17, "JAVA", 10));
		alumnes.add(new Alumne("Ander", 46, "JAVASCRIPT", 6));
		alumnes.add(new Alumne("Albert", 15, "PHP", 7));
		alumnes.add(new Alumne("Lucía", 54, "JAVA", 8));
		alumnes.add(new Alumne("Cristina", 23, "JAVASCRIPT", 3));
		alumnes.add(new Alumne("Pilar", 16, "PHP", 5));
		alumnes.add(new Alumne("María", 17, "JAVA", 6));
		alumnes.add(new Alumne("Angels", 25, "PHP", 9));
		alumnes.add(new Alumne("Raul", 30, "JAVA", 8));
		
		//Mostrar nom i edat dels alumnes
		System.out.println("NOM I EDAT DELS ALUMNES");
		for(Alumne a: alumnes) {
			System.out.println("Alumne: " + a.getNom() + " Edat: " + a.getEdat() + "anys.");
		}
		
		System.out.println("\nALUMNES QUE EL SEU NOM COMENÇA PER 'A'");
		
		//Llista alumnes que el seu nom comença per 'a'
		List<Alumne> alumnes2 = new ArrayList<>();
						
		alumnes2 = alumnes.stream()
			.filter(e -> e.getNom().charAt(0) == 'A')
			.collect(Collectors.toList());	
		
		for(Alumne e: alumnes2) {
			System.out.println(e.getNom());
		}
		
		System.out.println("\nALUMNES AMB LA NOTA >= 5");
		
		//Alumnes aprovats
		alumnes
			.stream()
			.filter(e -> e.getNota() >= 5)
			.forEach(System.out::println);
		
		System.out.println("\nALUMNES AMB LA NOTA >= 5 QUE NO FAN PHP");
		
		//Alumnes aprovats que no fan PHP
		alumnes
			.stream()
			.filter(e -> e.getNota() >= 5)
			.filter(e -> !e.getCurs().equals("PHP"))
			.forEach(System.out::println);
		
		
		System.out.println("\nALUMNES QUE FAN JAVA I SON MAJORS D'EDAT");
		
		//Alumnes majors d'edat que fan JAVA
		alumnes
		.stream()
		.filter(e -> e.getEdat() >= 18)
		.filter(e -> e.getCurs().equals("JAVA"))
		.forEach(System.out::println);
	}

}
