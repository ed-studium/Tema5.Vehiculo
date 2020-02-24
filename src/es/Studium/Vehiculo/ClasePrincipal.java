package es.Studium.Vehiculo;

public class ClasePrincipal {
	public static void main(String[] args) { 
		ClaseVista Vista = new ClaseVista();
		ClaseModelo Modelo = new ClaseModelo();
		new ClaseControlador(Vista, Modelo); 
	}
}