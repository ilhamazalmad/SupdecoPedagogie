package ma.supdeco.pedagogie.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ma.supdeco.pedagogie.bean.util.Auditable;

import java.util.Date;

@Entity
@Table(name = "avertissementAbsence")
public class AvertissementAbsence extends Auditable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idAvertissement;
	private boolean avertis;
	private boolean conseil;
	private boolean presentConseil;
	private boolean engage;
	private boolean fin;
	private Date dateAvertissement;
	private Date dateConseil;
	private Date dateEngagement;

	@ManyToOne
	@JoinColumn(name = "idEtudiant", nullable = false)
	private EtudiantAnnee etudiantAnnee;

	@ManyToOne
	@JoinColumn(name = "idSemestre", nullable = false)
	private SemestreNiveau semestreNiveau;

	public AvertissementAbsence() {
		super();
	}

	public AvertissementAbsence(int idAvertissement, boolean avertis, boolean conseil, boolean presentConseil,
			boolean engage, boolean fin, Date dateAvertissement, Date dateConseil, Date dateEngagement,
			EtudiantAnnee etudiantAnnee, SemestreNiveau semestreNiveau) {
		super();
		this.idAvertissement = idAvertissement;
		this.avertis = avertis;
		this.conseil = conseil;
		this.presentConseil = presentConseil;
		this.engage = engage;
		this.fin = fin;
		this.dateAvertissement = dateAvertissement;
		this.dateConseil = dateConseil;
		this.dateEngagement = dateEngagement;
		this.etudiantAnnee = etudiantAnnee;
		this.semestreNiveau = semestreNiveau;
	}

	public int getIdAvertissement() {
		return idAvertissement;
	}

	public void setIdAvertissement(int idAvertissement) {
		this.idAvertissement = idAvertissement;
	}

	public boolean isAvertis() {
		return avertis;
	}

	public void setAvertis(boolean avertis) {
		this.avertis = avertis;
	}

	public boolean isConseil() {
		return conseil;
	}

	public void setConseil(boolean conseil) {
		this.conseil = conseil;
	}

	public boolean isPresentConseil() {
		return presentConseil;
	}

	public void setPresentConseil(boolean presentConseil) {
		this.presentConseil = presentConseil;
	}

	public boolean isEngage() {
		return engage;
	}

	public void setEngage(boolean engage) {
		this.engage = engage;
	}

	public boolean isFin() {
		return fin;
	}

	public void setFin(boolean fin) {
		this.fin = fin;
	}

	public Date getDateAvertissement() {
		return dateAvertissement;
	}

	public void setDateAvertissement(Date dateAvertissement) {
		this.dateAvertissement = dateAvertissement;
	}

	public Date getDateConseil() {
		return dateConseil;
	}

	public void setDateConseil(Date dateConseil) {
		this.dateConseil = dateConseil;
	}

	public Date getDateEngagement() {
		return dateEngagement;
	}

	public void setDateEngagement(Date dateEngagement) {
		this.dateEngagement = dateEngagement;
	}

	public EtudiantAnnee getEtudiantAnnee() {
		return etudiantAnnee;
	}

	public void setEtudiantAnnee(EtudiantAnnee etudiantAnnee) {
		this.etudiantAnnee = etudiantAnnee;
	}

	public SemestreNiveau getSemestreNiveau() {
		return semestreNiveau;
	}

	public void setSemestreNiveau(SemestreNiveau semestreNiveau) {
		this.semestreNiveau = semestreNiveau;
	}

}
