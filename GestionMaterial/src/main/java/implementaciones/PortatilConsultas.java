package implementaciones;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Portatil;
import dao.PortatilImpl;

@Service
public class PortatilConsultas {
	
	@Autowired
	private PortatilImpl p;

	
	@Transactional
	public void Insertar(Portatil portatil) {
		// TODO Auto-generated method stub
		p.Insertar(portatil);
		
		
	}

	
	@Transactional
	public List<Portatil> listarPortatil() {
		// TODO Auto-generated method stub
		return p.listarPortatil();
	}
	
}
