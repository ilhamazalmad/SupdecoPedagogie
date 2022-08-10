package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "semestre")

public class Semestre implements Serializable{

	@Id
	@GeneratedValue
	
	private Long idSem;
	private String codeSem;
	private String nomSem;
	private String nomNiv;
	
	
	public Semestre() {
		
	}

	public Long getIdSem() {
		return idSem;
	}

	public void setIdSem(Long idSem) {
		this.idSem = idSem;
	}

	public String getCodeSem() {
		return codeSem;
	}

	public void setCodeSem(String codeSem) {
		this.codeSem = codeSem;
	}

	public String getNomSem() {
		return nomSem;
	}

	public void setNomSem(String nomSem) {
		this.nomSem = nomSem;
	}

	public String getNomNiv() {
		return nomNiv;
	}

	public void setNomNiv(String nomNiv) {
		this.nomNiv = nomNiv;
	}
	
	
}
