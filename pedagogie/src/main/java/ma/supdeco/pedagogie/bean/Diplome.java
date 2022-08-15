package ma.supdeco.pedagogie.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "diplome")
public class Diplome {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idDiplome;
	private String titreDiplome;

	@OneToMany(mappedBy = "diplome", cascade = CascadeType.MERGE)
	private List<Etudiant> etudiants;

	public Diplome() {
		super();
	}

	public Diplome(int idDiplome, String titreDiplome, List<Etudiant> etudiants) {
		super();
		this.idDiplome = idDiplome;
		this.titreDiplome = titreDiplome;
		this.etudiants = etudiants;
	}

	public int getIdDiplome() {
		return idDiplome;
	}

	public void setIdDiplome(int idDiplome) {
		this.idDiplome = idDiplome;
	}

	public String getTitreDiplome() {
		return titreDiplome;
	}

	public void setTitreDiplome(String titreDiplome) {
		this.titreDiplome = titreDiplome;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	

}
