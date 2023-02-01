package dto;

import java.util.Calendar;

import javax.persistence.Column;

import dao.Portatil;

public class AlumnoDTO {

	
	private Calendar md_date;
	
	private String nombre;
	
	private String telefono;
	
	private Portatil portatil;

	

	public AlumnoDTO(Calendar md_date, String nombre, String telefono, Portatil portatil) {
		super();
		this.md_date = md_date;
		this.nombre = nombre;
		this.telefono = telefono;
		this.portatil = portatil;
	}

	public AlumnoDTO() {
		super();
	}


	public Calendar getMd_date() {
		return md_date;
	}

	public void setMd_date(Calendar md_date) {
		this.md_date = md_date;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Portatil getPortatil() {
		return portatil;
	}

	public void setPortatil(Portatil portatil) {
		this.portatil = portatil;
	}

	@Override
	public String toString() {
		return "AlumnoDTO [md_date=" + md_date + ", nombre=" + nombre + ", telefono=" + telefono + ", portatil="
				+ portatil + "]";
	}

	
	
	
	
}
