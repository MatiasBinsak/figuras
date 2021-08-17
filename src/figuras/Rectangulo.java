package figuras;

public class Rectangulo {

	private double ancho;
	private double largo;

	public Rectangulo(double ancho, double largo) {
		this.ancho = ancho;
		this.largo = largo;
	}

	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", largo=" + largo + "]";
	}
}
