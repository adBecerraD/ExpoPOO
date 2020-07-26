<<<<<<< HEAD
<<<<<<< HEAD
/*
 * NOMBRE: VENTANA DEL PROGRAMA
 * AUTORES: ANDRÉS BECERRA  Y FELIPE CHAVEZ
 * FECHA: 25 DE JULIO DE 2020
 */
=======
>>>>>>> 9e88f9a01d9c14f1615df2dcaead61105678e62b
=======
>>>>>>> 9e88f9a01d9c14f1615df2dcaead61105678e62b
package ejemplo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
<<<<<<< HEAD
<<<<<<< HEAD
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class Ventana extends JFrame {

	//DECLARANDO ATRIBUTOS 
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JButton btnAñadir;
	private JButton btnSalir;
	private JComboBox comboBox;
	
	//SE CREAN MATRICES QUE CONTIENE LA HORA, PACIENTES Y TÍTULO DE CADA COLUMNA PARA UNA TABLA
	String[][] paciente = new String [6][2];
	String[] titulo = new String[2];

	//MÉTODO POR CONSTRUCTOR
	public Ventana() {
		
		//AL CERRA LA VENTAA TAMBIÉN TERMINA EL PROCESO EN CONSOLA
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 315, 576);
		
		//SE CREA UN PANEL Y SE LE DA UN TAMAÑO, POSICIÓN Y SE AÑADE A LA VENTANA
=======
=======
>>>>>>> 9e88f9a01d9c14f1615df2dcaead61105678e62b
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 284);
<<<<<<< HEAD
>>>>>>> 9e88f9a01d9c14f1615df2dcaead61105678e62b
=======
>>>>>>> 9e88f9a01d9c14f1615df2dcaead61105678e62b
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
<<<<<<< HEAD
<<<<<<< HEAD
		//SE CREA UN LABEL CON EL TÍTULO DEL PROGRAMA
		JLabel lblHorarioViernes = new JLabel("Horario Viernes");
		lblHorarioViernes.setBounds(105, 28, 134, 15);
		contentPane.add(lblHorarioViernes);
		
		//SE CREA UN SCROLL PANEL QUE VA A CONTENER LA TABLA
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 79, 266, 331);
		contentPane.add(scrollPane);
		
		//SE LE ASIGNAN LOS TÍTULOS AL VECTOR TÍTULOS
		titulo[0] = "Horario";
		titulo[1] = "Paciente";
		
		//SE LLENA UNA COLUMNA CON LAS ORAS DE LAS CITAS DISPOBIBLES
		paciente[0][0] = "6 - 8";
		paciente[1][0] = "8 - 10";
		paciente[2][0] = "10 - 12";
		paciente[3][0] = "14 - 16";
		paciente[4][0] = "16 - 18";
		paciente[5][0] = "18 - 20";
		
		//SE CREA UNA TABLA, SE LE PASAN LAS MATRICES ANTERIORES Y SE DA PASO A VERLA DESDE EL SCROLL PANEL
		table = new JTable();
		table.setModel(new DefaultTableModel(paciente,titulo));
		table.setBounds(0, 0, 177, 310);
		table.setRowHeight(57);
		scrollPane.setViewportView(table);
		
		//SE CREA LABEL CON LA PALABRA PACIENTE
		JLabel lblPaciente = new JLabel("Paciente:");
		lblPaciente.setBounds(12, 445, 81, 15);
		contentPane.add(lblPaciente);
		
		//SE CREA LABEL CON LA PAALBRA HORARIO
		JLabel lblHorario = new JLabel("Horario: ");
		lblHorario.setBounds(65, 474, 70, 15);
		contentPane.add(lblHorario);
		
		//SE CREA COMBOBOX QUE CONTEINE LOS HORARIOS DE LAS CITAS
		comboBox = new JComboBox();
		comboBox.setBounds(153, 474, 103, 19);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"6 - 8", "8 - 10", "10 - 12", "14 - 16", "16 - 18"}));
		contentPane.add(comboBox);
		
		//SE CREA BOTÓN DE AÑADIR PARA AGENTAR CITA
		btnAñadir = new JButton("Añadir");
		btnAñadir.setBounds(31, 512, 117, 25);
		contentPane.add(btnAñadir);
		
		//SE CREA UN BOTÓN DE SALIDA
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(163, 512, 117, 25);
		contentPane.add(btnSalir);
		
		//SE CREA UN TEXTFIELD PARA OBTENER EL NOMBRE DEL PACIENTE
		textField = new JTextField();
		textField.setBounds(97, 443, 200, 19);
		contentPane.add(textField);
		textField.setColumns(10);
	}
	
	//MÉTODO QUE RECARGA LA TABLA YA MODIFICADA
	public void llenarHorario() {
		table.setModel(new DefaultTableModel(paciente,titulo));
	}
	
	//MÉTODOS GETTER Y SETTER
	public JTable getTable() {
		return table;
	}

	public JTextField getTextField() {
		return textField;
	}

	public JButton getBtnAñadir() {
		return btnAñadir;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}
	
=======
=======
>>>>>>> 9e88f9a01d9c14f1615df2dcaead61105678e62b
		JLabel lblTítulo = new JLabel("Horario");
		lblTítulo.setBounds(192, 12, 70, 15);
		contentPane.add(lblTítulo);
		
	    Object titulos []={"Encabezado 1", "Encabezado 2"};
	    Object celdas [][]=new Object[4][2];
	    JScrollPane scroll = new JScrollPane();
	    JTable tabla=new JTable(celdas, titulos);
	    
			
		
		table.setBounds(0, 39, 714, 96);
		contentPane.add(table);
	}
<<<<<<< HEAD
>>>>>>> 9e88f9a01d9c14f1615df2dcaead61105678e62b
=======
>>>>>>> 9e88f9a01d9c14f1615df2dcaead61105678e62b
}
