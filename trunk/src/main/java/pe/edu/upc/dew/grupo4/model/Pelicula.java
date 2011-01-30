package pe.edu.upc.dew.grupo4.model;

public class Pelicula {

	private int codPelicula; // Codigo de Pelicula
	private String namPelicula; // Nombre de Pelicula
	private String genPelicula; // Genero de Pelicula
	private int duraPelicula; // Duracion de Pelicula (Minutos)
	private int clasPelicula; // Clasificacion de Pelicula
	private int estadoPelicula; // Estado de Pelicula (Activo Inactivo)
	
	public int getEstadoPelicula() {
		return estadoPelicula;
	}

	public void setEstadoPelicula(int estadoPelicula) {
		this.estadoPelicula = estadoPelicula;
	}

	public int getCodPelicula() {
		return codPelicula;
	}

	public void setCodPelicula(int codPelicula) {
		this.codPelicula = codPelicula;
	}

	public String getNamPelicula() {
		return namPelicula;
	}

	public void setNamPelicula(String namPelicula) {
		this.namPelicula = namPelicula;
	}

	public String getGenPelicula() {
		return genPelicula;
	}

	public void setGenPelicula(String genPelicula) {
		this.genPelicula = genPelicula;
	}

	public int getDuraPelicula() {
		return duraPelicula;
	}

	public void setDuraPelicula(int duraPelicula) {
		this.duraPelicula = duraPelicula;
	}

	public int getClasPelicula() {
		return clasPelicula;
	}

	public void setClasPelicula(int clasPelicula) {
		this.clasPelicula = clasPelicula;
	}

}
