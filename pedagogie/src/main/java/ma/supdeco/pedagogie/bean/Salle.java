package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "salle")

public class Salle implements Serializable{

	@Id
	@GeneratedValue
	
	private Long id;
	private String codeSalle;
	private String nomSalle;
	private String type;
	private int nbTables;
	private int nbPlaces;
	
	
	
	public Salle() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodeSalle() {
		return codeSalle;
	}
	public void setCodeSalle(String codeSalle) {
		this.codeSalle = codeSalle;
	}
	public String getNomSalle() {
		return nomSalle;
	}
	public void setNomSalle(String nomSalle) {
		this.nomSalle = nomSalle;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNbTables() {
		return nbTables;
	}
	public void setNbTables(int nbTables) {
		this.nbTables = nbTables;
	}
	public int getNbPlaces() {
		return nbPlaces;
	}
	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}

}
