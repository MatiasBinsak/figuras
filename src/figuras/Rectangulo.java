package figuras;

public class Rectangulo {

	private double ancho;
	private double largo;

	public Rectangulo(double ancho, double largo) {
		this.ancho = ancho;
		this.largo = largo;
	}
	
	public Double calcularPerimetro() {
		return this.ancho*2 + this.largo*2;
	}
}
