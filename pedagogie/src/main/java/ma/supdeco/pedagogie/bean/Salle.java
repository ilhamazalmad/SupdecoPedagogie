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

@Entity
@Table(name = "salle")
@SQLDelete(sql = "UPDATE salle SET deleted = true WHERE codeSalle=?")
@Where(clause = "deleted=false")
public class Salle {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String codeSalle;
	private String nom;
	private int nbrTables;

	@OneToMany(mappedBy = "salle", cascade = CascadeType.MERGE)
	private List<Seance> seances;

	@OneToMany(mappedBy = "salle", cascade = CascadeType.MERGE)
	private List<Numerotation> numerotations;

	@ManyToOne
	@JoinColumn(name = "idType", nullable = false)
	private TypeSalle typeSalle;

	private boolean deleted = Boolean.FALSE;

	public Salle() {
		super();
	}

	public Salle(String codeSalle, String nom, int nbrTables, List<Seance> seances, List<Numerotation> numerotations,
			TypeSalle typeSalle) {
		super();
		this.codeSalle = codeSalle;
		this.nom = nom;
		this.nbrTables = nbrTables;
		this.seances = seances;
		this.numerotations = numerotations;
		this.typeSalle = typeSalle;
	}

	public Salle(String codeSalle, String nom, int nbrTables, List<Seance> seances, List<Numerotation> numerotations,
			TypeSalle typeSalle, boolean deleted) {
		super();
		this.codeSalle = codeSalle;
		this.nom = nom;
		this.nbrTables = nbrTables;
		this.seances = seances;
		this.numerotations = numerotations;
		this.typeSalle = typeSalle;
		this.deleted = deleted;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getCodeSalle() {
		return codeSalle;
	}

	public void setCodeSalle(String codeSalle) {
		this.codeSalle = codeSalle;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbrTables() {
		return nbrTables;
	}

	public void setNbrTables(int nbrTables) {
		this.nbrTables = nbrTables;
	}

	public List<Seance> getSeances() {
		return seances;
	}

	public void setSeances(List<Seance> seances) {
		this.seances = seances;
	}

	public List<Numerotation> getNumerotations() {
		return numerotations;
	}

	public void setNumerotations(List<Numerotation> numerotations) {
		this.numerotations = numerotations;
	}

	public TypeSalle getTypeSalle() {
		return typeSalle;
	}

	public void setTypeSalle(TypeSalle typeSalle) {
		this.typeSalle = typeSalle;
	}

}
