public class Nodo {
	private int dato;
	private Nodo enlace;
	private double temperaturas;
	public Nodo() {
	}
	public Nodo(int dato) {
		this.dato = dato;
	}
	public int getDato() {
		return dato;
	}
	public void setDato(int dato) {
		this.dato = dato;
	}
	public Nodo getEnlace() {
		return enlace;
	}
	public void setEnlace(Nodo enlace) {
		this.enlace = enlace;
	}
	
	//CONSTRUCTOR Y GETTERS DE TEMPERATURAS 
	public Nodo (double temperaturas) {
		this.temperaturas = temperaturas;
	}
	public double getTemperaturas() {
		return temperaturas; 
	}
	public void setTemperaturas(double temperaturas) {
		this.temperaturas = temperaturas;
	}
	
}//Class

