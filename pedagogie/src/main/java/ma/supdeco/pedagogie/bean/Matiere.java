package ma.supdeco.pedagogie.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import ma.supdeco.pedagogie.bean.util.Auditable;

@Entity
@Table(name = "matiere")
@SQLDelete(sql = "UPDATE matiere SET deleted = true WHERE codeMatiere=?")
@Where(clause = "deleted=false")
public class Matiere extends Auditable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String codeMatiere;
	private String titreMatiere;

	@OneToMany(mappedBy = "matiere", cascade = CascadeType.MERGE)
	private List<MatiereAnnee> matiereAnnee;

	private boolean deleted = Boolean.FALSE;

	public Matiere() {
		super();
	}

	public Matiere(String codeMatiere, String titreMatiere, List<MatiereAnnee> matiereAnnee) {
		super();
		this.codeMatiere = codeMatiere;
		this.titreMatiere = titreMatiere;
		this.matiereAnnee = matiereAnnee;
	}

	public Matiere(String codeMatiere, String titreMatiere, List<MatiereAnnee> matiereAnnee, boolean deleted) {
		super();
		this.codeMatiere = codeMatiere;
		this.titreMatiere = titreMatiere;
		this.matiereAnnee = matiereAnnee;
		this.deleted = deleted;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getCodeMatiere() {
		return codeMatiere;
	}

	public void setCodeMatiere(String codeMatiere) {
		this.codeMatiere = codeMatiere;
	}

	public String getTitreMatiere() {
		return titreMatiere;
	}

	public void setTitreMatiere(String titreMatiere) {
		this.titreMatiere = titreMatiere;
	}

	public List<MatiereAnnee> getMatiereAnnee() {
		return matiereAnnee;
	}

	public void setMatiereAnnee(List<MatiereAnnee> matiereAnnee) {
		this.matiereAnnee = matiereAnnee;
	}

}
