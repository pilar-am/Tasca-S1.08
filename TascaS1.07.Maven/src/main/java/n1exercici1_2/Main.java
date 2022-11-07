package n1exercici1_2;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * - Exercici 1

		Crea una jerarquia d’objectes amb tres classes:  Treballador, TreballadorOnline i TreballadorPresencial.

		La classe Treballador té els atributs nom, cognom, preu/hora, i el mètode calcularSou() que rep per 
		paràmetre el nombre d'hores treballades i el multiplica pel preu/hora. Les classes filles l'han de 
		sobreescriure,  emprant @Override. 

		Des del main() de la classe Principal, fes les invocacions necessàries per demostrar el funcionament 
		de l’anotació @Override.

		En els treballadors presencials, el mètode per calcular el seu sou, rebrà per paràmetre el nombre 
		d’hores treballades al mes. A l’hora de calcular el sou es multiplicarà el nombre d’hores treballades 
		pel preu/hora, més el valor d'un atribut static anomenat benzina que afegirem en aquesta classe.

		En els treballadors online, el mètode per calcular el seu sou rebrà per paràmetre el nombre d'hores 
		treballades al mes. A l'hora de calcular el sou es multiplicarà el nombre d'hores treballades pel preu/hora 
		i se li sumarà el preu de la tarifa plana d'Internet, que serà una constant de la classe TreballadorOnline.
		 */

		
		Treballador treballador1 = new Treballador("Fernando","Campos",15.3);
		
		TreballadorOnline treballador2 = new TreballadorOnline("Anna","Fortuny",15.3);
		
		TreballadorPresencial treballador3 = new TreballadorPresencial("Oscar","Sánchez",15.3);
				
		System.out.println("Sou del treballador1: " + treballador1.calcularSou(40));
		System.out.println("Sou del treballador2: " + treballador2.calcularSou(40));
		System.out.println("Sou del treballador3: " + treballador3.calcularSou(40));
				
		
		
		/*
		 * - Exercici 2

		Afegeix a les classes filles alguns mètodes obsolets (deprecated), i utilitza l’anotació corresponent. 
		Invoca des d'una classe externa els mètodes obsolets, suprimint mitjançant l'anotació corresponent els 
		“warnings” per ser obsolets.
		 */
		
		TreballadorOnlineDeprecated treballador4 = new TreballadorOnlineDeprecated("Pilar","Fortuny",15.3);
		treballador4.metodeObsoletTreballadorOnline();

	}

}
