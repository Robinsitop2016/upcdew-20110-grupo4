package pe.edu.upc.dew.grupo4.model;

public class Boleto {

	private int cod_boleto;
	private String fech_boleto;
	private String fech_funcion;
	private Sala sala_boleto;
	private Funcion func_boleto;
	private Cliente clie_boleto;

	public int getCod_boleto() {
		return cod_boleto;
	}

	public void setCod_boleto(int cod_boleto) {
		this.cod_boleto = cod_boleto;
	}

	public String getFech_boleto() {
		return fech_boleto;
	}

	public void setFech_boleto(String fech_boleto) {
		this.fech_boleto = fech_boleto;
	}

	public String getFech_funcion() {
		return fech_funcion;
	}

	public void setFech_funcion(String fech_funcion) {
		this.fech_funcion = fech_funcion;
	}

	public Sala getSala_boleto() {
		return sala_boleto;
	}

	public void setSala_boleto(Sala sala_boleto) {
		this.sala_boleto = sala_boleto;
	}

	public Funcion getFunc_boleto() {
		return func_boleto;
	}

	public void setFunc_boleto(Funcion func_boleto) {
		this.func_boleto = func_boleto;
	}

	public Cliente getClie_boleto() {
		return clie_boleto;
	}

	public void setClie_boleto(Cliente clie_boleto) {
		this.clie_boleto = clie_boleto;
	}

}
