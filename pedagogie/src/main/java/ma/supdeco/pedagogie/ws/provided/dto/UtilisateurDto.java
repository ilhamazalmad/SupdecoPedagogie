package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class UtilisateurDto extends AuditableDto {

	private String idUtilisateur;
	private String nom;
	private String prenom;
	private String motDePasse;
	private String active;
	private List<RoleDto> roleDtos;

	public UtilisateurDto() {
		super();
	}

	public UtilisateurDto(String idUtilisateur, String nom, String prenom, String motDePasse, String active,
			List<RoleDto> roleDtos) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.motDePasse = motDePasse;
		this.active = active;
		this.roleDtos = roleDtos;
	}

	public String getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(String idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String isActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public List<RoleDto> getRoles() {
		return roleDtos;
	}

	public void setRoles(List<RoleDto> roleDtos) {
		this.roleDtos = roleDtos;
	}

}
