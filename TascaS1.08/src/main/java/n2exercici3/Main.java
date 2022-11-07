package n2exercici3;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * - Exercici 3
    		Crea una Functional Interface que contingui un mètode anomenat operacio(). 
    		Aquest mètode ha de retornar un float. Injecta a la interfície creada mitjançant 
    		una lambda, el cos del mètode, de manera que es pugui transformar l’operació amb una suma, 
    		una resta, una multiplicació i una divisió.
		 */
		
		FuncionalOperacio funcionalOperacio = (num1, num2, operador) -> {
			
			float operacio = 0;
			if(operador.equalsIgnoreCase("suma")) {
				operacio = num1 + num2;
			}
			if(operador.equalsIgnoreCase("resta")) {
				operacio = num1 - num2;
			}
			if(operador.equalsIgnoreCase("multiplicació")) {
				operacio = num1 * num2;
			}
			if(operador.equalsIgnoreCase("divisió")) {
				operacio = num1 / num2;
			}
			return operacio;
		};
		
		float resultat = funcionalOperacio.operacio(10,5 , "divisió");
		
		System.out.println("El resultat es " + resultat);
		
	}

}
