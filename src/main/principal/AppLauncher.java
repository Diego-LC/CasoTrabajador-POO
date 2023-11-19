package principal;
import modelo.Trabajador;

public class AppLauncher {

	public static void main(String[] args) {
		Trabajador trabajador = new Trabajador("NombreTrabajdor", "Apellido", "1555555","Fonasa", "Uno");
		trabajador.mostrarDatosTrabajador();
	}
}