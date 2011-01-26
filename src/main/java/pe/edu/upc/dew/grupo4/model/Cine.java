package pe.edu.upc.dew.grupo4.model;

import java.util.List;

public class Cine {

	public int cod_cine; // Codigo de Cine
	public String nom_cine; // Nombre de Cine
	public String dir_cine; // Direccion de Cine
	private List<Sala> sala_cine; // Lista de SalasxCine
	private Usuario admin_cine; // Administrador de Cine
	private String mail_cine; // Correo de Cine

	public List<Sala> getSala_cine() {
		return sala_cine;
	}

	public void setSala_cine(List<Sala> sala_cine) {
		this.sala_cine = sala_cine;
	}

	public Usuario getAdmin_cine() {
		return admin_cine;
	}

	public void setAdmin_cine(Usuario admin_cine) {
		this.admin_cine = admin_cine;
	}

	public String getMail_cine() {
		return mail_cine;
	}

	public void setMail_cine(String mail_cine) {
		this.mail_cine = mail_cine;
	}

	public int getCod_cine() {
		return cod_cine;
	}

	public void setCod_cine(int cod_cine) {
		this.cod_cine = cod_cine;
	}

	public String getNom_cine() {
		return nom_cine;
	}

	public void setNom_cine(String nom_cine) {
		this.nom_cine = nom_cine;
	}

	public String getDir_cine() {
		return dir_cine;
	}

	public void setDir_cine(String dir_cine) {
		this.dir_cine = dir_cine;
	}

	public List<Sala> getSalas() {
		return sala_cine;
	}

	public void setSalas(List<Sala> salas) {
		this.sala_cine = salas;
	}

}
