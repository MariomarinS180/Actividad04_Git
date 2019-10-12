public class ListaTemperaturas {
	Nodo nodoInicio;
	Nodo nodoFin;
	public void agregarTemperaturas(double temperatura) {
		Nodo nodoNuevo = new Nodo(temperatura);
		if (nodoInicio == null) {
		nodoFin = nodoInicio = nodoNuevo;
		}else {
			nodoNuevo.setEnlace(nodoInicio);
			nodoInicio = nodoNuevo;
		}	
	}
	public void mostrarTemperaturas() {
		Nodo nodoActual = nodoInicio;
		while (nodoActual != null) {
			if(nodoActual.getTemperaturas() <=10 ) {
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
}//Mostrar Temperatura
	public void mostrarTodasTemperaturas() {
		Nodo nodoActual = nodoInicio;
		while (nodoActual != null) {
			System.out.print("["+nodoActual.getTemperaturas()+"]");
			nodoActual = nodoActual.getEnlace();
			}
		}//MostrarTotalTemperaturas
}//class ListaTemperaturas
