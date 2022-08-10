package ma.supdeco.pedagogie.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "absenceMat")
public class AbsenceProfesseur implements Serializable{

	@Id
	@GeneratedValue
	private Long idAbsMat;
	private String ins;
	private String nomPrenom;
	private String totalAbs;
	private String absMat;
	private String codeMat;
	
	public AbsenceProfesseur() {
		
	}

	 public AbsenceProfesseur(String ins, String nomPrenom,String absMat) {
	        super();
	        this.ins = ins;
	        this.nomPrenom = nomPrenom;
	        this.absMat = absMat;
	 }
	
	public Long getIdAbsMat() {
		return idAbsMat;
	}
	public void setIdAbsMat(Long idAbsMat) {
		this.idAbsMat = idAbsMat;
	}
	public String getTotalAbs() {
		return totalAbs;
	}
	public void setTotalAbs(String totalAbs) {
		this.totalAbs = totalAbs;
	}
	public String getAbsMat() {
		return absMat;
	}
	public void setAbsMat(String absMat) {
		this.absMat = absMat;
	}
	public String getCodeMat() {
		return codeMat;
	}
	public void setCodeMat(String codeMat) {
		this.codeMat = codeMat;
	}
	public String getIns() {
		return ins;
	}
	public void setIns(String ins) {
		this.ins = ins;
	}
	public String getNomPrenom() {
		return nomPrenom;
	}
	public void setNomPrenom(String nomPrenom) {
		this.nomPrenom = nomPrenom;
	}
	
}
