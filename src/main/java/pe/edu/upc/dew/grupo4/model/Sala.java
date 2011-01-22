package pe.edu.upc.dew.grupo4.model;

public class Sala {
	private int cod_sala;
	private int capacidad;
	private boolean is3d;
	
	public int getCod_sala() 
	{
		return cod_sala;
	}
	public void setCod_sala(int cod_sala) 
	{
		this.cod_sala = cod_sala;
	}
	public int getCapacidad() 
	{
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		
		this.capacidad = capacidad;
	}
	public boolean isIs3d() 
	{
		return is3d;
	}
	public void setIs3d(boolean is3d) {
		this.is3d = is3d;
	}
	

}
