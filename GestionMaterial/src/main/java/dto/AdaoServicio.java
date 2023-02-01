package dto;

import dao.Alumno;
import dao.Portatil;

public interface AdaoServicio {

	
	public Alumno AlumnoaDAO(AlumnoDTO alumnoDTO);
	
	public Portatil PortatilaDAO(PortatilDTO portatilDTO);
}
