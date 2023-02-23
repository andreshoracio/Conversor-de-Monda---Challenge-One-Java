package conversor.modelos;

public class Moneda {
	
	private String eleccion;
	private Double valor;
	private String moneda;
	
	public Moneda(String eleccion, Double valor, String moneda) {	
		this.eleccion = eleccion;
		this.valor = valor;
		this.moneda = moneda;
	}

	public String getEleccion() {
		return eleccion;
	}

	public void setEleccion(String eleccion) {
		this.eleccion = eleccion;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	
	
	
	
	

}
