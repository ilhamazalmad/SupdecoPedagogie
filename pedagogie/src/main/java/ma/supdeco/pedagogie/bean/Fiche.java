package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "fiche")
public class Fiche implements Serializable{

	@Id
	@GeneratedValue
	private Long codeFiche;
	
	@ManyToOne
	@JoinColumn(name="idSc")
	private Sceance sceance;
	
	private String msg;
	private String dateFiche;
	private String jourFiche;
	private boolean valide;
	
	@OneToMany(mappedBy = "fiche")
	List<AbsenceEtudiant> absenceEtudiant;
	
	
	public Fiche() {
		
	}

	public Long getCodeFiche() {
		return codeFiche;
	}

	public void setCodeFiche(Long codeFiche) {
		this.codeFiche = codeFiche;
	}

	public Sceance getSceance() {
		return sceance;
	}

	public void setSceance(Sceance sceance) {
		this.sceance = sceance;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getDateFiche() {
		return dateFiche;
	}

	public void setDateFiche(String dateFiche) {
		this.dateFiche = dateFiche;
	}

	public String getJourFiche() {
		return jourFiche;
	}

	public void setJourFiche(String jourFiche) {
		this.jourFiche = jourFiche;
	}

	public List<AbsenceEtudiant> getAbsence() {
		return absenceEtudiant;
	}

	public void setAbsence(List<AbsenceEtudiant> absenceEtudiant) {
		this.absenceEtudiant = absenceEtudiant;
	}

	public boolean isValide() {
		return valide;
	}

	public void setValide(boolean valide) {
		this.valide = valide;
	}
	
}
