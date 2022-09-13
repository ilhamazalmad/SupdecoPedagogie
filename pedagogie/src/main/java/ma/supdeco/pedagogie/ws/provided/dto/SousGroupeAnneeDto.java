package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class SousGroupeAnneeDto {

	private String idSsGroupeAnnee;
	private NiveauDto niveauDto;
	private AnneeDto anneeDto;
	private SousGroupeDto sousGroupeDto;
	private List<EtudiantAnneeDto> etudiantAnneeDtos;
	private List<AffectationMatiereDto> affectationMatiereDtos;

	public SousGroupeAnneeDto() {
		super();
	}

	public SousGroupeAnneeDto(String idSsGroupeAnnee, NiveauDto niveauDto, AnneeDto anneeDto, SousGroupeDto sousGroupeDto,
			List<EtudiantAnneeDto> etudiantAnneeDtos, List<AffectationMatiereDto> affectationMatiereDtos) {
		super();
		this.idSsGroupeAnnee = idSsGroupeAnnee;
		this.niveauDto = niveauDto;
		this.anneeDto = anneeDto;
		this.sousGroupeDto = sousGroupeDto;
		this.etudiantAnneeDtos = etudiantAnneeDtos;
		this.affectationMatiereDtos = affectationMatiereDtos;
	}

	public String getIdSsGroupeAnnee() {
		return idSsGroupeAnnee;
	}

	public void setIdSsGroupeAnnee(String idSsGroupeAnnee) {
		this.idSsGroupeAnnee = idSsGroupeAnnee;
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

	public SousGroupeDto getSousGroupe() {
		return sousGroupeDto;
	}

	public void setSousGroupe(SousGroupeDto sousGroupeDto) {
		this.sousGroupeDto = sousGroupeDto;
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