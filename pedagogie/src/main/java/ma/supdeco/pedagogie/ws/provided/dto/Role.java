package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class Role {

private Long idRole;
	private String role;
private List<Utilisateur> utilisateurs;

	public Role() {
		super();
	}

	public Role(Long idRole, String role) {
		super();
		this.idRole = idRole;
		this.role = role;
	}

	public Role(Long idRole, String role, List<Utilisateur> utilisateurs) {
		super();
		this.idRole = idRole;
		this.role = role;
		this.utilisateurs = utilisateurs;
	}

	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

}
