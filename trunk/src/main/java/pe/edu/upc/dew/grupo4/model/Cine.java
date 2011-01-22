package pe.edu.upc.dew.grupo4.model;

import java.util.List;

public class Cine {
	public int getCod_cine() 
	{
		return cod_cine;
	}

	public void setCod_cine(int cod_cine) 
	{
		this.cod_cine = cod_cine;
	}

	public String getNom_cine() 
	{
		return nom_cine;
	}

	public void setNom_cine(String nom_cine) 
	{
		this.nom_cine = nom_cine;
	}

	public String getDir_cine() 
	{
		return dir_cine;
	}

	public void setDir_cine(String dir_cine) 
	{
		this.dir_cine = dir_cine;
	}

	public List<Sala> getSalas() 
	{
		return salas;
	}

	public void setSalas(List<Sala> salas) {
		this.salas = salas;
	}

	public int cod_cine;
	public String nom_cine;
	public String dir_cine;

	private List<Sala> salas;
}
