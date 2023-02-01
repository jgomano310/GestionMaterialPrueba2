package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
public class AlumnoImpl implements InterfazAlumno {

	@PersistenceContext
	EntityManager entity;
	
	
	@Override
	public void InsertarAlumno(Alumno alumno) {
		entity.persist(alumno);
		entity.clear();
		
	}
	
	

	
	@Override
	public List<Alumno> ListarAlumno() {
		// TODO Auto-generated method stub
		
		String jpql = "SELECT a FROM Alumno a WHERE a.portatil !=null";
		Query query = entity.createQuery(jpql);
		
		return query.getResultList();
	}

	@Override
	public void EliminarAlumno(int id) {
		
		
		
		String jpql = "DELETE FROM Alumno a WHERE a.id=:id_alumno";
		Query query = entity.createQuery(jpql);
		query.setParameter("id_alumno", id);
		int eliminados = query.executeUpdate();
		System.out.println("el numero de eliminados es: " +eliminados);
		
	}




	@Override
	public List<Alumno> BuscarAlumnoPorPortatil(int id) {
		
		//String jpql = "SELECT a FROM"
		
		return null;
	}

}
