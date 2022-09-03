package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class EtablissementDiplome {

private Long idEtablissement;
	private String nomEtablissement;
	private String typeEtablissement;
private List<Ville> villes;
private List<Etudiant> etudiants;

	public EtablissementDiplome() {
		super();
	}

	public EtablissementDiplome(Long idEtablissement, String nomEtablissement, String typeEtablissement, List<Ville> villes,
			List<Etudiant> etudiants) {
		super();
		this.idEtablissement = idEtablissement;
		this.nomEtablissement = nomEtablissement;
		this.typeEtablissement = typeEtablissement;
		this.villes = villes;
		this.etudiants = etudiants;
	}

	public Long getIdEtablissement() {
		return idEtablissement;
	}

	public void setIdEtablissement(Long idEtablissement) {
		this.idEtablissement = idEtablissement;
	}

	public String getNomEtablissement() {
		return nomEtablissement;
	}

	public void setNomEtablissement(String nomEtablissement) {
		this.nomEtablissement = nomEtablissement;
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

	public String getTypeEtablissement() {
		return typeEtablissement;
	}

	public void setTypeEtablissement(String typeEtablissement) {
		this.typeEtablissement = typeEtablissement;
	}

}
