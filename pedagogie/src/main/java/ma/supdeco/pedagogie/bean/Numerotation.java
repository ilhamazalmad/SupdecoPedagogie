package ma.supdeco.pedagogie.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "numero")
public class Numerotation implements Serializable{

	@Id
	@GeneratedValue
	private Long idNum;
	private String session;
	private String type;
	private String date;
	private String niveau;
	private String semestre;
	private String module;
	private String matiere;
	private String nbEtud;
	private String nbInt;
	private String salle1;
	private String salle2;
	private String salle3;
	private String salle4;
	private String salle5;
	private String nbSalle1;
	private String nbSalle2;
	private String nbSalle3;
	private String nbSalle4;
	private String nbSalle5;
	public Long getIdNum() {
		return idNum;
	}
	public void setIdNum(Long idNum) {
		this.idNum = idNum;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	public String getNbEtud() {
		return nbEtud;
	}
	public void setNbEtud(String nbEtud) {
		this.nbEtud = nbEtud;
	}
	public String getNbInt() {
		return nbInt;
	}
	public void setNbInt(String nbInt) {
		this.nbInt = nbInt;
	}
	public String getSalle1() {
		return salle1;
	}
	public void setSalle1(String salle1) {
		this.salle1 = salle1;
	}
	public String getSalle2() {
		return salle2;
	}
	public void setSalle2(String salle2) {
		this.salle2 = salle2;
	}
	public String getSalle3() {
		return salle3;
	}
	public void setSalle3(String salle3) {
		this.salle3 = salle3;
	}
	public String getSalle4() {
		return salle4;
	}
	public void setSalle4(String salle4) {
		this.salle4 = salle4;
	}
	public String getSalle5() {
		return salle5;
	}
	public void setSalle5(String salle5) {
		this.salle5 = salle5;
	}
	public String getNbSalle1() {
		return nbSalle1;
	}
	public void setNbSalle1(String nbSalle1) {
		this.nbSalle1 = nbSalle1;
	}
	public String getNbSalle2() {
		return nbSalle2;
	}
	public void setNbSalle2(String nbSalle2) {
		this.nbSalle2 = nbSalle2;
	}
	public String getNbSalle3() {
		return nbSalle3;
	}
	public void setNbSalle3(String nbSalle3) {
		this.nbSalle3 = nbSalle3;
	}
	public String getNbSalle4() {
		return nbSalle4;
	}
	public void setNbSalle4(String nbSalle4) {
		this.nbSalle4 = nbSalle4;
	}
	public String getNbSalle5() {
		return nbSalle5;
	}
	public void setNbSalle5(String nbSalle5) {
		this.nbSalle5 = nbSalle5;
	}
	
}
