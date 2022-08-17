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
@Table(name = "pays")
public class Pays {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idPays;
	private String pays;
	private String codeIso3;

	@OneToMany(mappedBy="pays",cascade = CascadeType.MERGE)
	private List<Ville> villes;
	
	@OneToMany(mappedBy="nationalite",cascade = CascadeType.MERGE)
	private List<Etudiant> etudiants;

	public Pays() {
		super();
	}

	public int getIdPays() {
		return idPays;
	}

	public void setIdPays(int idPays) {
		this.idPays = idPays;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getCodeIso3() {
		return codeIso3;
	}

	public void setCodeIso3(String codeIso3) {
		this.codeIso3 = codeIso3;
	}

	public List<Ville> getVilles() {
		return villes;
	}

	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	
	

}
