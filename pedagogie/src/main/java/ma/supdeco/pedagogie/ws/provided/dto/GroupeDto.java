package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class GroupeDto {

	private String idGroupe;
	private String nomGroupe;
	private List<GroupeAnneeDto> groupeAnneeDtos;

	public GroupeDto() {
		super();
	}

	public GroupeDto(String idGroupe, String nomGroupe, List<GroupeAnneeDto> groupeAnneeDtos) {
		super();
		this.idGroupe = idGroupe;
		this.nomGroupe = nomGroupe;
		this.groupeAnneeDtos = groupeAnneeDtos;
	}

	public String getIdGroupe() {
		return idGroupe;
	}

	public void setIdGroupe(String idGroupe) {
		this.idGroupe = idGroupe;
	}

	public String getNomGroupe() {
		return nomGroupe;
	}

	public void setNomGroupe(String nomGroupe) {
		this.nomGroupe = nomGroupe;
	}

	public List<GroupeAnneeDto> getGroupeAnnees() {
		return groupeAnneeDtos;
	}

	public void setGroupeAnnees(List<GroupeAnneeDto> groupeAnneeDtos) {
		this.groupeAnneeDtos = groupeAnneeDtos;
	}

}
