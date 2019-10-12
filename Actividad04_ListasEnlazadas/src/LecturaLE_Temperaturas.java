import java.util.Scanner;
public class LecturaLE_Temperaturas {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		byte opc = 0; 
		byte opc2 = 0; 
		ListaTemperaturas lt = new ListaTemperaturas();
		lt.agregarTemperaturas(5);
		lt.agregarTemperaturas(15);
		lt.agregarTemperaturas(25);
		lt.agregarTemperaturas(35);
		lt.agregarTemperaturas(45);
		lt.agregarTemperaturas(90);
		lt.agregarTemperaturas(23);
		lt.agregarTemperaturas(42);
		System.out.println("[========== TEMPERATURAS ==========]");
		System.out.println("Elija una Opción:\n1)Temperaturas Estaticas.\n2)Ingresar Temperaturas.");
		opc = e.nextByte(); 
		switch (opc) {
		case 1:
			System.out.println("[========== TEMPERATURAS ESTATICAS ==========]");
			System.out.println("Eija una Opción:\n1)Mostrar total de Temperaturas.\n2)Mostrar promedio de Temperaturas.");
			opc2 = e.nextByte(); 
		switch (opc2) {
		case 1:
			lt.mostrarTodasTemperaturas();
			break;
		case 2:
			lt.mostrarTemperaturas();
			break;
		default:System.out.println("No esta en las opciones.");
			break;
		}//Temperaturas Estaticas
			break;
		case 2: System.out.println("Ingrese los límites: (1-100): ");
		     Temperatura t1 = new Temperatura();
		     int te1 = 0, t2 = 0, t3 = 0, t4 = 0, t5 = 0;
		     te1 = e.nextInt();
		     t2 = e.nextInt();
		     t3 = e.nextInt();
		     t4 = e.nextInt();
		     t5 = e.nextInt();
		     t1.agregarTemps(te1);
		     t1.agregarTemps(t2);
		     t1.agregarTemps(t3);
		     t1.agregarTemps(t4);
		     t1.agregarTemps(t5);
		     System.out.println("RESULTADOS: ");
		     t1.mostrarTemp_Registro();
			break;
		default:System.out.println("No se encuentra en la lista.");
			break;
		}//	
		e.close();
	}//main
}//class
