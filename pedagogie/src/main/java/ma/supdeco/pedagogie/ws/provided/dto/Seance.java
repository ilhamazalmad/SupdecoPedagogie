package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class Seance extends Auditable{

private Long idSeance;
	private String disponibilite; // (une fois au toujours )
	private boolean stop;
private HeureSeance heureDebut;
private HeureSeance heureFin;
private Jour jour;
private Salle salle;
private TypeSeance typeSeance;
private AffectationMatiere affectationMatiere;
private List<Fiche> fiches;

	public Seance() {
		super();
	}

	public Seance(Long idSeance, String disponibilite, boolean stop, HeureSeance heureDebut, HeureSeance heureFin,
			Jour jour, Salle salle, TypeSeance typeSeance, AffectationMatiere affectationMatiere, List<Fiche> fiches) {
		super();
		this.idSeance = idSeance;
		this.disponibilite = disponibilite;
		this.stop = stop;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
		this.jour = jour;
		this.salle = salle;
		this.typeSeance = typeSeance;
		this.affectationMatiere = affectationMatiere;
		this.fiches = fiches;
	}

	public Long getIdSeance() {
		return idSeance;
	}

	public void setIdSeance(Long idSeance) {
		this.idSeance = idSeance;
	}

	public String getDisponibilite() {
		return disponibilite;
	}

	public void setDisponibilite(String disponibilite) {
		this.disponibilite = disponibilite;
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public HeureSeance getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(HeureSeance heureDebut) {
		this.heureDebut = heureDebut;
	}

	public HeureSeance getHeureFin() {
		return heureFin;
	}

	public void setHeureFin(HeureSeance heureFin) {
		this.heureFin = heureFin;
	}

	public Jour getJour() {
		return jour;
	}

	public void setJour(Jour jour) {
		this.jour = jour;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public TypeSeance getTypeSeance() {
		return typeSeance;
	}

	public void setTypeSeance(TypeSeance typeSeance) {
		this.typeSeance = typeSeance;
	}

	public AffectationMatiere getAffectationMatiere() {
		return affectationMatiere;
	}

	public void setAffectationMatiere(AffectationMatiere affectationMatiere) {
		this.affectationMatiere = affectationMatiere;
	}

	public List<Fiche> getFiches() {
		return fiches;
	}

	public void setFiches(List<Fiche> fiches) {
		this.fiches = fiches;
	}

}