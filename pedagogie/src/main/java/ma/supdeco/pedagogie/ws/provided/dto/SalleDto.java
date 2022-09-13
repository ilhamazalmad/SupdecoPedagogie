package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class SalleDto {

	private String codeSalle;
	private String nom;
	private String nbrTables;
	private List<SeanceDto> seanceDtos;
	private List<NumerotationDto> numerotationDtos;
	private TypeSalleDto typeSalleDto;

	public SalleDto() {
		super();
	}

	public SalleDto(String codeSalle, String nom, String nbrTables, List<SeanceDto> seanceDtos, List<NumerotationDto> numerotationDtos,
			TypeSalleDto typeSalleDto) {
		super();
		this.codeSalle = codeSalle;
		this.nom = nom;
		this.nbrTables = nbrTables;
		this.seanceDtos = seanceDtos;
		this.numerotationDtos = numerotationDtos;
		this.typeSalleDto = typeSalleDto;
	}

	public String getCodeSalle() {
		return codeSalle;
	}

	public void setCodeSalle(String codeSalle) {
		this.codeSalle = codeSalle;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNbrTables() {
		return nbrTables;
	}

	public void setNbrTables(String nbrTables) {
		this.nbrTables = nbrTables;
	}

	public List<SeanceDto> getSeances() {
		return seanceDtos;
	}

	public void setSeances(List<SeanceDto> seanceDtos) {
		this.seanceDtos = seanceDtos;
	}

	public List<NumerotationDto> getNumerotations() {
		return numerotationDtos;
	}

	public void setNumerotations(List<NumerotationDto> numerotationDtos) {
		this.numerotationDtos = numerotationDtos;
	}

	public TypeSalleDto getTypeSalle() {
		return typeSalleDto;
	}

	public void setTypeSalle(TypeSalleDto typeSalleDto) {
		this.typeSalleDto = typeSalleDto;
	}

}
