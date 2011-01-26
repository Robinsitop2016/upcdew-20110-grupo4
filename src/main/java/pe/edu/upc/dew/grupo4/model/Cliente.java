package pe.edu.upc.dew.grupo4.model;

public class Cliente {

	private int codi_cliente; //Codigo de Cliente
	private String name_cliente; //Nombre de Cliente
	private String last_cliente; //Apellido de Cliente
	private String pass_cliente; //Password de Cliente
	private String dni_cliente; //Dni de Cliente
	private String fena_cliente; //Fecha de Nacimiento de Cliente
	private String dir_cliente; //Dirección de Cliente
	private int tlf_cliente; //Teléfono de Cliente
	private String mail_cliente; //Correo de Cliente

	public int getCodi_cliente() {
		return codi_cliente;
	}

	public void setCodi_cliente(int codi_cliente) {
		this.codi_cliente = codi_cliente;
	}

	public String getName_cliente() {
		return name_cliente;
	}

	public void setName_cliente(String name_cliente) {
		this.name_cliente = name_cliente;
	}

	public String getLast_cliente() {
		return last_cliente;
	}

	public void setLast_cliente(String last_cliente) {
		this.last_cliente = last_cliente;
	}

	public String getPass_cliente() {
		return pass_cliente;
	}

	public void setPass_cliente(String pass_cliente) {
		this.pass_cliente = pass_cliente;
	}

	public String getDni_cliente() {
		return dni_cliente;
	}

	public void setDni_cliente(String dni_cliente) {
		this.dni_cliente = dni_cliente;
	}

	public String getFena_cliente() {
		return fena_cliente;
	}

	public void setFena_cliente(String fena_cliente) {
		this.fena_cliente = fena_cliente;
	}

	public String getDir_cliente() {
		return dir_cliente;
	}

	public void setDir_cliente(String dir_cliente) {
		this.dir_cliente = dir_cliente;
	}

	public int getTlf_cliente() {
		return tlf_cliente;
	}

	public void setTlf_cliente(int tlf_cliente) {
		this.tlf_cliente = tlf_cliente;
	}

	public String getMail_cliente() {
		return mail_cliente;
	}

	public void setMail_cliente(String mail_cliente) {
		this.mail_cliente = mail_cliente;
	}

}
