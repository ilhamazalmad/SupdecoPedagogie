package ma.supdeco.pedagogie.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import ma.supdeco.pedagogie.bean.util.Auditable;

@Entity
@Table(name = "seance")
@SQLDelete(sql = "UPDATE seance SET deleted = true WHERE idSeance=?")
@Where(clause = "deleted=false")
public class Seance extends Auditable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idSeance;
	private String disponibilite; // (une fois au toujours )
	private boolean stop;

	@ManyToOne
	@JoinColumn(name = "idHeureDebut", nullable = false)
	private HeureSeance heureDebut;

	@ManyToOne
	@JoinColumn(name = "idHeureFin", nullable = false)
	private HeureSeance heureFin;

	@ManyToOne
	@JoinColumn(name = "idJour", nullable = false)
	private Jour jour;

	@ManyToOne
	@JoinColumn(name = "idSalle", nullable = false)
	private Salle salle;

	@ManyToOne
	@JoinColumn(name = "IdTypeSeance", nullable = false)
	private TypeSeance typeSeance;

	@ManyToOne
	@JoinColumn(name = "idAffectation", nullable = false)
	private AffectationMatiere affectationMatiere;

	@OneToMany(mappedBy = "seance", cascade = CascadeType.MERGE)
	private List<Fiche> fiches;

	private boolean deleted = Boolean.FALSE;

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

	public Seance(Long idSeance, String disponibilite, boolean stop, HeureSeance heureDebut, HeureSeance heureFin,
			Jour jour, Salle salle, TypeSeance typeSeance, AffectationMatiere affectationMatiere, List<Fiche> fiches,
			boolean deleted) {
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
		this.deleted = deleted;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
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