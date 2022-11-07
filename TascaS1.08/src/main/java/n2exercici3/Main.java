package n2exercici3;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * - Exercici 3
    		Crea una Functional Interface que contingui un m�tode anomenat operacio(). 
    		Aquest m�tode ha de retornar un float. Injecta a la interf�cie creada mitjan�ant 
    		una lambda, el cos del m�tode, de manera que es pugui transformar l�operaci� amb una suma, 
    		una resta, una multiplicaci� i una divisi�.
		 */
		
		FuncionalOperacio funcionalOperacio = (num1, num2, operador) -> {
			
			float operacio = 0;
			if(operador.equalsIgnoreCase("suma")) {
				operacio = num1 + num2;
			}
			if(operador.equalsIgnoreCase("resta")) {
				operacio = num1 - num2;
			}
			if(operador.equalsIgnoreCase("multiplicaci�")) {
				operacio = num1 * num2;
			}
			if(operador.equalsIgnoreCase("divisi�")) {
				operacio = num1 / num2;
			}
			return operacio;
		};
		
		float resultat = funcionalOperacio.operacio(10,5 , "divisi�");
		
		System.out.println("El resultat es " + resultat);
		
	}

}
