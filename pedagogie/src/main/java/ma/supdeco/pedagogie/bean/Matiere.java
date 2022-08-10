package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "matiere")

public class Matiere implements Serializable{

	@Id
	@GeneratedValue
	
	private Long idMat;
	private String codeMat;
	private String nomMat;
	private String codeMod;
	private String nomMod;
	private String nomNiv;
	private String codeSem;
	
	public Matiere() {
		
	}
	
	public Matiere(String nomNiv,String codeSem,String nomMat,String nomMod) {
		super();
        this.nomNiv = nomNiv;
        this.codeSem = codeSem;
        this.nomMat = nomMat;
        this.nomMod = nomMod;
	}

	public Matiere(String nomNiv,String codeSem,String nomMat,String nomMod,String codeMat) {
		super();
        this.nomNiv = nomNiv;
        this.codeSem = codeSem;
        this.nomMat = nomMat;
        this.nomMod = nomMod;
        this.codeMat = codeMat;
	}
	
	public Long getIdMat() {
		return idMat;
	}

	public void setIdMat(Long idMat) {
		this.idMat = idMat;
	}

	public String getCodeMat() {
		return codeMat;
	}

	public void setCodeMat(String codeMat) {
		this.codeMat = codeMat;
	}

	public String getNomMat() {
		return nomMat;
	}

	public void setNomMat(String nomMat) {
		this.nomMat = nomMat;
	}

	public String getCodeMod() {
		return codeMod;
	}

	public void setCodeMod(String codeMod) {
		this.codeMod = codeMod;
	}

	public String getNomNiv() {
		return nomNiv;
	}

	public void setNomNiv(String nomNiv) {
		this.nomNiv = nomNiv;
	}

	public String getCodeSem() {
		return codeSem;
	}

	public void setCodeSem(String codeSem) {
		this.codeSem = codeSem;
	}

	public String getNomMod() {
		return nomMod;
	}

	public void setNomMod(String nomMod) {
		this.nomMod = nomMod;
	}

}
