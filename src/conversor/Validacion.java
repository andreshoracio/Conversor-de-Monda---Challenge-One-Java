package conversor;

import javax.swing.JOptionPane;

public class Validacion {

	public double evaluarEntero() {
		while(true) {

			String moneda = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir:");

			try {
				double doubleMoneda = Double.parseDouble(moneda);
				return doubleMoneda;
			} catch (NumberFormatException e) {
				//JOptionPane.showMessageDialog(null, " Debe ingresar un n�mero" + e.getMessage());
				JOptionPane.showMessageDialog(null, " Valor no v�lido" );
				continue;
			}		
			
		}
		
	}
	
}
