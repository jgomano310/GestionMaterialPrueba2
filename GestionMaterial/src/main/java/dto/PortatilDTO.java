package dto;

import java.util.Calendar;

import javax.persistence.Column;

import dao.Alumno;

public class PortatilDTO {
	
	
	private Calendar md_date;
	
	private String marca;
	
	private String modelo;
	
	private Alumno alumno;

	public Calendar getMd_date() {
		return md_date;
	}

	public void setMd_date(Calendar md_date) {
		this.md_date = md_date;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public PortatilDTO(Calendar md_date, String marca, String modelo) {
		super();
		this.md_date = md_date;
		this.marca = marca;
		this.modelo = modelo;
		
	}

	public PortatilDTO() {
		super();
	}

	@Override
	public String toString() {
		return "PortatilDTO [md_date=" + md_date + ", marca=" + marca + ", modelo=" + modelo + ", alumno=" + alumno
				+ "]";
	}

	
	

	
	
	

}
