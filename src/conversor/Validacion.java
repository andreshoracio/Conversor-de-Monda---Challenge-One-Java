package conversor;

import javax.swing.JOptionPane;

public class Validacion {

	public double evaluarNumero() {
		while(true) {

			String moneda = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir:");

			try {
				double doubleMoneda = Double.parseDouble(moneda);
				return doubleMoneda;
			} catch (NumberFormatException | NullPointerException en) {
				//JOptionPane.showMessageDialog(null, " Debe ingresar un número" + e.getMessage());
				JOptionPane.showMessageDialog(null, " Valor no válido" );
				continue;
			}		
			
		}
		
	}
	
}
