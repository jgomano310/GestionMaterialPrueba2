package dto;

import java.util.Random;

import dao.Alumno;
import dao.Portatil;

public class AdaoServicioIMPL implements AdaoServicio {

	
	
	@Override
	public Alumno AlumnoaDAO(AlumnoDTO alumnoDTO) {
		String muuid = java.util.UUID.randomUUID().toString();
		Alumno alumno = new Alumno();
		Random azar = new Random(5000);
		
		if(alumnoDTO!=null) {
			alumno.setMd_uuid(muuid);
			alumno.setNombre(alumnoDTO.getNombre());
			alumno.setTeléfono(alumnoDTO.getTelefono());
			alumno.setMd_date(alumnoDTO.getMd_date());
			alumno.setPortatil(alumnoDTO.getPortatil());
		}
		
		
		return alumno;
	}

	@Override
	public Portatil PortatilaDAO(PortatilDTO portatilDTO) {
		// TODO Auto-generated method stub
		String muuid = java.util.UUID.randomUUID().toString();
		Portatil portatil = new Portatil();
		
		if(portatilDTO!=null) {
			
			portatil.setMd_uuid(muuid);
			portatil.setMarca(portatilDTO.getMarca());
			portatil.setMd_date(portatilDTO.getMd_date());
			portatil.setModelo(portatilDTO.getMarca());
		}
		
		
		return portatil;
	}

}
