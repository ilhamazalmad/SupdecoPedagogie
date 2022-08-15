package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import java.util.Collection;
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

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "ville")
public class Ville {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idVille;
	private String ville;

	@OneToMany(mappedBy = "ville", cascade = CascadeType.MERGE)
	private List<Etudiant> etudiants;

	@ManyToOne
	@JoinColumn(name = "idPays", nullable = false)
	private Pays pays;

	public Ville() {
		super();
	}

	public Ville(int idVille, String ville, List<Etudiant> etudiants, Pays pays) {
		super();
		this.idVille = idVille;
		this.ville = ville;
		this.etudiants = etudiants;
		this.pays = pays;
	}

	public int getIdVille() {
		return idVille;
	}

	public void setIdVille(int idVille) {
		this.idVille = idVille;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}

}
