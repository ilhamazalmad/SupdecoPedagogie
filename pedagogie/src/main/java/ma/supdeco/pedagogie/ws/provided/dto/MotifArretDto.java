package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class MotifArretDto {

	private String idMotif;
	private String motifArret;
	private List<ArretCoursDto> arretsCours;

	public MotifArretDto() {
		super();
	}

	public MotifArretDto(String idMotif, String motifArret, List<ArretCoursDto> arretsCours) {
		super();
		this.idMotif = idMotif;
		this.motifArret = motifArret;
		this.arretsCours = arretsCours;
	}

	public String getIdMotif() {
		return idMotif;
	}

	public void setIdMotif(String idMotif) {
		this.idMotif = idMotif;
	}

	public String getMotifArret() {
		return motifArret;
	}

	public void setMotifArret(String motifArret) {
		this.motifArret = motifArret;
	}

	public List<ArretCoursDto> getArretsCours() {
		return arretsCours;
	}

	public void setArretsCours(List<ArretCoursDto> arretsCours) {
		this.arretsCours = arretsCours;
	}

}
