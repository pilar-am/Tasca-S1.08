package n1exercici5;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		/*- Exercici 5
    		Crea una Functional Interface amb un m�tode anomenat getPiValue() que ha de retornar un double. 
    		Des del main() de la classe principal, inst�ncia la interf�cie i assigna-li el valor 3.1415. 
    		Invoca el m�tode getPiValue() i imprimeix el resultat.
		 */
		
		FuncionalInterface funcionalInterface = (value) -> value = value;
		
		System.out.println("El valor de PI es " + funcionalInterface.getPiValue(3.1415));
		
	}
	


}
