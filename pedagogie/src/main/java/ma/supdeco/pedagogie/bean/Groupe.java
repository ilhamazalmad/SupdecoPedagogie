package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "groupe")
public class Groupe implements Serializable{
	
	@Id
	@GeneratedValue
	
	private Long idGr;
	private String codeGr;
	private String nomGr;
	private int nbEtudiants;
	private String nomNiv;
	
	public Groupe() {
		
	}

	public Groupe(Long id, String name) {
        super();
        this.idGr = id;
        this.nomGr = name;
    }
	
	public Long getIdGr() {
		return idGr;
	}

	public void setIdGr(Long idGr) {
		this.idGr = idGr;
	}

	public String getCodeGr() {
		return codeGr;
	}

	public void setCodeGr(String codeGr) {
		this.codeGr = codeGr;
	}

	public String getNomGr() {
		return nomGr;
	}

	public void setNomGr(String nomGr) {
		this.nomGr = nomGr;
	}
	
	public int getNbEtudiants() {
		return nbEtudiants;
	}

	public void setNbEtudiants(int nbEtudiants) {
		this.nbEtudiants = nbEtudiants;
	}

	public String getNomNiv() {
		return nomNiv;
	}

	public void setNomNiv(String nomNiv) {
		this.nomNiv = nomNiv;
	}

	
}
