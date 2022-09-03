package ma.supdeco.pedagogie.ws.provided.dto;

public class SurveillantAnnee extends Auditable{

private Long idSurveillantAnnee;
private Surveillant surveillant;
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