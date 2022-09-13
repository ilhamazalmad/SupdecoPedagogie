package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class NiveauDto {

	private String idNiveau;
	private String niveau;
	public List<SemestreNiveauDto> semestreNiveaux;
	private List<EtudiantAnneeDto> etudiantAnneeDtos;
	private List<SousGroupeAnneeDto> sousGroupeAnneeDtos;
	private List<GroupeAnneeDto> groupeAnneeDtos;

	public NiveauDto() {
		super();
	}

	public NiveauDto(String idNiveau, String niveau, List<SemestreNiveauDto> semestreNiveaux,
			List<EtudiantAnneeDto> etudiantAnneeDtos, List<SousGroupeAnneeDto> sousGroupeAnneeDtos,
			List<GroupeAnneeDto> groupeAnneeDtos) {
		super();
		this.idNiveau = idNiveau;
		this.niveau = niveau;
		this.semestreNiveaux = semestreNiveaux;
		this.etudiantAnneeDtos = etudiantAnneeDtos;
		this.sousGroupeAnneeDtos = sousGroupeAnneeDtos;
		this.groupeAnneeDtos = groupeAnneeDtos;
	}

	public String getIdNiveau() {
		return idNiveau;
	}

	public void setIdNiveau(String idNiveau) {
		this.idNiveau = idNiveau;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public List<SemestreNiveauDto> getSemestreNiveaux() {
		return semestreNiveaux;
	}

	public void setSemestreNiveaux(List<SemestreNiveauDto> semestreNiveaux) {
		this.semestreNiveaux = semestreNiveaux;
	}

	public List<EtudiantAnneeDto> getEtudiantAnnees() {
		return etudiantAnneeDtos;
	}

	public void setEtudiantAnnees(List<EtudiantAnneeDto> etudiantAnneeDtos) {
		this.etudiantAnneeDtos = etudiantAnneeDtos;
	}

	public List<SousGroupeAnneeDto> getSousGroupeAnnees() {
		return sousGroupeAnneeDtos;
	}

	public void setSousGroupeAnnees(List<SousGroupeAnneeDto> sousGroupeAnneeDtos) {
		this.sousGroupeAnneeDtos = sousGroupeAnneeDtos;
	}

	public List<GroupeAnneeDto> getGroupeAnnees() {
		return groupeAnneeDtos;
	}

	public void setGroupeAnnees(List<GroupeAnneeDto> groupeAnneeDtos) {
		this.groupeAnneeDtos = groupeAnneeDtos;
	}

}
