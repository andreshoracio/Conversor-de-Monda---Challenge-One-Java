import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String [] args) {		
		
		
		String seleccion = primeraEleccion();
		
		if(seleccion.equals("Conversor de Moneda") ) {
			String moneda = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir:");
			try {
				conversorMoneda(Integer.parseInt(moneda));				
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, e.getMessage() + " Debe ingresar un número");				
			}
			
		}else {
			conversorTemperatura();
		}

		System.out.println("El usuario ha elegido "+ seleccion.toString());
	}
	
	private static String primeraEleccion() {
		Object seleccion = JOptionPane.showInputDialog(
				   null, //componente padre
				   "Seleccione opción de conversión",
				   "Menu",
				   JOptionPane.PLAIN_MESSAGE,
				   null,  // icono defecto
				   new Object[] { "Conversor de Moneda", "Conversor de Temperatura"}, 
				   1);
		return seleccion.toString();		
	}
	
	private static void conversorMoneda(int mondeda) {
		System.out.println("hola moneda");
	}
	
	private static void conversorTemperatura() {
		System.out.println("hola tem");
	}

}
