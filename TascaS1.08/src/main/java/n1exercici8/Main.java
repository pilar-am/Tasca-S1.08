package n1exercici8;


public class Main {

	public static void main(String[] args) {
		/*
		- Exercici 8
	    Crea una Functional Interface que contingui un mètode anomenat reverse(). 
	    Aquest mètode ha de rebre i ha de retornar un String. En el main() de la classe principal, 
	    injecta a la interfície creada mitjançant una lambda, el cos del mètode, de manera que torni 
	    la mateixa cadena que rep com a paràmetre però al revés. Invoca la instància de la interfície 
	    passant-li una cadena i comprova si el resultat és correcte.
		 */

		FuncionalReverse funcionalReverse = (cadena) -> {
			String stringReverse = "";
			
			StringBuilder stringBuilder = new StringBuilder(cadena);
			stringReverse = stringBuilder.reverse().toString();
			
			return stringReverse;
		};
		
		String frase = "Crea una Functional Interface";
		
		System.out.println("FRASE: " + frase);
		System.out.println("\nFRASE INVERTIDA: " + funcionalReverse.reverse(frase));
		

		
		
		
	}

}
