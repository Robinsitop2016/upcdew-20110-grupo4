package pe.edu.upc.dew.grupo4.model;

import java.util.List;

public class Cine {

	public int codCine; // Codigo de Cine
	public String nomCine; // Nombre de Cine
	public String dirCine; // Direccion de Cine
	private List<Sala> salaCine; // Lista de SalasxCine
	private Usuario adminCine; // Administrador de Cine
	private String mailCine; // Correo de Cine

	public List<Sala> getSalaCine() {
		return salaCine;
	}

	public void setSalaCine(List<Sala> salaCine) {
		this.salaCine = salaCine;
	}

	public Usuario getAdminCine() {
		return adminCine;
	}

	public void setAdminCine(Usuario adminCine) {
		this.adminCine = adminCine;
	}

	public String getMailCine() {
		return mailCine;
	}

	public void setMailCine(String mailCine) {
		this.mailCine = mailCine;
	}

	public int getCodCine() {
		return codCine;
	}

	public void setCodCine(int codCine) {
		this.codCine = codCine;
	}

	public String getNomCine() {
		return nomCine;
	}

	public void setNomCine(String nomCine) {
		this.nomCine = nomCine;
	}

	public String getDirCine() {
		return dirCine;
	}

	public void setDirCine(String dirCine) {
		this.dirCine = dirCine;
	}

	public List<Sala> getSalas() {
		return salaCine;
	}

	public void setSalas(List<Sala> salas) {
		this.salaCine = salas;
	}

}
