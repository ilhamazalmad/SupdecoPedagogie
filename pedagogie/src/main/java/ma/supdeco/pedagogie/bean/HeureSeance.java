package ma.supdeco.pedagogie.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "grProf")
public class HeureSeance {

	@Id
	@GeneratedValue
	private Long idGrProf;
	private Long idProf;
	private String nomNiv;
	private String nomProf;
	private String codeOpt;
	private String codeSem;
	private String nomGr;
	private String nomSousGr;
	private String nomMod;
	private String nomMat;	
	private String codeMat;
	
	public HeureSeance() {
		
	}

	public HeureSeance(String nomNiv, String codeSem,String nomMat,String nomProf,String codeMat,String nomSousGr) {
        super();
        this.nomNiv = nomNiv;
        this.codeSem = codeSem;
        this.nomMat = nomMat;
        this.nomProf = nomProf;
        this.codeMat = codeMat;
        this.nomSousGr = nomSousGr;
    }
	
	public Long getIdGrProf() {
		return idGrProf;
	}

	public void setIdGrProf(Long idGrProf) {
		this.idGrProf = idGrProf;
	}
	
	public String getNomProf() {
		return nomProf;
	}

	public void setNomProf(String nomProf) {
		this.nomProf = nomProf;
	}

	public String getNomNiv() {
		return nomNiv;
	}

	public void setNomNiv(String nomNiv) {
		this.nomNiv = nomNiv;
	}

	public String getCodeOpt() {
		return codeOpt;
	}

	public void setCodeOpt(String codeOpt) {
		this.codeOpt = codeOpt;
	}

	public String getCodeSem() {
		return codeSem;
	}

	public void setCodeSem(String codeSem) {
		this.codeSem = codeSem;
	}

	public String getNomGr() {
		return nomGr;
	}

	public void setNomGr(String nomGr) {
		this.nomGr = nomGr;
	}

	public String getNomSousGr() {
		return nomSousGr;
	}

	public void setNomSousGr(String nomSousGr) {
		this.nomSousGr = nomSousGr;
	}

	public String getNomMod() {
		return nomMod;
	}

	public void setNomMod(String nomMod) {
		this.nomMod = nomMod;
	}

	public String getNomMat() {
		return nomMat;
	}

	public void setNomMat(String nomMat) {
		this.nomMat = nomMat;
	}

	public Long getIdProf() {
		return idProf;
	}

	public void setIdProf(Long idProf) {
		this.idProf = idProf;
	}

	public String getCodeMat() {
		return codeMat;
	}

	public void setCodeMat(String codeMat) {
		this.codeMat = codeMat;
	}	

}
