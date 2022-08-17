package ma.supdeco.pedagogie.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "surveillantAnnee")
public class SurveillantAnnee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idSurveillantAnnee;

	@ManyToOne
	@JoinColumn(name = "idSurveillant", nullable = false)
	private Surveillant surveillant;

	@ManyToOne
	@JoinColumn(name = "idAnnee", nullable = false)
	private Annee annee;

	public SurveillantAnnee() {
		super();
	}

	public SurveillantAnnee(int idSurveillantAnnee, Surveillant surveillant, Annee annee) {
		super();
		this.idSurveillantAnnee = idSurveillantAnnee;
		this.surveillant = surveillant;
		this.annee = annee;
	}

	public int getIdSurveillantAnnee() {
		return idSurveillantAnnee;
	}

	public void setIdSurveillantAnnee(int idSurveillantAnnee) {
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