public class Temperatura {
	Temperatura nodoInicio; 
	Temperatura nodoFin; 
	private byte fechaRegistro;
	private double temperaturas;
	private int dato;
	private Temperatura enlace;
	
	public Temperatura() {}
	public Temperatura (int dato) {
		this.dato = dato;
	}
	public int getDato() {
		return dato;
	}
	public void setDato(int dato) {
		this.dato = dato;
	}
	public Temperatura getEnlace() {
		return enlace;
	}
	public void setEnlace(Temperatura enlace) {
		this.enlace = enlace;
	}
	
	public Temperatura( double temperaturas) {
		this.temperaturas = temperaturas;
	}
	public double getTemperaturas() {
		return temperaturas; 
	}
	public void setTemperaturas(double temperaturas) {
		this.temperaturas = temperaturas;
	}
	
	public Temperatura( byte fechaRegistro) {
		this.fechaRegistro = fechaRegistro; 
	}
	public byte getFechaRegistro() {
		return fechaRegistro; 
	}
	public void setFechaRegistro(byte fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public void agregarTemps(double temp) {
		Temperatura nodoNuevo = new Temperatura(temp);
		if (nodoInicio == null) {
		nodoFin = nodoInicio = nodoNuevo;
		}else {
			nodoNuevo.setEnlace(nodoInicio);
			nodoInicio = nodoNuevo;
		}	
	}
	public void agregarFechaReg(byte fecha) {
		Temperatura nodoNuevo = new Temperatura( fecha);
		if (nodoInicio == null) {
		nodoFin = nodoInicio = nodoNuevo;
		}else {
			nodoNuevo.setEnlace(nodoInicio);
			nodoInicio = nodoNuevo;
		}	
	}
	public void mostrarTodasTemperaturas() {
		Temperatura nodoActual = nodoInicio;
		while (nodoActual != null) {
			System.out.print("["+nodoActual.getTemperaturas()+"]");
			nodoActual = nodoActual.getEnlace();
			}
		}//MostrarTotalTemperaturas
	public void mostrarTemp_Registro() {
		Temperatura nodoActual = nodoInicio;
		while (nodoActual != null) {
			if(nodoActual.getTemperaturas()<=10 ) {
				System.out.print("["+ nodoActual.getTemperaturas()+"--> Congelación]");
			}else if(nodoActual.getTemperaturas() <= 20) {
				System.out.print("["+ nodoActual.getTemperaturas()+"--> Frio]");
			}else if(nodoActual.getTemperaturas()<=30) {
				System.out.print("["+ nodoActual.getTemperaturas()+"--> Normal]");
			}else if(nodoActual.getTemperaturas()>31) {
				System.out.print("["+ nodoActual.getTemperaturas()+"--> Alta]");
			}
			nodoActual = nodoActual.getEnlace();
	      }
	}
}
