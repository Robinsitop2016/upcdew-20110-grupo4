package pe.edu.upc.dew.grupo4.model;

import java.util.List;

public class Sala {

	private int codCine; 			// Codigo de Cine
	private int codSala; 			// Codigo de Sala
	private int nroSala; 			// Numero de Sala
	private int capaSala; 			// Capacidad de Sala
	private String atriSala; 		// Atributo de Sala
	private List<Funcion> funcSala; // Funciones de Sala

	public int getCodCine() {
		return codCine;
	}

	public void setCodCine(int codCine) {
		this.codCine = codCine;
	}

	public int getNroSala() {
		return nroSala;
	}

	public void setNroSala(int nroSala) {
		this.nroSala = nroSala;
	}

	public int getCodSala() {
		return codSala;
	}

	public void setCodSala(int codSala) {
		this.codSala = codSala;
	}

	public int getCapaSala() {
		return capaSala;
	}

	public void setCapaSala(int capaSala) {
		this.capaSala = capaSala;
	}

	public String getAtriSala() {
		return atriSala;
	}

	public void setAtriSala(String atriSala) {
		this.atriSala = atriSala;
	}

	public List<Funcion> getFuncSala() {
		return funcSala;
	}

	public void setFuncSala(List<Funcion> funcSala) {
		this.funcSala = funcSala;
	}

}
