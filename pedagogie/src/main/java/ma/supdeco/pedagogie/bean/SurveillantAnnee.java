package ma.supdeco.pedagogie.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ma.supdeco.pedagogie.bean.util.Auditable;

@Entity
@Table(name = "surveillantAnnee")
public class SurveillantAnnee extends Auditable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idSurveillantAnnee;

	@ManyToOne
	@JoinColumn(name = "idSurveillant", nullable = false)
	private Surveillant surveillant;

	@ManyToOne
	@JoinColumn(name = "idAnnee", nullable = false)
	private Annee annee;

	public SurveillantAnnee() {
		super();
	}

	public SurveillantAnnee(Long idSurveillantAnnee, Surveillant surveillant, Annee annee) {
		super();
		this.idSurveillantAnnee = idSurveillantAnnee;
		this.surveillant = surveillant;
		this.annee = annee;
	}

	public Long getIdSurveillantAnnee() {
		return idSurveillantAnnee;
	}

	public void setIdSurveillantAnnee(Long idSurveillantAnnee) {
		this.idSurveillantAnnee = idSurveillantAnnee;
	}

	public Surveillant getSurveillant() {
		return surveillant;
	}

	public void setSurveillant(Surveillant surveillant) {
		this.surveillant = surveillant;
	}

	public Annee getAnnee() {
		return annee;
	}

	public void setAnnee(Annee annee) {
		this.annee = annee;
	}

}