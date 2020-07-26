<<<<<<< HEAD
<<<<<<< HEAD
/*
 * NOMBRE: CONTROLADOR DE ACCIONES
 * AUTORES: ANDRÉS BECERRA  Y FELIPE CHAVEZ
 * FECHA: 25 DE JULIO DE 2020
 */
package ejemplo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import ejemplo.Ventana;
import ejemplo.Secretario;

public class Controlador {
	
	//SE CREA OBJETOS DE LAS DOS DIFERENTES CLASES
	Ventana vista;
	Secretario secretario;
	
	//MÉTODO CONSTRUCTOR
	public Controlador(Ventana vista,Secretario secretario) {
		
		this.vista = vista;
		this.secretario = secretario;
		
		//SE CREA OBJETO QUE MANEJA LOS EVENTOS
		ManejadorEventos me = new ManejadorEventos();
		
		//SE AÑADEN ACCIONES PARA LOS BOTONES
		vista.getBtnAñadir().addActionListener(me);
		vista.getBtnSalir().addActionListener(me);
	}
	
	//CLASE QUE CONTROLA LAS ACCIONES DE LOS EVENTOS
	public class ManejadorEventos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			//SI EL BOTÓN DE AÑADIR ES PRESIONADO SE LLAMA AL SECRETARIO Y SE ACTUALIZA LA TABAL
			if(vista.getBtnAñadir() == arg0.getSource()) {
				secretario.HoraOcupada();
				vista.llenarHorario();
			}
			
			//SI EL BOTÓN DE SALIR ES PRESIONADO SE IMPRIME UNA VENTANA DE CONFIRMACIÓN 
			if(vista.getBtnSalir() == arg0.getSource()) {
				
				int respuesta;
				//LA DECISIÓN SE ALMACENA EN UNA VARIABLE
				respuesta = JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?","Confirmación", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				//SI LA RESPUESTA ES SI SE TERMINA EL PROGRAMA
				if(respuesta == 0) 
					System.exit(0);
				
			}
		}
		
	}
=======
=======
>>>>>>> 9e88f9a01d9c14f1615df2dcaead61105678e62b
package ejemplo;

public class Controlador {

<<<<<<< HEAD
>>>>>>> 9e88f9a01d9c14f1615df2dcaead61105678e62b
=======
>>>>>>> 9e88f9a01d9c14f1615df2dcaead61105678e62b
}
