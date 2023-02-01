package dao;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="dlk_portatil", schema="bd_gestion_material")
public class Portatil {

	@Id
	@Column(name="id", unique=true, nullable=false)
	@GeneratedValue( strategy= GenerationType.IDENTITY )
	private int id;
	
	@Column(name="md_uuid")   
	private String md_uuid;
	
	@Column(name="md_date")
	private Calendar md_date;
	
	@Column(name="marca")
	private String marca;
	
	@Column(name="modelo")
	private String modelo;
	
	@OneToOne(mappedBy = "portatil", targetEntity = Alumno.class, cascade = CascadeType.MERGE, fetch = FetchType.EAGER, orphanRemoval = false, optional = true)
	private Alumno alumno;

	

	public Portatil() {
		super();
	}

	public Portatil( String md_uuid, Calendar md_date, String marca, String modelo) {
		super();
		
		this.md_uuid = md_uuid;
		this.md_date = md_date;
		this.marca = marca;
		this.modelo = modelo;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMd_uuid() {
		return md_uuid;
	}

	public void setMd_uuid(String md_uuid) {
		this.md_uuid = md_uuid;
	}

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
	
	
	
}
