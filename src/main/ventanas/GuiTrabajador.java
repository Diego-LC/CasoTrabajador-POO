package ventanas;
import ventanas.VentanaGenerica;
import modelo.Trabajador;

import javax.swing.*;
import java.awt.event.*;

public class GuiTrabajador extends VentanaGenerica{
	private JLabel textoMenu;
	private JButton boton;
	private Trabajador trabajador;

	public GuiTrabajador(Trabajador trabajador) {
		super("Nueva", 400, 400);
		this.trabajador = trabajador;
		generarTextoMenu();
		generarBotonSalir();
	}

	private void generarTextoMenu(){
		textoMenu = new JLabel("Bienvenido " + trabajador.getNombre());
		textoMenu.setBounds(50, 50, 100, 30);
		this.add(textoMenu);
	}

	private void generarBotonSalir(){
		this.boton = super.generarBoton("Salir", 50, 100, 100, 30);
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