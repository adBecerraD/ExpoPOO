/*
 * NOMBRE: AGENTE 
 * AUTORES: ANDRÉS BECERRA  Y FELIPE CHAVEZ
 * FECHA: 25 DE JULIO DE 2020
 */
package ejemplo;

import javax.swing.JOptionPane;

import ejemplo.Ventana;

public class Secretario {
	
	//SE CREA UN OJETO DE VISTA
	Ventana vista;
	
	//SE CREAN VECTOR PARA DEFINIR SI LA HORA ESTÁ OCUPADA
	private boolean ocupado[] = {false,false,false,false,false,false};
	
	//SE PASA LA VISTA POR CONSTRUCTOR
	Secretario(Ventana vista){
		this.vista = vista;
	}
	
	//MÉTODO QUE AGENDA LOS PACIENTES A LAS HORAS DADS
	void HoraOcupada() {
		
		//SE  CREA UNA VARIABLE QUE CONTIENE LA HORA QUE ELIGE EL PACIENTE
		int indice;
		
		//SE LE SE ASIGNA LA HORA DEL PACIENTE
		indice = vista.getComboBox().getSelectedIndex();
		
		//CONDICIONAL QUE REVISA SI LA HORA YA ESTÁ ASIGNADA
		if(ocupado[indice] == false) {
			//SE LLAMA EL NOMBRE DEL PACIENTE Y SE ASIGNA A LA VARIABLE
			String paciente = vista.getTextField().getText();
			//SE OCUPA LA HORA
			ocupado[indice] = true;
			//sE LE MANDA EL NOMBRE DEL PACIENTE A LA TABLA
			vista.paciente[indice][1]  = paciente;
		}else {
			//DESPLIEGA UNA VENTAN QUE INFORMA QUE LA HORA ESTÁ OCUPADA
			JOptionPane.showMessageDialog(null, "La hora ya está ocupada","Error",JOptionPane.ERROR_MESSAGE);
		}
	}
	
}
