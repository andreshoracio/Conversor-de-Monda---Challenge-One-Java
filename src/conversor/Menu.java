package conversor;
import javax.swing.JOptionPane;

public class Menu {
	
	public String menuConversores() {
		Object seleccion = JOptionPane.showInputDialog(
				   null, //componente padre
				   "Seleccione opci�n de conversi�n",
				   "Menu",
				   JOptionPane.PLAIN_MESSAGE,
				   null,  // icono defecto
				   new Object[] { "Conversor de Moneda", "Conversor de Temperatura"}, 
				   1);
		return seleccion.toString();		
	}
	
	public String tipoDeMoneda() {
		Object seleccion = JOptionPane.showInputDialog(
				   null, //componente padre
				   "Elije la moneda a la que deseas convertir tu dinero",
				   "Monedas",
				   JOptionPane.PLAIN_MESSAGE,
				   null,  // icono defecto
				   new Object[] { "De Pesos a D�lar", "De Pesos a Euro", "De Pesos a Libras", 
						   "De Pesos a Yen", "De Pesos a Won Coreano", "De D�lar a Pesos", 
						   "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos", 
						   "De Won Coreano a Pesos"}, 
				   1);
		return seleccion.toString();		
	}
	
	public String tipoEscala() {
		Object seleccion = JOptionPane.showInputDialog(
				   null, //componente padre
				   "Seleccione opci�n de conversi�n",
				   "Menu",
				   JOptionPane.PLAIN_MESSAGE,
				   null,  // icono defecto
				   new Object[] { "Celsius a Kelvin", "Celsius a Fahrenheit",
						   		  "Celsius a Rankine", "Kelvin a Celsius",
						   		  "Fahrenheit a Celsius", "Rankine a Celsius"}, 1);
		return seleccion.toString();
	}

}
