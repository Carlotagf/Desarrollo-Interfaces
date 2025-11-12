package actividad5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Formulario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre\r\n");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombre.setBounds(92, 69, 70, 39);
		contentPane.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apelllidos");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblApellidos.setBounds(92, 104, 70, 39);
		contentPane.add(lblApellidos);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail.setBounds(92, 138, 70, 39);
		contentPane.add(lblEmail);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEdad.setBounds(92, 174, 70, 39);
		contentPane.add(lblEdad);
		
		JLabel lblTelefono = new JLabel("Teléfono");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTelefono.setBounds(92, 209, 70, 39);
		contentPane.add(lblTelefono);
		
		textField = new JTextField();
		textField.setBounds(149, 78, 162, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(149, 113, 162, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(149, 147, 162, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(149, 183, 162, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(149, 218, 162, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblFormulario = new JLabel("Formulario del alumno:");
		lblFormulario.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFormulario.setBounds(149, 26, 219, 29);
		contentPane.add(lblFormulario);
		
		
		JButton btnAnadir = new JButton("Añadir");
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				añadirAlumno();
			}
		});
		btnAnadir.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAnadir.setBounds(369, 276, 89, 23);
		contentPane.add(btnAnadir);
		
		JLabel lbError = new JLabel("No se pueden más de 5");
		lbError.setBackground(new Color(240, 240, 240));
		lbError.setForeground(new Color(255, 0, 0));
		lbError.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbError.setBounds(159, 259, 179, 14);
		contentPane.add(lbError);
		lbError.setVisible(false);
		
		

	}
}
