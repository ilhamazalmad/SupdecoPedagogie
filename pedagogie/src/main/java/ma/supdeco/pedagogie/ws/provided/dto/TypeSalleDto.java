package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class TypeSalleDto {

	private String idType;
	private String typeSalle;
	private List<SalleDto> salleDtos;

	public TypeSalleDto() {
		super();
	}

	public TypeSalleDto(String idType, String typeSalle, List<SalleDto> salleDtos) {
		super();
		this.idType = idType;
		this.typeSalle = typeSalle;
		this.salleDtos = salleDtos;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getTypeSalle() {
		return typeSalle;
	}

	public void setTypeSalle(String typeSalle) {
		this.typeSalle = typeSalle;
	}

	public List<SalleDto> getSalles() {
		return salleDtos;
	}

	public void setSalles(List<SalleDto> salleDtos) {
		this.salleDtos = salleDtos;
	}

}
