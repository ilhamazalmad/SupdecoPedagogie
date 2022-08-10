package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tauxProf")
public class TauxProfesseur implements Serializable{
	
	@Id
	@GeneratedValue
	private Long idTauxProf;
	private String nomNiv;
	private double tauxProf;
	private String typeSc;
	private String prof;
	
	public Long getIdTauxProf() {
		return idTauxProf;
	}
	public void setIdTauxProf(Long idTauxProf) {
		this.idTauxProf = idTauxProf;
	}
	public String getNomNiv() {
		return nomNiv;
	}
	public void setNomNiv(String nomNiv) {
		this.nomNiv = nomNiv;
	}
	public double getTauxProf() {
		return tauxProf;
	}
	public void setTauxProf(double tauxProf) {
		this.tauxProf = tauxProf;
	}
	public String getTypeSc() {
		return typeSc;
	}
	public void setTypeSc(String typeSc) {
		this.typeSc = typeSc;
	}
	public String getProf() {
		return prof;
	}
	public void setProf(String prof) {
		this.prof = prof;
	}
	
}
