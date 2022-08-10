package ma.supdeco.pedagogie.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rubProf")
public class RubriqueProfesseur implements Serializable{

	@Id
	@GeneratedValue
	private Long idRubProf;
	private String rubProf;
	private String niveau;
	private double taux;
	private String prof;
	
	public Long getIdRubProf() {
		return idRubProf;
	}
	public void setIdRubProf(Long idRubProf) {
		this.idRubProf = idRubProf;
	}
	public String getRubProf() {
		return rubProf;
	}
	public void setRubProf(String rubProf) {
		this.rubProf = rubProf;
	}
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public String getProf() {
		return prof;
	}
	public void setProf(String prof) {
		this.prof = prof;
	}
}
