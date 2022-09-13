package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class TypeSeanceDto {

	private String codeType;
	private String typeSeance;
	private List<SeanceDto> seanceDtos;

	public TypeSeanceDto() {
		super();
	}

	public TypeSeanceDto(String codeType, String typeSeance, List<SeanceDto> seanceDtos) {
		super();
		this.codeType = codeType;
		this.typeSeance = typeSeance;
		this.seanceDtos = seanceDtos;
	}

	public String getCodeType() {
		return codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getTypeSeance() {
		return typeSeance;
	}

	public void setTypeSeance(String typeSeance) {
		this.typeSeance = typeSeance;
	}

	public List<SeanceDto> getSeances() {
		return seanceDtos;
	}

	public void setSeances(List<SeanceDto> seanceDtos) {
		this.seanceDtos = seanceDtos;
	}

}
