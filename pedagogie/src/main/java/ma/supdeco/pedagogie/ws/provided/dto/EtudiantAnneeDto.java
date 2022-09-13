package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class EtudiantAnneeDto extends AuditableDto {

	private String idEtudiantAnnee;
	private String depart;
	private String dateDepart;
	private EtudiantDto etudiantDto;
	private NiveauDto niveauDto;
	private AnneeDto anneeDto;
	private GroupeAnneeDto groupeAnneeDto;
	private OptionAnneeDto optionAnneeDto;
	private List<SousGroupeAnneeDto> sousGroupeAnneeDtos;
	private List<ControleDto> controleDtos;
	private List<ExamenDto> examenDtos;
	private List<RachetageDto> rachetageDtos;
	private List<NumerotationDto> numerotationDtos;
	private List<AbsenceDto> absenceDtos;
	private List<ArretCoursDto> arretCoursDto;
	private List<AvertissementAbsenceDto> avertissementAbsenceDtos;

	public EtudiantAnneeDto() {
		super();
	}

	public EtudiantAnneeDto(String idEtudiantAnnee, String depart, String dateDepart, EtudiantDto etudiantDto,
			NiveauDto niveauDto, AnneeDto anneeDto, GroupeAnneeDto groupeAnneeDto, OptionAnneeDto optionAnneeDto,
			List<SousGroupeAnneeDto> sousGroupeAnneeDtos, List<ControleDto> controleDtos, List<ExamenDto> examenDtos,
			List<RachetageDto> rachetageDtos, List<NumerotationDto> numerotationDtos, List<AbsenceDto> absenceDtos,
			List<ArretCoursDto> arretCoursDto, List<AvertissementAbsenceDto> avertissementAbsenceDtos) {
		super();
		this.idEtudiantAnnee = idEtudiantAnnee;
		this.depart = depart;
		this.dateDepart = dateDepart;
		this.etudiantDto = etudiantDto;
		this.niveauDto = niveauDto;
		this.anneeDto = anneeDto;
		this.groupeAnneeDto = groupeAnneeDto;
		this.optionAnneeDto = optionAnneeDto;
		this.sousGroupeAnneeDtos = sousGroupeAnneeDtos;
		this.controleDtos = controleDtos;
		this.examenDtos = examenDtos;
		this.rachetageDtos = rachetageDtos;
		this.numerotationDtos = numerotationDtos;
		this.absenceDtos = absenceDtos;
		this.arretCoursDto = arretCoursDto;
		this.avertissementAbsenceDtos = avertissementAbsenceDtos;
	}

	public String getIdEtudiantAnnee() {
		return idEtudiantAnnee;
	}

	public void setIdEtudiantAnnee(String idEtudiantAnnee) {
		this.idEtudiantAnnee = idEtudiantAnnee;
	}

	public String isDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(String dateDepart) {
		this.dateDepart = dateDepart;
	}

	public EtudiantDto getEtudiant() {
		return etudiantDto;
	}

	public void setEtudiant(EtudiantDto etudiantDto) {
		this.etudiantDto = etudiantDto;
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

	public GroupeAnneeDto getGroupeAnnee() {
		return groupeAnneeDto;
	}

	public void setGroupeAnnee(GroupeAnneeDto groupeAnneeDto) {
		this.groupeAnneeDto = groupeAnneeDto;
	}

	public OptionAnneeDto getOptionAnnee() {
		return optionAnneeDto;
	}

	public void setOptionAnnee(OptionAnneeDto optionAnneeDto) {
		this.optionAnneeDto = optionAnneeDto;
	}

	public List<SousGroupeAnneeDto> getSousGroupeAnnees() {
		return sousGroupeAnneeDtos;
	}

	public void setSousGroupeAnnees(List<SousGroupeAnneeDto> sousGroupeAnneeDtos) {
		this.sousGroupeAnneeDtos = sousGroupeAnneeDtos;
	}

	public List<ControleDto> getControles() {
		return controleDtos;
	}

	public void setControles(List<ControleDto> controleDtos) {
		this.controleDtos = controleDtos;
	}

	public List<ExamenDto> getExamens() {
		return examenDtos;
	}

	public void setExamens(List<ExamenDto> examenDtos) {
		this.examenDtos = examenDtos;
	}

	public List<RachetageDto> getRachetages() {
		return rachetageDtos;
	}

	public void setRachetages(List<RachetageDto> rachetageDtos) {
		this.rachetageDtos = rachetageDtos;
	}

	public List<NumerotationDto> getNumerotations() {
		return numerotationDtos;
	}

	public void setNumerotations(List<NumerotationDto> numerotationDtos) {
		this.numerotationDtos = numerotationDtos;
	}

	public List<AbsenceDto> getAbsenceEtudiants() {
		return absenceDtos;
	}

	public void setAbsenceEtudiants(List<AbsenceDto> absenceDtos) {
		this.absenceDtos = absenceDtos;
	}

	public List<ArretCoursDto> getArretCours() {
		return arretCoursDto;
	}

	public void setArretCours(List<ArretCoursDto> arretCoursDto) {
		this.arretCoursDto = arretCoursDto;
	}

	public List<AvertissementAbsenceDto> getAvertissementAbsences() {
		return avertissementAbsenceDtos;
	}

	public void setAvertissementAbsences(List<AvertissementAbsenceDto> avertissementAbsenceDtos) {
		this.avertissementAbsenceDtos = avertissementAbsenceDtos;
	}

}