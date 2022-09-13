package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class GroupeAnneeDto {

	private String idGroupeAnnee;
	private NiveauDto niveauDto;
	private AnneeDto anneeDto;
	private GroupeDto groupeDto;
	private List<EtudiantAnneeDto> etudiantAnneeDtos;
	private List<AffectationMatiereDto> affectationMatiereDtos;

	public GroupeAnneeDto() {
		super();
	}

	public GroupeAnneeDto(String idGroupeAnnee, NiveauDto niveauDto, AnneeDto anneeDto, GroupeDto groupeDto,
			List<EtudiantAnneeDto> etudiantAnneeDtos, List<AffectationMatiereDto> affectationMatiereDtos) {
		super();
		this.idGroupeAnnee = idGroupeAnnee;
		this.niveauDto = niveauDto;
		this.anneeDto = anneeDto;
		this.groupeDto = groupeDto;
		this.etudiantAnneeDtos = etudiantAnneeDtos;
		this.affectationMatiereDtos = affectationMatiereDtos;
	}

	public String getIdGroupeAnnee() {
		return idGroupeAnnee;
	}

	public void setIdGroupeAnnee(String idGroupeAnnee) {
		this.idGroupeAnnee = idGroupeAnnee;
	}

	public NiveauDto getNiveau() {
		return niveauDto;
	}

	public void setNiveau(NiveauDto niveauDto) {
		this.niveauDto = niveauDto;
	}

	public AnneeDto getAnnee() {
		return anneeDto;
	}

	public void setAnnee(AnneeDto anneeDto) {
		this.anneeDto = anneeDto;
	}

	public GroupeDto getGroupe() {
		return groupeDto;
	}

	public void setGroupe(GroupeDto groupeDto) {
		this.groupeDto = groupeDto;
	}

	public List<EtudiantAnneeDto> getEtudiantAnnees() {
		return etudiantAnneeDtos;
	}

	public void setEtudiantAnnees(List<EtudiantAnneeDto> etudiantAnneeDtos) {
		this.etudiantAnneeDtos = etudiantAnneeDtos;
	}

	public List<AffectationMatiereDto> getAffectationMatieres() {
		return affectationMatiereDtos;
	}

	public void setAffectationMatieres(List<AffectationMatiereDto> affectationMatiereDtos) {
		this.affectationMatiereDtos = affectationMatiereDtos;
	}

}