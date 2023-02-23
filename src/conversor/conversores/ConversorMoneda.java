package conversor.conversores;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import conversor.modelos.Moneda;


public class ConversorMoneda {
	
	DecimalFormat formato = new DecimalFormat("#.00");
	

	public String convertir(String moneda, double cantidad) {
		
		double valor = 0;		
		
		for(Moneda mon : listaPesosMonedas()) {		
			if(mon.getEleccion().equals(moneda)) {
				valor = cantidad / mon.getValor();
				return formato.format(valor) + ' ' + mon.getMoneda() ;
			}
		}
		
		for(Moneda mon : listaMonedas()) {		
			if(mon.getEleccion().equals(moneda)) {
				valor = cantidad * mon.getValor();
				return formato.format(valor) + ' ' + mon.getMoneda() ;
			}
		}
		

		return null;			
	}
	
	
	private List<Moneda> listaPesosMonedas(){
		List<Moneda> monedas = new ArrayList<>();
		monedas.add(new Moneda("De Pesos a Dólar", 4896.18,"Dolares"));
		monedas.add(new Moneda("De Pesos a Euro", 5201.51, "Euros"));
		monedas.add(new Moneda("De Pesos a Libras", 5907.24, "Libras"));
		monedas.add(new Moneda("De Pesos a Yen", 36.33, "Yenes"));
		monedas.add(new Moneda("De Pesos a Won Coreano", 3.78, "Wones"));
		return monedas;
	}
	
	private List<Moneda> listaMonedas(){
		List<Moneda> monedas = new ArrayList<>();
		monedas.add(new Moneda("De Dólar a Pesos", 4896.18, "Pesos"));
		monedas.add(new Moneda("De Euro a Pesos", 5201.51, "Pesos"));	
		monedas.add(new Moneda("De Libras a Pesos", 5907.24, "Pesos"));	
		monedas.add(new Moneda("De Yen a Pesos", 5907.24, "Pesos"));	
		monedas.add(new Moneda("De Won Coreano a Pesos", 36.33, "Pesos"));	
		return monedas;
	}	
	
	
	
	
	
}
