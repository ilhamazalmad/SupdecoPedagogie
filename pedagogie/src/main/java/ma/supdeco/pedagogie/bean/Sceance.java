package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sceance")

public class Sceance implements Serializable{

	@Id
	@GeneratedValue
	private Long idSc;
	private String date;
	private String hr_db;
	private String hr_fin;
	private String jour;
	private String duree;
	private Double heure;
	private String type;
	private String nomNiv;
	private String codeOpt;
	private String codeSem;
	private String nomGr;
	private String nomSousGr;
	private String prof;
	private String nomMod;
	private String nomMat;
	private String salle;
	private String disponibilite;
	
	@OneToMany(mappedBy = "sceance")
	List<Fiche> fiche;
	
	public Sceance() {
		
	}

	public Long getIdSc() {
		return idSc;
	}


	public void setIdSc(Long idSc) {
		this.idSc = idSc;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getHr_db() {
		return hr_db;
	}


	public void setHr_db(String hr_db) {
		this.hr_db = hr_db;
	}


	public String getHr_fin() {
		return hr_fin;
	}


	public void setHr_fin(String hr_fin) {
		this.hr_fin = hr_fin;
	}


	public String getDuree() {
		return duree;
	}


	public void setDuree(String duree) {
		this.duree = duree;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

	public String getJour() {
		return jour;
	}

	public void setJour(String jour) {
		this.jour = jour;
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

	public String getProf() {
		return prof;
	}

	public void setProf(String prof) {
		this.prof = prof;
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

	public String getSalle() {
		return salle;
	}

	public void setSalle(String salle) {
		this.salle = salle;
	}

	public String getDisponibilite() {
		return disponibilite;
	}

	public void setDisponibilite(String disponibilite) {
		this.disponibilite = disponibilite;
	}

	public List<Fiche> getFiche() {
		return fiche;
	}

	public void setFiche(List<Fiche> fiche) {
		this.fiche = fiche;
	}

	public Double getHeure() {
		return heure;
	}

	public void setHeure(Double heure) {
		this.heure = heure;
	}
}
