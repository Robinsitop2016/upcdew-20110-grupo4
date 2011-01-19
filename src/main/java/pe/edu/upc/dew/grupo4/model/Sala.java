package pe.edu.upc.dew.grupo4.model;

public class Sala {
	private int idsala;
	private int capacida;
	private Cine cine;

	public Cine getCine() {
		return cine;
	}

	public void setCine(Cine cine) {
		this.cine = cine;
	}

	public int getIdsala() {
		return idsala;
	}

	public void setIdsala(int idsala) {
		this.idsala = idsala;
	}

	public int getCapacida() {
		return capacida;
	}

	public void setCapacida(int capacida) {
		this.capacida = capacida;
	}

}
