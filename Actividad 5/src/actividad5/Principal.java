package actividad5;

import java.awt.EventQueue;

public class Principal {
	
	public static Alumno[] alumnos = new Alumno[5];
    public static int contador = 0;

    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
