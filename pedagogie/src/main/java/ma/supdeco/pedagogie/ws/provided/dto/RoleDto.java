package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class RoleDto {

	private String idRole;
	private String role;
	private List<UtilisateurDto> utilisateurDtos;

	public RoleDto() {
		super();
	}

	public RoleDto(String idRole, String role) {
		super();
		this.idRole = idRole;
		this.role = role;
	}

	public RoleDto(String idRole, String role, List<UtilisateurDto> utilisateurDtos) {
		super();
		this.idRole = idRole;
		this.role = role;
		this.utilisateurDtos = utilisateurDtos;
	}

	public String getIdRole() {
		return idRole;
	}

	public void setIdRole(String idRole) {
		this.idRole = idRole;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<UtilisateurDto> getUtilisateurs() {
		return utilisateurDtos;
	}

	public void setUtilisateurs(List<UtilisateurDto> utilisateurDtos) {
		this.utilisateurDtos = utilisateurDtos;
	}

}
