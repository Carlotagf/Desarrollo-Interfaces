package actividad5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblFormulario;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblEmail;
	private JLabel lblEdad;
	private JLabel lblTelefono;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textEmail;
	private JTextField textEdad;
	private JTextField textTelefono;
	private JButton btnAnadir;
	private JLabel lblError;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblFormulario());
		contentPane.add(getLblNombre());
		contentPane.add(getLblApellidos());
		contentPane.add(getLblEmail());
		contentPane.add(getLblEdad());
		contentPane.add(getLblTelefono());
		contentPane.add(getTextNombre());
		contentPane.add(getTextApellidos());
		contentPane.add(getTextEmail());
		contentPane.add(getTextEdad());
		contentPane.add(getTextTelefono());
		contentPane.add(getBtnAnadir());
		contentPane.add(getLblError());

	}

	private JLabel getLblFormulario() {
		if (lblFormulario == null) {
			lblFormulario = new JLabel("Formulario del alumno:");
			lblFormulario.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblFormulario.setBounds(123, 11, 195, 14);
		}
		return lblFormulario;
	}
	private JLabel getLblNombre() {
		if (lblNombre == null) {
			lblNombre = new JLabel("Nombre");
			lblNombre.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNombre.setBounds(74, 62, 72, 14);
		}
		return lblNombre;
	}
	private JLabel getLblApellidos() {
		if (lblApellidos == null) {
			lblApellidos = new JLabel("Apellidos");
			lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblApellidos.setBounds(74, 87, 59, 14);
		}
		return lblApellidos;
	}
	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email");
			lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblEmail.setBounds(74, 112, 46, 14);
		}
		return lblEmail;
	}
	private JLabel getLblEdad() {
		if (lblEdad == null) {
			lblEdad = new JLabel("Edad");
			lblEdad.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblEdad.setBounds(74, 137, 46, 14);
		}
		return lblEdad;
	}
	private JLabel getLblTelefono() {
		if (lblTelefono == null) {
			lblTelefono = new JLabel("Teléfono");
			lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblTelefono.setBounds(74, 162, 72, 14);
		}
		return lblTelefono;
	}
	private JTextField getTextNombre() {
		if (textNombre == null) {
			textNombre = new JTextField();
			textNombre.setBounds(160, 59, 158, 20);
			textNombre.setColumns(10);
		}
		return textNombre;
	}
	private JTextField getTextApellidos() {
		if (textApellidos == null) {
			textApellidos = new JTextField();
			textApellidos.setBounds(160, 84, 158, 20);
			textApellidos.setColumns(10);
		}
		return textApellidos;
	}
	private JTextField getTextEmail() {
		if (textEmail == null) {
			textEmail = new JTextField();
			textEmail.setBounds(160, 110, 158, 20);
			textEmail.setColumns(10);
		}
		return textEmail;
	}
	private JTextField getTextEdad() {
		if (textEdad == null) {
			textEdad = new JTextField();
			textEdad.setBounds(160, 135, 158, 20);
			textEdad.setColumns(10);
		}
		return textEdad;
	}
	private JTextField getTextTelefono() {
		if (textTelefono == null) {
			textTelefono = new JTextField();
			textTelefono.setBounds(160, 160, 158, 20);
			textTelefono.setColumns(10);
		}
		return textTelefono;
	}
	private JButton getBtnAnadir() {
		if (btnAnadir == null) {
			btnAnadir = new JButton("Añadir");
			btnAnadir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					agregarAlumno();
				}
			});
			btnAnadir.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnAnadir.setBounds(335, 227, 89, 23);
		}
		return btnAnadir;
	}
	private JLabel getLblError() {
		if (lblError == null) {
			lblError = new JLabel("No se pueden más de 5 alumnos");
			lblError.setForeground(new Color(255, 0, 0));
			lblError.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblError.setBounds(106, 204, 224, 14);
			lblError.setVisible(false);
		}
		return lblError;
	}
	
	private void agregarAlumno() {
		
		if(Principal.contador >= 5) {
			lblError.setVisible(true);
			return;
		}
		
		String nombre = getTextNombre().getText();
		String apellidos = getLblApellidos().getText();
		String email = getTextEmail().getText();
		int edad = Integer.valueOf(getTextEdad().getText());
		String telefono = getTextTelefono().getText();
		
		Alumno alumno = new Alumno (nombre, apellidos, email, edad, telefono);
		Principal.alumnos[Principal.contador] = alumno;
		Principal.contador ++;
	}
	
}
