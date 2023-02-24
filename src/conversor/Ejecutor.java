package conversor;

import javax.swing.JOptionPane;

import conversor.conversores.ConversorMoneda;
import conversor.conversores.ConversorTemperatura;

public class Ejecutor {
	
	Menu menu = new Menu();
	Validacion validacion = new Validacion();
	ConversorMoneda conversorMoneda = new ConversorMoneda();
	ConversorTemperatura conversorTemperatura = new ConversorTemperatura();	
	
	
	
	public void run() {		
		
		while(true) {
		
			String seleccion = menu.menuConversores();
			double valor = 0;
			String resultado = "";
			String tipo = "";
			
			if (seleccion.equals("Conversor de Moneda")) {			
				valor = validacion.evaluarNumero("Ingresa la cantidad de dinero que deseas convertir:");
				tipo = menu.tipoDeMoneda();
				resultado = conversorMoneda.convertir(tipo, valor);		
				JOptionPane.showMessageDialog(null,"Tienes $"+ resultado);
			} else {
				valor = validacion.evaluarNumero("Ingrese la temperatura");
				tipo = menu.tipoEscala();
				resultado = conversorTemperatura.convertir(tipo, valor);
				JOptionPane.showMessageDialog(null,"La temperatura es: "+ resultado);
			}
			
			int i = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
			
			if(i == 0) {
				continue;
			}else if(i == 1) {
				JOptionPane.showMessageDialog(null,"Programa Finalizado");
				break;
			}else {
				JOptionPane.showMessageDialog(null,"Programa Finalizado");
				break;
			}
			
		}
		
	}


}
