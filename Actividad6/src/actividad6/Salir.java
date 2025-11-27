package actividad6;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class Salir extends WindowAdapter {
	
	@Override
	public void windowClosing(WindowEvent e) {
		int salir = JOptionPane.showConfirmDialog(e.getComponent(), " ¿Deseas salir del programa? ", " Aceptar ", JOptionPane.YES_NO_OPTION);
		
		if (salir == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	
	
	

}
