package actividad6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Gestor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnAgregar;
	private JButton btnEliminar;
	private JList listTareasAnadidas;
	private JLabel lblEstadoTarea;
	private JTextField textNombreTarea;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenuItem mntmSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gestor frame = new Gestor();
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
	public Gestor() {
		setTitle("Gestor de Tareas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 310);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnAgregar());
		contentPane.add(getBtnEliminar());
		contentPane.add(getListTareasAnadidas());
		contentPane.add(getLblEstadoTarea());
		contentPane.add(getTextNombreTarea());

	}
	private JButton getBtnAgregar() {
		if (btnAgregar == null) {
			btnAgregar = new JButton("Agregar");
			btnAgregar.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnAgregar.setBounds(273, 82, 89, 23);
		}
		return btnAgregar;
	}
	private JButton getBtnEliminar() {
		if (btnEliminar == null) {
			btnEliminar = new JButton("Eliminar");
			btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnEliminar.setBounds(273, 116, 89, 23);
		}
		return btnEliminar;
	}
	private JList getListTareasAnadidas() {
		if (listTareasAnadidas == null) {
			listTareasAnadidas = new JList();
			listTareasAnadidas.setForeground(new Color(255, 255, 255));
			listTareasAnadidas.setBackground(new Color(255, 255, 255));
			listTareasAnadidas.setBounds(10, 59, 211, 138);
		}
		return listTareasAnadidas;
	}
	private JLabel getLblEstadoTarea() {
		if (lblEstadoTarea == null) {
			lblEstadoTarea = new JLabel("New label");
			lblEstadoTarea.setForeground(new Color(255, 255, 255));
			lblEstadoTarea.setBackground(new Color(0, 0, 0));
			lblEstadoTarea.setBounds(10, 219, 211, 23);
		}
		return lblEstadoTarea;
	}
	private JTextField getTextNombreTarea() {
		if (textNombreTarea == null) {
			textNombreTarea = new JTextField();
			textNombreTarea.setBounds(10, 23, 211, 20);
			textNombreTarea.setColumns(10);
		}
		return textNombreTarea;
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnArchivo());
		}
		return menuBar;
	}
	private JMenu getMnArchivo() {
		if (mnArchivo == null) {
			mnArchivo = new JMenu("Archivo");
			mnArchivo.add(getMntmSalir());
		}
		return mnArchivo;
	}
	private JMenuItem getMntmSalir() {
		if (mntmSalir == null) {
			mntmSalir = new JMenuItem("Salir");
		}
		return mntmSalir;
	}
}
