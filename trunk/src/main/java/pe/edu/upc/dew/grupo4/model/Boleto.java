package pe.edu.upc.dew.grupo4.model;

public class Boleto {

	private int codBoleto; 		// Codigo de Boleto
	private String fechBoleto; 	// Fecha de Impresion de Boleto
	private Sala salaFuncion; 	// Sala de Funcion
	private Funcion funcBoleto; // Funcion de Boleto
	private Cliente clieBoleto; // Cliente de Boleto

	public int getCodBoleto() {
		return codBoleto;
	}

	public void setCodBoleto(int codBoleto) {
		this.codBoleto = codBoleto;
	}

	public String getFechBoleto() {
		return fechBoleto;
	}

	public void setFechBoleto(String fechBoleto) {
		this.fechBoleto = fechBoleto;
	}

	public Sala getSalaFuncion() {
		return salaFuncion;
	}

	public void setSalaFuncion(Sala salaFuncion) {
		this.salaFuncion = salaFuncion;
	}

	public Funcion getFuncBoleto() {
		return funcBoleto;
	}

	public void setFuncBoleto(Funcion funcBoleto) {
		this.funcBoleto = funcBoleto;
	}

	public Cliente getClieBoleto() {
		return clieBoleto;
	}

	public void setClieBoleto(Cliente clieBoleto) {
		this.clieBoleto = clieBoleto;
	}

}
