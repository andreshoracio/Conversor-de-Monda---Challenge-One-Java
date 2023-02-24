package conversor.conversores;

import java.text.DecimalFormat;


public class ConversorTemperatura {
	
	DecimalFormat formato = new DecimalFormat("#.00");

	public String convertir(String escala, double valor) {
		String resultado = "";
		if(escala.equals("Celsius a Kelvin")) {
			resultado = String.valueOf(valor + 273.15) +" K";
		}else if(escala.equals("Celsius a Fahrenheit")) {
			resultado = String.valueOf(formato.format( (valor * 9 / 5) + 32 ) ) +" °F";
		}else if(escala.equals("Celsius a Rankine")){			
			resultado = String.valueOf(formato.format( (valor * 9 / 5) + 491.67 ) ) + " °Ra";
		}else if(escala.equals("Kelvin a Celsius")){
			resultado = String.valueOf(formato.format( (valor - 273.15) ) ) + " °C";
		}else if(escala.equals("Fahrenheit a Celsius")){
			resultado = String.valueOf(formato.format( (valor - 32) * 5/9 ) ) + " °C" ;
		}else {
			resultado = String.valueOf(formato.format( (valor - 491.67) * 5/9 ) ) + " °C" ;
		}
		return resultado;
	}	

	
		  
}
