package n1exercici8;


public class Main {

	public static void main(String[] args) {
		/*
		- Exercici 8
	    Crea una Functional Interface que contingui un m�tode anomenat reverse(). 
	    Aquest m�tode ha de rebre i ha de retornar un String. En el main() de la classe principal, 
	    injecta a la interf�cie creada mitjan�ant una lambda, el cos del m�tode, de manera que torni 
	    la mateixa cadena que rep com a par�metre per� al rev�s. Invoca la inst�ncia de la interf�cie 
	    passant-li una cadena i comprova si el resultat �s correcte.
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
