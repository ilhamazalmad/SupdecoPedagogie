package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "niveau")

public class Niveau implements Serializable{

	@Id
	@GeneratedValue
	
	private Long idNiv;
	private String codeNiv;
	private String nomNiv;
	
	
	public Niveau() {
		
	}

	public Long getIdNiv() {
		return idNiv;
	}

	public void setIdNiv(Long idNiv) {
		this.idNiv = idNiv;
	}

	public String getCodeNiv() {
		return codeNiv;
	}

	public void setCodeNiv(String codeNiv) {
		this.codeNiv = codeNiv;
	}

	public String getNomNiv() {
		return nomNiv;
	}

	public void setNomNiv(String nomNiv) {
		this.nomNiv = nomNiv;
	}

}
