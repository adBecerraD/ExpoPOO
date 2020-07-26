/*
 * NOMBRE: LAUNCHER DEL PROGRAMA
 * AUTORES: ANDRÉS BECERRA  Y FELIPE CHAVEZ
 * FECHA: 25 DE JULIO DE 2020
 */
package ejemplo;

import java.awt.EventQueue;

public class Launcher {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					//SE CREA LA CLASE VENTANA
					Ventana vista = new Ventana();
					//SE CREA EL AGENTE QUE UNE LAS CLASES
					Secretario secretario = new Secretario(vista);
					//SE CREA EL CONTROLADOR Y SE MANDA LA VENTANA Y EL AGENTE
					Controlador control = new Controlador(vista,secretario);
					//SE HACE VISIBLE LA VENTANA
					vista.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
