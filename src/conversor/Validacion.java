package conversor;

import javax.swing.JOptionPane;

public class Validacion {

	public double evaluarNumero(String mesaje) {
		while(true) {

			String moneda = JOptionPane.showInputDialog(mesaje);

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
