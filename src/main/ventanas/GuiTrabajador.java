package ventanas;
import ventanas.VentanaGenerica;
import modelo.Trabajador;

import javax.swing.*;
import java.awt.event.*;

public class GuiTrabajador extends VentanaGenerica{
	private JButton boton;
	private Trabajador trabajador;

	public GuiTrabajador(Trabajador trabajador) {
		super("Nueva", 400, 400);
		this.trabajador = trabajador;
		generarTextoMenu();
		generarBotonSalir();
	}

	private void generarTextoMenu(){
		String textoNombre = "Trabajador: " + this.trabajador.getNombre();
		String textoApellido = "Trabajador: " + this.trabajador.getApellido();
		String textoAfp = "Afp: " + this.trabajador.getAfp();
		String textoIsapre = "Isapre: " + this.trabajador.getIsapre();
		super.generarJLabel(null, textoNombre, 100,50,300,50);
		super.generarJLabel(null, textoApellido, 100,90,300,50);
		super.generarJLabel(null, textoAfp, 100,130,300,50);
		super.generarJLabel(null, textoIsapre, 100,170,300,50);
	}

	private void generarBotonSalir(){
		this.boton = super.generarBoton("Salir", 140, 300, 100, 30);
		this.add(this.boton);
		this.boton.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.boton) {
			this.dispose();
			System.exit(0);
		}
	}
}