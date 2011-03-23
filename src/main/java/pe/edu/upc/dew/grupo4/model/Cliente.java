package pe.edu.upc.dew.grupo4.model;

public class Cliente {

	private int codCliente; 		//Codigo de Cliente
	private String namCliente; 		//Nombre de Cliente
	private String lastCliente; 	//Apellido de Cliente
	private String passCliente; 	//Password de Cliente
	private String dniCliente; 		//Dni de Cliente
	private String fenaCliente; 	//Fecha de Nacimiento de Cliente
	private String dirCliente; 		//Dirección de Cliente
	private int tlfCliente; 		//Teléfono de Cliente
	private String mailCliente; 	//Correo de Cliente

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	public String getNamCliente() {
		return namCliente;
	}

	public void setNamCliente(String namCliente) {
		this.namCliente = namCliente;
	}

	public String getLastCliente() {
		return lastCliente;
	}

	public void setLastCliente(String lastCliente) {
		this.lastCliente = lastCliente;
	}

	public String getPassCliente() {
		return passCliente;
	}

	public void setPassCliente(String passCliente) {
		this.passCliente = passCliente;
	}

	public String getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}

	public String getFenaCliente() {
		return fenaCliente;
	}

	public void setFenaCliente(String fenaCliente) {
		this.fenaCliente = fenaCliente;
	}

	public String getDirCliente() {
		return dirCliente;
	}

	public void setDirCliente(String dirCliente) {
		this.dirCliente = dirCliente;
	}

	public int getTlfCliente() {
		return tlfCliente;
	}

	public void setTlfCliente(int tlfCliente) {
		this.tlfCliente = tlfCliente;
	}

	public String getMailCliente() {
		return mailCliente;
	}

	public void setMailCliente(String mailCliente) {
		this.mailCliente = mailCliente;
	}

}
