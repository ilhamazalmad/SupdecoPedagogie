package ma.supdeco.pedagogie.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rubProfSaved")
public class RubProfSaved {

	@Id
	@GeneratedValue
	private Long idRubProfSaved;
	private String rubProf;
	private String prof;
	private double heureRub;
	private double montantRub;
	private String dateRub;
	private String nomNiv;
	
	public Long getIdRubProfSaved() {
		return idRubProfSaved;
	}
	public void setIdRubProfSaved(Long idRubProfSaved) {
		this.idRubProfSaved = idRubProfSaved;
	}
	public String getRubProf() {
		return rubProf;
	}
	public void setRubProf(String rubProf) {
		this.rubProf = rubProf;
	}
	public double getHeureRub() {
		return heureRub;
	}
	public void setHeureRub(double heureRub) {
		this.heureRub = heureRub;
	}
	public double getMontantRub() {
		return montantRub;
	}
	public void setMontantRub(double montantRub) {
		this.montantRub = montantRub;
	}
	public String getDateRub() {
		return dateRub;
	}
	public void setDateRub(String dateRub) {
		this.dateRub = dateRub;
	}
	public String getProf() {
		return prof;
	}
	public void setProf(String prof) {
		this.prof = prof;
	}
	public String getNomNiv() {
		return nomNiv;
	}
	public void setNomNiv(String nomNiv) {
		this.nomNiv = nomNiv;
	}
}
