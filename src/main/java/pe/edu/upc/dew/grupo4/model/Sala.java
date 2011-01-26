package pe.edu.upc.dew.grupo4.model;

import java.util.List;

public class Sala {

	private int cod_sala;
	private int nro_sala;
	private int capa_sala;
	private String atri_sala;
	private List<Funcion> func_sala;

	public int getNro_sala() {
		return nro_sala;
	}

	public void setNro_sala(int nro_sala) {
		this.nro_sala = nro_sala;
	}

	public int getCod_sala() {
		return cod_sala;
	}

	public void setCod_sala(int cod_sala) {
		this.cod_sala = cod_sala;
	}

	public int getCapa_sala() {
		return capa_sala;
	}

	public void setCapa_sala(int capa_sala) {
		this.capa_sala = capa_sala;
	}

	public String getAtri_sala() {
		return atri_sala;
	}

	public void setAtri_sala(String atri_sala) {
		this.atri_sala = atri_sala;
	}

	public List<Funcion> getFunc_sala() {
		return func_sala;
	}

	public void setFunc_sala(List<Funcion> func_sala) {
		this.func_sala = func_sala;
	}

}
