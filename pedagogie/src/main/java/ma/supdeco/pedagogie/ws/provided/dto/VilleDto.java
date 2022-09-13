package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class VilleDto {

	private String idVille;
	private String ville;
	private List<EtudiantDto> etudiantDtos;
	private List<EtudiantDto> etudiantsNaissances;
	private List<ProfesseurDto> professeurDtos;
	private List<TuteurDto> tuteurDtos;
	private List<SurveillantDto> surveillantDtos;
	private PaysDto paysDto;
	private List<EtablissementDiplomeDto> etablissements;
	private List<LyceeDto> lyceeDtos;

	public VilleDto() {
		super();
	}

	public VilleDto(String idVille, String ville, List<EtudiantDto> etudiantDtos, List<EtudiantDto> etudiantsNaissances,
			List<ProfesseurDto> professeurDtos, List<TuteurDto> tuteurDtos, List<SurveillantDto> surveillantDtos, PaysDto paysDto,
			List<EtablissementDiplomeDto> etablissements, List<LyceeDto> lyceeDtos) {
		super();
		this.idVille = idVille;
		this.ville = ville;
		this.etudiantDtos = etudiantDtos;
		this.etudiantsNaissances = etudiantsNaissances;
		this.professeurDtos = professeurDtos;
		this.tuteurDtos = tuteurDtos;
		this.surveillantDtos = surveillantDtos;
		this.paysDto = paysDto;
		this.etablissements = etablissements;
		this.lyceeDtos = lyceeDtos;
	}

	public String getIdVille() {
		return idVille;
	}

	public void setIdVille(String idVille) {
		this.idVille = idVille;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public List<EtudiantDto> getEtudiants() {
		return etudiantDtos;
	}

	public void setEtudiants(List<EtudiantDto> etudiantDtos) {
		this.etudiantDtos = etudiantDtos;
	}

	public List<EtudiantDto> getEtudiantsNaissances() {
		return etudiantsNaissances;
	}

	public void setEtudiantsNaissances(List<EtudiantDto> etudiantsNaissances) {
		this.etudiantsNaissances = etudiantsNaissances;
	}

	public List<ProfesseurDto> getProfesseurs() {
		return professeurDtos;
	}

	public void setProfesseurs(List<ProfesseurDto> professeurDtos) {
		this.professeurDtos = professeurDtos;
	}

	public List<TuteurDto> getTuteurs() {
		return tuteurDtos;
	}

	public void setTuteurs(List<TuteurDto> tuteurDtos) {
		this.tuteurDtos = tuteurDtos;
	}

	public List<SurveillantDto> getSurveillants() {
		return surveillantDtos;
	}

	public void setSurveillants(List<SurveillantDto> surveillantDtos) {
		this.surveillantDtos = surveillantDtos;
	}

	public PaysDto getPays() {
		return paysDto;
	}

	public void setPays(PaysDto paysDto) {
		this.paysDto = paysDto;
	}

	public List<EtablissementDiplomeDto> getEtablissements() {
		return etablissements;
	}

	public void setEtablissements(List<EtablissementDiplomeDto> etablissements) {
		this.etablissements = etablissements;
	}

	public List<LyceeDto> getLycees() {
		return lyceeDtos;
	}

	public void setLycees(List<LyceeDto> lyceeDtos) {
		this.lyceeDtos = lyceeDtos;
	}

}
