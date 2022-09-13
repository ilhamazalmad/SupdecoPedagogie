package ma.supdeco.pedagogie.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "role")
@SQLDelete(sql = "UPDATE role SET deleted = true WHERE idRole=?")
@Where(clause = "deleted=false")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idRole;
	private String role;

	@ManyToMany
	@JoinTable(name = "roleUtilisateur", joinColumns = @JoinColumn(name = "idRole"), inverseJoinColumns = @JoinColumn(name = "idUtilisateur"))
	private List<Utilisateur> utilisateurs = new ArrayList<>();

	private boolean deleted = Boolean.FALSE;

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

	public Role(Long idRole, String role, List<Utilisateur> utilisateurs, boolean deleted) {
		super();
		this.idRole = idRole;
		this.role = role;
		this.utilisateurs = utilisateurs;
		this.deleted = deleted;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
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
