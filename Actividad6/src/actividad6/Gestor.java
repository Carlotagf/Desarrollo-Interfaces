package actividad6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Gestor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnAgregar;
	private JButton btnEliminar;
	private JList<String> listTareasAnadidas;
	private DefaultListModel<String> modeloLista = new DefaultListModel<String>();
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
		addWindowListener(new Salir());
		setTitle("Gestor de Tareas");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
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
			btnAgregar.addActionListener(e -> anadirTarea());
			btnAgregar.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnAgregar.setBounds(273, 82, 89, 23);
		}
		return btnAgregar;
	}
	private JButton getBtnEliminar() {
		if (btnEliminar == null) {
			btnEliminar = new JButton("Eliminar");
			btnEliminar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					eliminarTarea();
				}
			});
			btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnEliminar.setBounds(273, 116, 89, 23);
		}
		return btnEliminar;
	}
	private JList<String> getListTareasAnadidas() {
		if (listTareasAnadidas == null) {
			listTareasAnadidas = new JList<String>(modeloLista);
			listTareasAnadidas.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(e.getClickCount() == 2) {
						int seleccionado = getListTareasAnadidas().getSelectedIndex();
						if(seleccionado != -1) {
							String mensaje = modeloLista.getElementAt(seleccionado);
							JOptionPane.showMessageDialog(rootPane, " Has hecho doble clic sobre la tarea: " + mensaje);
						}


					}
				}
			});
			listTareasAnadidas.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					if(e.getKeyCode() == KeyEvent.VK_DELETE) {
						eliminarTarea();
						
					}
				}
			});
			listTareasAnadidas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			listTareasAnadidas.setForeground(new Color(0, 0, 0));
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
			textNombreTarea.addActionListener(e -> anadirTarea());
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
			mntmSalir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int salir = JOptionPane.showConfirmDialog(rootPane, " ¿Deseas salir del programa? ", " Aceptar ", JOptionPane.YES_NO_OPTION);
					
					if (salir == JOptionPane.YES_OPTION) {
						System.exit(0);
					}
				}
			});
		}
		return mntmSalir;
	}
	
	private void anadirTarea() {
		String textNombreTarea = getTextNombreTarea().getText();
		
		if(!textNombreTarea.isBlank() && !textNombreTarea.isEmpty()) {
			modeloLista.addElement(textNombreTarea);
			getLblEstadoTarea().setText("Tarea añadida");
		}
	}
	
	private void eliminarTarea() {
		int seleccionado = getListTareasAnadidas().getSelectedIndex();
		
		if(seleccionado != -1) {
			modeloLista.removeElementAt(seleccionado);
			getLblEstadoTarea().setText("Tarea eliminada");
			
			
		}
		
	}
	
	
	
}







