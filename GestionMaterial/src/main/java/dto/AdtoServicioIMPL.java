package dto;

import java.util.Calendar;

import dao.Alumno;
import dao.Portatil;

public class AdtoServicioIMPL implements AdtoServicio {

	@Override
	public AlumnoDTO AlumnoaDTO(Calendar md_date, String nombre, String telefono, Portatil portatil) {
		AlumnoDTO alumnoDTO= new AlumnoDTO( md_date,  nombre,  telefono, portatil);
		
		return alumnoDTO;
	}

	@Override
	public PortatilDTO PortatilaDTO(Calendar md_date, String marca, String modelo) {
		PortatilDTO portatilDTO = new PortatilDTO( md_date,  marca,  modelo);
		
		return portatilDTO;
	}

	




}
