package ma.supdeco.pedagogie.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "optionn")
public class Option implements Serializable{
	
	@Id
	@GeneratedValue
	private Long idOpt;
	
	private String codeOpt;
	private String nomOpt;
	private String nomNiv;
	
	public Option() {
		
	}
	
	public Option(Long idOpt, String codeOpt, String nomOpt, String nomNiv) {
		super();
		this.idOpt = idOpt;
		this.codeOpt = codeOpt;
		this.nomOpt = nomOpt;
		this.nomNiv = nomNiv;
	}



	public Long getIdOpt() {
		return idOpt;
	}

	public void setIdOpt(Long idOpt) {
		this.idOpt = idOpt;
	}

	public String getCodeOpt() {
		return codeOpt;
	}

	public void setCodeOpt(String codeOpt) {
		this.codeOpt = codeOpt;
	}

	public String getNomOpt() {
		return nomOpt;
	}

	public void setNomOpt(String nomOpt) {
		this.nomOpt = nomOpt;
	}

	public String getNomNiv() {
		return nomNiv;
	}

	public void setNomNiv(String nomNiv) {
		this.nomNiv = nomNiv;
	}
}
