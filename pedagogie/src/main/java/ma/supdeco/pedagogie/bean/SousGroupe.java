package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sousGroupe")
public class SousGroupe implements Serializable{
	
	@Id
	@GeneratedValue
	private Long idSousGr;
	
	private String codeSousGr;
	private String nomSousGr;
	private String nomNiv;
	private String nomGr;
	
	public SousGroupe() {
		
	}

	public Long getIdSousGr() {
		return idSousGr;
	}

	public void setIdSousGr(Long idSousGr) {
		this.idSousGr = idSousGr;
	}

	public String getCodeSousGr() {
		return codeSousGr;
	}

	public void setCodeSousGr(String codeSousGr) {
		this.codeSousGr = codeSousGr;
	}

	public String getNomSousGr() {
		return nomSousGr;
	}

	public void setNomSousGr(String nomSousGr) {
		this.nomSousGr = nomSousGr;
	}

	public String getNomNiv() {
		return nomNiv;
	}

	public void setNomNiv(String nomNiv) {
		this.nomNiv = nomNiv;
	}

	public String getNomGr() {
		return nomGr;
	}

	public void setNomGr(String nomGr) {
		this.nomGr = nomGr;
	}

}
