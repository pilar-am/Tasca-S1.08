package n1exercici1_2;

public class TreballadorOnline extends Treballador{

	private static final double PREUTARIFAPLANA= 200;
	
	
	public TreballadorOnline(String nom, String cognom, double preu_hora) {
		super(nom, cognom, preu_hora);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSou(double horesTreballades) {
		
		double sou = horesTreballades * getPreu_hora();
		
		return sou + PREUTARIFAPLANA;
	}

	@Override
	public String toString() {
		return "TreballadorOnline [getNom()=" + getNom() + ", getCognom()=" + getCognom() + ", getPreu_hora()="
				+ getPreu_hora() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	@Deprecated
	public void metodeObsoletTreballadorOnline() {
		System.out.println("Métode obsolet a la classe TreballadorOnline");
	}
}
