package pe.edu.upc.dew.grupo4.model;

public class Funcion {

	private int codFuncion; 		// Codigo de Funcion
	private Pelicula peliFuncion; 	// Pelicula de Funcion
	private String hoinFuncion; 	// Hora de Inicio de Funcion
	private String hofiFuncion; 	// Hora de Fin de Funcion

	public int getCodFuncion() {
		return codFuncion;
	}

	public void setCodFuncion(int codFuncion) {
		this.codFuncion = codFuncion;
	}

	public Pelicula getPeliFuncion() {
		return peliFuncion;
	}

	public void setPeliFuncion(Pelicula peliFuncion) {
		this.peliFuncion = peliFuncion;
	}

	public String getHoinFuncion() {
		return hoinFuncion;
	}

	public void setHoinFuncion(String hoinFuncion) {
		this.hoinFuncion = hoinFuncion;
	}

	public String getHofiFuncion() {
		return hofiFuncion;
	}

	public void setHofiFuncion(String hofiFuncion) {
		this.hofiFuncion = hofiFuncion;
	}

	
}
