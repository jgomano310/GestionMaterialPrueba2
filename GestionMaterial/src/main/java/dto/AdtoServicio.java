package dto;

import java.util.Calendar;

import dao.Alumno;
import dao.Portatil;

public interface AdtoServicio {
	
	public AlumnoDTO AlumnoaDTO (Calendar md_date, String nombre, String telefono, Portatil portatil);
	
	
	
	
	
	public PortatilDTO PortatilaDTO( Calendar md_date,String marca,String modelo);
	
	

	
}
