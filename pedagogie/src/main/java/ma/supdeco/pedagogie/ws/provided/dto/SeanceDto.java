package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class SeanceDto extends AuditableDto {

	private String idSeance;
	private String disponibilite; // (une fois au toujours )
	private String stop;
	private HeureSeanceDto heureDebut;
	private HeureSeanceDto heureFin;
	private JourDto jourDto;
	private SalleDto salleDto;
	private TypeSeanceDto typeSeanceDto;
	private AffectationMatiereDto affectationMatiereDto;
	private List<FicheDto> ficheDtos;

	public SeanceDto() {
		super();
	}

	public SeanceDto(String idSeance, String disponibilite, String stop, HeureSeanceDto heureDebut, HeureSeanceDto heureFin,
			JourDto jourDto, SalleDto salleDto, TypeSeanceDto typeSeanceDto, AffectationMatiereDto affectationMatiereDto, List<FicheDto> ficheDtos) {
		super();
		this.idSeance = idSeance;
		this.disponibilite = disponibilite;
		this.stop = stop;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
		this.jourDto = jourDto;
		this.salleDto = salleDto;
		this.typeSeanceDto = typeSeanceDto;
		this.affectationMatiereDto = affectationMatiereDto;
		this.ficheDtos = ficheDtos;
	}

	public String getIdSeance() {
		return idSeance;
	}

	public void setIdSeance(String idSeance) {
		this.idSeance = idSeance;
	}

	public String getDisponibilite() {
		return disponibilite;
	}

	public void setDisponibilite(String disponibilite) {
		this.disponibilite = disponibilite;
	}

	public String isStop() {
		return stop;
	}

	public void setStop(String stop) {
		this.stop = stop;
	}

	public HeureSeanceDto getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(HeureSeanceDto heureDebut) {
		this.heureDebut = heureDebut;
	}

	public HeureSeanceDto getHeureFin() {
		return heureFin;
	}

	public void setHeureFin(HeureSeanceDto heureFin) {
		this.heureFin = heureFin;
	}

	public JourDto getJour() {
		return jourDto;
	}

	public void setJour(JourDto jourDto) {
		this.jourDto = jourDto;
	}

	public SalleDto getSalle() {
		return salleDto;
	}

	public void setSalle(SalleDto salleDto) {
		this.salleDto = salleDto;
	}

	public TypeSeanceDto getTypeSeance() {
		return typeSeanceDto;
	}

	public void setTypeSeance(TypeSeanceDto typeSeanceDto) {
		this.typeSeanceDto = typeSeanceDto;
	}

	public AffectationMatiereDto getAffectationMatiere() {
		return affectationMatiereDto;
	}

	public void setAffectationMatiere(AffectationMatiereDto affectationMatiereDto) {
		this.affectationMatiereDto = affectationMatiereDto;
	}

	public List<FicheDto> getFiches() {
		return ficheDtos;
	}

	public void setFiches(List<FicheDto> ficheDtos) {
		this.ficheDtos = ficheDtos;
	}

}