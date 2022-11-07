package n1exercici1_2;

public class TreballadorPresencial extends Treballador{

	private static double benzina = 100;
	
	public TreballadorPresencial(String nom, String cognom, double preu_hora) {
		super(nom, cognom, preu_hora);
		
	}

	@Override
	public double calcularSou(double horesTreballades) {
		
		double sou = horesTreballades * getPreu_hora();
		
		return sou + benzina;
	}

	@Override
	public String toString() {
		return "TreballadorPresencial [getNom()=" + getNom() + ", getCognom()=" + getCognom() + ", getPreu_hora()="
				+ getPreu_hora() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
}
