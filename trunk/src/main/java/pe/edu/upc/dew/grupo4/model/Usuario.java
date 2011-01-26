package pe.edu.upc.dew.grupo4.model;

public class Usuario {

	private int codi_usuario; // Codigo de Usuario
	private String name_usuario; // Nombre de Usuario
	private String last_usuario; // Apellidos de Usuario
	private String cargo_usuario; // Cargo de USuario
	private String pass_usuario; // Password de Usuario
	private String dni_usuario; // Dni de Usuario
	private String fena_usuario; // Fecha de Nacimiento de Usuario
	private String dir_usuario; // Direccion de Usuario
	private int telf_usuario; // Telefono de Usuario
	private String mail_usuario; // Correo de Usuario

	public String getPassword() {
		return pass_usuario;
	}

	public void setPassword(String pass_usuario) {
		this.pass_usuario = pass_usuario;
	}

	public int getCodi_usuario() {
		return codi_usuario;
	}

	public void setCodi_usuario(int codi_usuario) {
		this.codi_usuario = codi_usuario;
	}

	public String getName_usuario() {
		return name_usuario;
	}

	public void setName_usuario(String name_usuario) {
		this.name_usuario = name_usuario;
	}

	public String getLast_usuario() {
		return last_usuario;
	}

	public void setLast_usuario(String last_usuario) {
		this.last_usuario = last_usuario;
	}

	public String getCargo_usuario() {
		return cargo_usuario;
	}

	public void setCargo_usuario(String cargo_usuario) {
		this.cargo_usuario = cargo_usuario;
	}

	public String getDni_usuario() {
		return dni_usuario;
	}

	public void setDni_usuario(String dni_usuario) {
		this.dni_usuario = dni_usuario;
	}

	public String getFena_usuario() {
		return fena_usuario;
	}

	public void setFena_usuario(String fena_usuario) {
		this.fena_usuario = fena_usuario;
	}

	public String getDir_usuario() {
		return dir_usuario;
	}

	public void setDir_usuario(String dir_usuario) {
		this.dir_usuario = dir_usuario;
	}

	public int getTelf_usuario() {
		return telf_usuario;
	}

	public void setTelf_usuario(int telf_usuario) {
		this.telf_usuario = telf_usuario;
	}

	public String getMail_usuario() {
		return mail_usuario;
	}

	public void setMail_usuario(String mail_usuario) {
		this.mail_usuario = mail_usuario;
	}

}
