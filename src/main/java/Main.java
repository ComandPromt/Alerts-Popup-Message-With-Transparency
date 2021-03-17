import java.awt.Font;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import alertas.AlertError;
import alertas.AlertInformation;
import alertas.AlertSuccess;
import alertas.AlertWarningSalir;

public class Main {
	public static void mensaje(String mensaje, int titulo, boolean filtro) {

		String tituloSuperior = "";

		int tipo = 0;

		switch (titulo) {

		case 1:

			if (filtro) {

				AlertError error;

				error = new AlertError(null, false);

				error.setTitulo(mensaje);

				error.setVisible(true);
			}

			else {

				tipo = JOptionPane.ERROR_MESSAGE;

				tituloSuperior = "Error";
			}

			break;

		case 2:

			if (filtro) {
				AlertInformation informacion;

				informacion = new AlertInformation(null, false);

				informacion.setTitulo(mensaje);

				informacion.setVisible(true);
			}

			else {
				tipo = JOptionPane.INFORMATION_MESSAGE;
				tituloSuperior = "Informacion";
			}

			break;

		case 3:

			if (filtro) {

				AlertWarningSalir salir;

				salir = new AlertWarningSalir(null, false);

				salir.setTitulo(mensaje);

				salir.setVisible(true);
			}

			else {
				tipo = JOptionPane.WARNING_MESSAGE;
				tituloSuperior = "Advertencia";
			}

			break;

		case 4:

			if (filtro) {
				AlertSuccess exito;

				exito = new AlertSuccess(null, false);

				exito.setTitulo(mensaje);

				exito.setVisible(true);
			}

			else {
				tipo = JOptionPane.INFORMATION_MESSAGE;
				tituloSuperior = "Informacion";
			}

			break;

		default:
			break;

		}

		if (!filtro) {
			JLabel alerta = new JLabel(mensaje);

			alerta.setFont(new Font("Arial", Font.BOLD, 18));

			JOptionPane.showMessageDialog(null, alerta, tituloSuperior, tipo);
		}

	}

	public static void main(String args[]) throws IOException {

		// ERROR MESSAGE

		mensaje("TEST", 3, true);

		/*
		 * SUCCESS MESSAGE
		 * 
		 * mensaje("TEST", 2, true);
		 * 
		 */

		/*
		 * WARNING MESSAGE
		 * 
		 * mensaje("TEST", 3, true);
		 * 
		 */

	}

}